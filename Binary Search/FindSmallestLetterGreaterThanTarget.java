class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int index=getIndex( letters,target);
       return letters[index];
    }
    
    public int getIndex(char[] arr, char target){
        
        int low=0;
        int high=arr.length-1;
        
     
        while(low<=high){
            
            int mid =low+(high-low)/2;
            int targetVal=target-'0';
            int midVal=arr[mid] - '0';
             if(targetVal>=arr[arr.length-1] - '0'){
                 return 0;
             }
            if(targetVal>midVal){
                low=mid+1;
            }else if(targetVal<midVal){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
}
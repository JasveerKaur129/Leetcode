class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character, Integer>,ArrayList<String>> bmap =new HashMap<>();
        
        for(String st:strs){
            
            HashMap<Character, Integer> fmap=new HashMap<>();
            
            for(int i=0;i<st.length();i++){
                
                char ch=st.charAt(i);
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }
            
            if(!bmap.containsKey(fmap)){
                
                ArrayList<String> list=new ArrayList<>();
                list.add(st);
                
                bmap.put(fmap,list);
                
            }else{
                ArrayList<String> list=bmap.get(fmap);
                list.add(st);
                bmap.put(fmap,list);
            }
        }
        
        List<List<String>> res=new ArrayList<>();
        
        for(ArrayList<String> val: bmap.values()){
            
            res.add(val);
        }
        
        return res;
    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        
        //if there is obstacle at top left corner
        
        if(obstacleGrid[0][0]==1) return 0;
        
        dp[0][0]=1;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
              //for top row
                if(i==0 && j>0){
                    if(obstacleGrid[i][j]==0){
                        dp[i][j]=dp[0][j-1];
                    }else{
                        dp[i][j]=0;
                    }
                }else if(j==0 && i>0){
                    if(obstacleGrid[i][j]==0){
                        dp[i][j]=dp[i-1][0];
                    }else{
                        dp[i][j]=0;
                    }
                }else if(i>0 && j>0){
                    if(obstacleGrid[i][j]==0){
                         dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }else{
                        dp[i][j]=0;
                    }
                }
            }
        }
        return dp[m-1][n-1];
    }
}

class Solution{
    public int maxWeightCell(int N, int Edge[]){
       int weight[] = new int[N];
       for(int i=0;i<N;i++){
           if(Edge[i]!=-1){
               weight[Edge[i]]+= i;
           }
       }
       int maxWt = -1,maxWtInd=-1;
       
       for(int i=0;i<N;i++){
           if(weight[i]>=maxWt){
               maxWt = weight[i];
               maxWtInd = i;
           }
       }
               
    return maxWtInd;
       
    }
}

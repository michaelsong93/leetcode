class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bools = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
        for(int i = 0; i < candies.length; i++){
            if(candies[i]+extraCandies >= max){
                bools.add(i,true);
            }
            else{
                bools.add(i,false);
            }
        }
        return bools;
        
    }
}
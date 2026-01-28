public class MinimumRecolorToGetK {
    public int minimumRecolors(String blocks, int k) {
        int countWhite =0;
        int minWhite = 0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                countWhite++;
            }
        }
        minWhite = countWhite;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i) == 'W')countWhite++;
            if(blocks.charAt(i-k) == 'W')countWhite--;

            minWhite = Math.min(minWhite, countWhite);
        }
        return minWhite;
    }
}

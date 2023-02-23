package programmers;

public class Num42842 {
    public int[] solution(int brown, int yellow) {
        int yX, yY, bX, bY;
        yX = yY = bX = bY = 0;

        brown = brown + yellow;

        for(yX = 1; yX <= yellow / 2 + 1; yX++){
            bX = yX + 2;
            if((yellow % yX == 0) && (brown % (bX)) == 0) {
                yY = yellow / yX;
                bY = brown / bX;
                if(yY == (bY - 2)){
                    break;
                }
            }
        }

        return new int[] {bY, bX};
    }

}

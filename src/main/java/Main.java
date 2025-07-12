import java.util.*;
import java.lang.String;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] scoreArray = {{85, 70, 90, 95}, {80, 95, 90, 75}, {75, 85, 90, 80}};
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                sum += scoreArray[i][j];
            }
            System.out.println("학생"+(i+1)+":"+Arrays.toString(scoreArray[i])+"평균:"+((double)(sum/scoreArray[i].length)));

        }
    }
}
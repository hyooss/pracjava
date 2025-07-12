import java.util.*;
import java.lang.String;

public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int money=scan.nextInt();
        while(true){
            System.out.println("자판기 시작");
            System.out.println("현재 투입금: "+money);
            System.out.println("1. 콜라 1500원");
            System.out.println("2. 오렌지 주스 2000원");
            System.out.println("3. 생수 1000원");
            System.out.println("4. 종료");
            System.out.println("음료 골라라");
            int choice=scan.nextInt();
            if (choice==1){
                if(money-1500<0){
                    System.out.println("돈을 더 투입하세요");
                    System.out.println("얼마 넣을거");
                    int plus=scan.nextInt();
                    money=money+plus;
                }
                money=money-1500;
            } else if(choice==2){
                if(money-2000<0){
                    System.out.println("돈을 더 투입하세요");
                    System.out.println("얼마 넣을거");
                    int plus=scan.nextInt();
                    money=money+plus;
                }
                money=money-2000;
            } else if(choice==3){
                if(money-1000<0){
                    System.out.println("돈을 더 투입하세요");
                    System.out.println("얼마 넣을거");
                    int plus=scan.nextInt();
                    money=money+plus;
                }
                money=money-1000;
            } else if(choice==4){
                System.out.println("종료합니다");
                return;
            }else {
                System.out.println("다른 번호 선택하세요");
            }

        }
    }
}
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int a = Order.stringTest(10, 40);
        System.out.println(a);


            //1단계
            ArrayList menuList = new ArrayList();

            //2단계 : arraylist에 메뉴들 담기
            menuList.add(new Menu("커피", "카페인이 들어간 음료입니다."));
            menuList.add(new Menu("티", "각종 다양한 티가 있습니다."));
            menuList.add(new Menu("빵", "맛있는 빵이 있습니다."));


            ArrayList coffeeList = new ArrayList();
            coffeeList.add(new Menu("커피1", "카페인이 들어간 음료입니다."));
            coffeeList.add(new Menu("커피2", "각종 다양한 티가 있습니다."));
            coffeeList.add(new Menu("커피3", "맛있는 빵이 있습니다."));

            ArrayList teaList = new ArrayList();
            teaList.add(new Menu("tea1", "카페인이 들어간 음료입니다."));
            teaList.add(new Menu("tea2", "각종 다양한 티가 있습니다."));
            teaList.add(new Menu("tea3", "맛있는 빵이 있습니다."));

            ArrayList breadList = new ArrayList();
            breadList.add(new Menu("bread1", "카페인이 들어간 음료입니다."));
            breadList.add(new Menu("bread2", "각종 다양한 티가 있습니다."));
            breadList.add(new Menu("bread3", "맛있는 빵이 있습니다."));


            // 스캐너 생성
            Scanner scanner = new Scanner(System.in);


            //메뉴 출력


            while (true) {
                Order.outputM(menuList);


                int num1 = scanner.nextInt();
                if (num1 == 1) {
                    Order.outputI(coffeeList,"COFFEE MENU");

                    int num2 = scanner.nextInt();
                    Order.outputChoice(coffeeList,num2);
                } else if (num1 == 2) {
                    Order.outputI(teaList, "TEA MENU");

                    int num2 = scanner.nextInt();

                    Order.outputChoice(teaList,num2);

                } else if (num1 == 3) {
                    Order.outputI(breadList, "BREAD MENU");

                    int num2 = scanner.nextInt();

                    Order.outputChoice(breadList,num2);

                } else if (num1 == 4) {

                    System.out.println("주문");

                } else if (num1 == 5) {

                    System.out.println("취소");

                } else {
                    System.out.println("메인으로");

                }


            }
        }
    }

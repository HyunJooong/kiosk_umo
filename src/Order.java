import java.util.ArrayList;

public class Order {
    // main 출력시
    public static void outputM(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            Menu outputlist = (Menu) list.get(i);
            System.out.println(outputlist.name + outputlist.desc);
        }
    }

    // 1, 2, 3번 입력시 출력
    public static void outputI(ArrayList list, String s) {
        System.out.println("[" + s + "]");
        for (int i = 0; i < list.size(); i++) {
            Menu outputlist = (Menu) list.get(i);
            System.out.println(outputlist.name + outputlist.desc + outputlist.price);
        }
    }

    public static void outputChoice(ArrayList list, int num){

        Menu outputlist = (Menu) list.get(num);
        System.out.println(outputlist.name + outputlist.desc + outputlist.price);
    }


    public static int stringTest(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }

    public static void title(String s) {

    }

}

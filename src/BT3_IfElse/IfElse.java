package BT3_IfElse;

public class IfElse {
    public static void main(String[] args) {

        int a = 4;
        int b = 7;
        int n = 4;

        boolean checkN1 = ((a == n) && (n < b));
        boolean checkN2 = ((a == n) && (n > b));

        String  expectedText = "Giá trị n hợp lệ";
        String actual = "Giá trị n hợp lệ";

        System.out.println(checkN1);
        System.out.println(checkN2);
        System.out.println(expectedText == actual);
    }

}

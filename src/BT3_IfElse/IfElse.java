package BT3_IfElse;

public class IfElse {
    public static void main(String[] args) {

        int number = 100;
        int n = 5;

        boolean checkN1 = ((n == number) || (n < number));
        boolean checkN2 = ((n != number) && (number > n));

        String  expectedText = "Giá trị n hợp lệ";
        String actual = "Giá trị n hợp lệ";

        System.out.println(checkN1);
        System.out.println(checkN2);
        System.out.println(expectedText == actual);
    }

}

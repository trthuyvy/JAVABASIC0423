package BT4_ForVaMAng;

public class VonglapFor {
    public static void main(String[] args) {
        int i;
        int j;
        int mangluusochan[] = new int[50];

        for (i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < mangluusochan.length; j++) {
                    mangluusochan[j] = i;
                }
                System.out.println(mangluusochan [i]);
            }
        }
    }
}

package ch_01;


public class Answer_04 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                System.out.print("\n");
            }
            for (int j = 0; j < 3; j++) {

                if (i == 0) {
                    if (j == 0)
                        System.out.print("a ");
                    if (j == 1)
                        System.out.print("a^2 ");
                    if (j == 2)
                        System.out.print("a^3");

                } else if (i == 1) {
                    System.out.print("1 ");
                } else if (i == 2) {
                    System.out.print(a + " ");
                    a *= 2;

                } else if (i == 3) {
                    System.out.print(b + " ");
                    b *= 3;

                } else {
                    System.out.print(c + " ");
                    c *= 4;

                }


            }


        }

    }


}

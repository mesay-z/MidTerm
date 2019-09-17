package math.problems;

public class Pattern {
    /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
     */
    public static void main(String[] args) {

        int numbers = 0;
        for (int i = 100; i >= 0; i--) {

            if (numbers <= 100) {
                System.out.println(i);
            }
            else {
                for (i = 80; i >= 0; i -= 2) {
                    if (numbers > 10 && numbers <= 20) {
                        System.out.println(i + " ");

                    } else {
                        for (i = 70; i >= 0; i -= 3) {
                            if (numbers > 20 && numbers <= 30) {
                                System.out.println(i + " ");
                            } else {
                                for (i = 40; i >= 0; i -= 4) {
                                    if (numbers > 30 && numbers <= 40) {
                                        System.out.println(i + " ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

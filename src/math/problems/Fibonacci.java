package math.problems;

public class Fibonacci {


         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        static int n1=0,n2=1,n3=0;
        static void info(int count){
            if(count>0){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" "+n3);
                info (count-1);
            }
        }
        public static void main(String args[]){
            int count = 8;
            System.out.print(n1 + " " + n2);
            info(count - 2);
        }
    }


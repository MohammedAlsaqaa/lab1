import java.util.Scanner;

public class Method {
    public static void Output_Method(int []x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            System.out.print("\t");
        }
    }
        public static void input_Method(int []y){
            System.out.println("enter 5 integer numbers");
            Scanner input = new Scanner(System.in);
            for (int i = 0; i <y.length ; i++) {
                y[i] = input.nextInt();
            }
        }
        public static void main(String[] args) {
            int Array []= new int[5];
            input_Method(Array);
            Output_Method(Array);
    }
}

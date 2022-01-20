import java.util.Scanner;

public class InputArrray {
    public static void main(String[] args){
        int array[]=new int[5];
        System.out.println("enter 5 integer numbers");
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print("\t");

        }
    }
}

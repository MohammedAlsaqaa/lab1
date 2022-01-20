import java.util.Scanner;
public class Managemant {
    public static void main(String[] args) {
        Student []team= new Student[3];
        Student s1= new Student(1,"Mohammed");
        team[0]=s1;
        Student s2= new Student(2,"Waled");
       team[1]=s2;
        Student s3= new Student(3,"Ali");
        team[2]=s3;

        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }


    }
        }




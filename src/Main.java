import Services.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("...............Student Record Management System...............");
        System.out.println("Follow the instruction:");
        System.out.println("press '0' to exit");
        System.out.println("press '1' to add new student");
        System.out.println("press '2' to view all student");
        System.out.println("press '3' to delete student");
        System.out.println("press '4' to update student");
        System.out.println("press '5' to view single student");

        StudentService studentService = new StudentService();

        while(true){
            System.out.print("Enter option: ");
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if(opt==0) return;
            else if(opt==1) studentService.saveStudent();
            else if (opt==2) studentService.getAllStudent();
            else if (opt==3) studentService.deleteStudent();
            else if (opt==4) studentService.updateStudent();
            else if (opt==5) studentService.printStudent();

            System.out.println("");

        }



    }
}
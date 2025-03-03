package StudentManagementSystem;

import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course:");
                    String course = sc.nextLine();

                    manager.addStudent(name,id,age,course);
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID:");
                    int stdid = sc.nextInt();
                    manager.searchStudent(stdid);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int studid = sc.nextInt();
                    manager.removeStudent(studid);
                    break;

                case 5:
                    System.out.println("Exiting!!");
                    sc.close();
                    return;

                default:
                    System.out.println("invalid input!!");
            }
        }

    }

}

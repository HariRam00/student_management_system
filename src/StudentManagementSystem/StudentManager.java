package StudentManagementSystem;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students ;

    public StudentManager(){
        students = new ArrayList<>();
    }

    public void addStudent(String Name, int Studentid, int Age, String Course){
        students.add(new Student(Name,Studentid,Age,Course));
        System.out.println("Student added successfully!!");
    }

    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No Students are found!!");
            return;
        }
        System.out.println("List of Students :");
        for (Student s : students){
            s.viewStudent();
        }

    }

    public void searchStudent(int Studentid){
        for(Student s: students){
            if(s.getStudentid()== Studentid){
                s.viewStudent();
                return;
            }
        }
        System.out.println("studentid"+Studentid+"not found");
    }

    public void removeStudent(int Studentid){
        for(Student s: students){
            if(s.getStudentid()==Studentid){
                students.remove(s);
                System.out.println("Student with ID "+Studentid+"removed successfully!!");
                return;
            }
        }
        System.out.println("student with ID"+Studentid+"is not found");
    }

}

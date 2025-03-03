package StudentManagementSystem;

public class Student {
    private String Name;
    private int Studentid;
    private int Age;
    private String Course;

    public Student(String Name, int Studentid, int Age, String Course){
        this.Name=Name;
        this.Studentid=Studentid;
        this.Age=Age;
        this.Course=Course;
    }

    public String getName() {
        return Name;
    }

    public int getStudentid() {
        return Studentid;
    }

    public int getAge() {
        return Age;
    }

    public String getCourse() {
        return Course;
    }

    public void viewStudent(){
        System.out.println("Name :"+Name+"  ID : "+Studentid+"  Age : "+Age+"  Course : "+Course);

    }
}

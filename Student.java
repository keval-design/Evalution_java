public class Student {
    private String name;
    private int rollno;
    private double marks;

    public void student(String name,int rollono,double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public void printdetalis(String name,int rollono,double marks){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(marks);
    }

}

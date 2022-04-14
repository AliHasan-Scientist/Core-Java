package OPP;


/**
 * copyConstructor
 */
// Studen Class 
class Student{
    public Student(){

    }
    String studenName;
    Byte age;
    public  Student(Student s2){
studenName=s2.studenName;
age =s2.age;
    }
    public void info() {
        System.out.println(studenName);
        System.out.println(age);
    }
}
public class copyConstructor {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.studenName="Ali";
        s1.age=19;
        Student s2=new Student(s1);
        s2.info();
        
    }
}
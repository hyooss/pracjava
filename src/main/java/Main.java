class Person{
    public void introduce(){
        System.out.println("난 학싱");
    }
}

class Student extends Person{
    public void introduce(){
        System.out.println("대 1");
    }
}
public class Main{
    public static void main(String[] args){
        Person person=new Person();
        Student student=new Student();
        person.introduce();
        student.introduce();
    }
}
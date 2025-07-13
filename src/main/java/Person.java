import java.lang.String;

public class Person{
    String Name;
    int Age;

   public Person(){
       this.displayInfo();
   }

   public Person(String Name,int Age){
       this.Name=Name;
       this.Age=Age;
       System.out.println("이름: "+Name);
       System.out.println("나이: "+Age);
   }

   public void displayInfo(){
       System.out.println("이름: "+Name);
       System.out.println("나이: "+Age);
   }

   public String getName(){
       return Name;
   }

   public int getAge(){
       return Age;
   }

    public void setAge(int Age){
        this.Age=Age;
    }

    public void setName(String Name){
       this.Name=Name;
    }
}


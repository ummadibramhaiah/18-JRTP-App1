
class Student{
   int rollno;
   String name;
   int age;
   //param constructor
     Student(int r, String n, int a){
        rollno=r;
        name=n;
        age=a;
     }
  //copy constructor
     Student(Student s){
        rollno=s.rollno;
        name=s.name;
        age=s.age;
     }
  //method
     void data(){
       System.out.println(rollno+" "+name+" "+age);
     }
  public static void main(String[] args){
      Student s1 = new Student(111,"Shiva",55);
      Student s2 = new Student(s1);
      s1.data();
      s2.data();
  }
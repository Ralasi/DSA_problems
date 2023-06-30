class Person
{
  String name;
  int age;
  Person(String name,int age)
  {
    this.name=name;
    this.age=age;
  }
}

class Student6 extends Person
{
  int roll;
  String course;
  float marks;
  Student6(String name,int age,int roll,String course,float marks)
  {
    super(name,age);
    this.roll=roll;
    this.course=course;
    this.marks=marks;
}
void display() 
{
  System.out.println("Name: "+name+"\nAge: "+age+"\nRoll: "+roll+"\nCourse: "+course+"\nMarks: "+marks);
}
}

class Teacher extends Person
{
   String subject_assigned;
   int contact_hour;
   Teacher(String name,int age,String subject_assigned,int contact_hour)
   {
     super(name,age);
     this.subject_assigned=subject_assigned;
     this.contact_hour=contact_hour;
}
void display() 
{
   System.out.println("Name "+name+"\nAge "+age+"\nSubject Assigned "+subject_assigned+"\ncontact_hour "+contact_hour);
}
}
public class PROG5 
{

	public static void main(String[] args) 
	{
		Student6 s=new Student6("Ralasi",19,33,"DSA",99);
		s.display();
		System.out.println();
		Teacher t=new Teacher("Ajit",40,"UPM",8);
		t.display();

	}

}

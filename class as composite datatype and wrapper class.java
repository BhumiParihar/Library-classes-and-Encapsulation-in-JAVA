/*LIBRARY CLASSES : these are the pre compiled classes of JAVA
CLASS AS COMPOSITE Datatype: composite Datatype refers to a datatype,created and customised by user ,by combining primitive datatypes and other composite datatypes.*/
class Student
{
    int age;
    String name;
    Student(int a, String n) // constructor
    {
        age=a;
        name=n;
    }
    void show() //to display the age and name
    {
        System.out.println(name+"\t"+age);
    }
    public static void main(String[] arrgs)
    {
        Student s1=new Student(18,"ABC");
        Student s2=new Student(17,"CDE");
        Student s3=new Student(16,"EFG");
        Student s4=new Student(15,"GHI");
        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}
/* Primitive datatype are always copied by value where as composite datatype is always copied by reference.*/
class Number
{
    int a,b; // Data Members
    Number(int c,int d) // constructor
    {
        a=c;
        b=d;
    }
    void show() //Member functions to display the value of a and b
    {
        System.out.println(a+"\t"+b);
    }
    public static void main(String[] args)
    {
        Number n1,n2;
        n1=new Number(2,3); // object is created
        n1.show();
        n2=n1;
        n2.a=4;
        n2.b=5;
        n1.show();
    }
}
/* WRAPPER CLASS: It is a class whose object wraps or contains primitive datatype. All wrapper classes belongs to the dafault "java.lang" package and therefore,it is not needed to import.All the wrapper classes are defined final and thus designers prevent them from inheritance.An abstract class is a superclass that cannot be instantiated and is used to state or define general characteristics.
We can create an object from wrapper class as follows:
(Wrapper class) Integer (object) i=new (constructor) Integer(2344);  
Except character wrapper class,all other wrapper class objects can be initialised with a String .However the value that is being passed should be compatible to the datatype.For example:
Integer i=new Integer("12.3");
will raise an NumberFormatException. */
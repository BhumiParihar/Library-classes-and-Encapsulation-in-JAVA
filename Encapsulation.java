/***ENCAPSULATION**
Encapsulation is defined as wrapping up of data and information under a single unit. Encapsulation can be used to hide data members and member functions.
Encapsulation in general refers to the act of enclosing related small components to make a larger component. The main objective to represent the components in this manner is to hide the background details and giving a simple interface.
In Java a class is a method to implement encapsulation. A class contains:
Instance variables: To hold certain data.
Methods: Functions to manipulate the stored data.

Both instance variables and methods as well as a class contains access specifiers to make it visible from outside or not visible from outside.*/

/* Java's Access specifiers: Access specifiers are keywords which are used to declare which entity cannot be accessed from any where.
Java offers four access specifiers, listed below in decreasing order of accessibility:
->public: It allows a global access, i.e. it allows members to be accessed by other classes or sub-classesin the same package or classes or subclasses in a different package.
->protected: it allows accessibility within the same package by both classes and sub-classes but only by sub-classes in a different package.
->default/friendly: it allows the accessibility in the same package only.
->private: It allows limited access. It allows accessibility within the same class only, but not by other classes or sub-classes in the same package or different package.*/

/***ACCESS SPECIFIERS IN CONSTRUCTORS***/
class Access 
{
    private int a,b;
    //a and b will have access only within the Access class.
    private Acess(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println(a+" "+b);
    }
    static void createObject()
    {
        Access obj=new Access(5,6);
        //perfectly valid as it is in the same class.
        obj.show();
    }
}
public class Main 
{
    public static void main(String args[])
    {
        //Access obj=new Access(5,6); error constructor has private access specifier.
        Access.createObject();
    }
}
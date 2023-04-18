/* Inheritance is a mechanism wherein a new class is derived from an existing class. The class which is being in being inherited is called superclass or baseclass and the class which inherits the properties is called subclass or derived class.The derived class can inherit the property of superclass or baseclass by using the keyword "extends".
Program to demonstrate Inheritance*/
class superclass
{
    int a,b;
    void getval(int x,int y)
    {
        a=x;
        b=y;
    }
}
public class subclass extends superclass
{
    int c;
    void getval2(int x,int y,int z)
    {
        a=x; // inherited from superclass
        b=y; // inherited from superclass
        c=z;
    }
}
/* protected members can be accessed by classes and subclasses inside the same package and subclasses in different package.
If a member is made private then it can not be accessed by subclass , while protected members are accessed can be accessed .Even if the superclass is in different package,still protected members are visible in the subclass.
Program to show how different access specifiers of the superclass are visible in the subclass.*/
class superclass
{
    int a;
    private int b;
    protected int c;
    public int d;
    void getval3(int x,int y,int z,int p)
    {
        a=x;
        b=y;
        c=z;
        d=p;
    }
}
public class subclass extends superclass
{
    int e;
    void getval2(int x,int y,int z,int p,int q)
    {
        a=x; // OK because default access is visible.
        b=y; // Error because private member is not accessible
        c=z; // OK as protected is accessible
        d=p; // OK as publis is accessible
        e=q; // OK as it is its own member
    }
    static void getval3(int x,int y,int z,int p,int q)
    {
        subclass obj=new subclass();
        obj.a=x; // OK because default access is visible.
        obj.b=y; // Error because private member is not accessible
        obj.c=z; // OK as protected is accessible
        obj.d=p; // OK as publis is accessible
        obj.e=q; // OK as it is its own member
    }
}
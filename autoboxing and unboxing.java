/***AUTOBOXING AND UNBOXING IN JAVA**
Autoboxing: Converting a primitve value into an object of the corresponding wrapper class is called autoboxing.
The Java compiler applies autoboxing when a primitve value is:
-> Assigned to a variable of the corresponding wrapper class.
-> Passed as a parameter to a method that expects an object of the corresponding wrapper class.*/

class AutoBoxingInFuncyionsx
{
    static void pass(Integer iob)
    {
        System.out.println(iob);
    }
    static void call()
    {
        int a=12;
        pass(a);
    }
}

/*
Unboxing: Converting an object of a wrapper type to its corresponding primtive value is called unboxing.
The Java compiler applies unboxing when an object of a wrapper class is:
-> Assigned to a variable of the corresponding primitive type.
-> Passed as a parameter to a method that expects a value of the corresponding primitive type.*/

class UnBoxingInFuncyionsx
{
    static void pass(int i)
    {
        System.out.println(i);
    }
    static void call()
    {
        Integer a=new Integer(12);
        pass(a);
    }
}

/***ADVANTAGES OF AUTOBOXING/UNBOXING**
-> Autoboxing and Unboxing lets developer write cleaner code, making it easier to read.
-> The technique let us use primitive types and Wrapper class objects interchangeably and we do not need to perform any typecasting explicitly.*/

/* some wrapper classes:
-> Two interesting symbolic constants named MAX_VALUE and MIN_VALUE are associated with Numeric wrapper class objects to determine the maximum value and minimum value respectively a wrapper class object can hold.
-> The numeric wrapper class method parse...() method is used to convert a String to a primitive type data.
-> The wrapper class method toString() is used to convert from wrapper class object to a String.
-> The isLetter() method of the Character wrapper class returns true if the argument is an alphabet, false otherwise.
-> The isDigit() method of the Character wrapper class returns true if the argument is a digit, false otherwise.
-> The isLetterOrDigit() method of the Character wrapper class returns true if the argument is an alphabet or a digit, false otherwise.
-> The isLowerCase() method of the Character wrapper class returns true if the argument is in lower case character, false otherwise.
-> The isUpperCase() method of the Character wrapper class returns true if the argument is in upper case character, false otherwise.
-> The isWhiteCase() method of the Character wrapper class returns true if the argument is a space,tab or a new-line character, false otherwise.
-> The toUpperCase() method of the Character wrapper class returns upper case equivalent of the passed argument.
-> The toLowerCase() method of the Character wrapper class returns lower case equivalent of the passed argument.*/

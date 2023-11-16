package myjavahomework4;

public class NonStaticAndStaticMethod {
    static void myMethod1() {
        System.out.println("My First Method");
    }

    void myMethod2() {
        System.out.println("My Second Method");

    }
        public static void main (String[]args){
        myMethod1();
        NonStaticAndStaticMethod obj = new NonStaticAndStaticMethod();
           obj.myMethod2();


        }
    }


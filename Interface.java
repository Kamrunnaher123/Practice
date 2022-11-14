import java.util.*;
   interface A{
    public void DisplayA();
}
interface B{
    public void DisplayB();
}
 class ClassA implements A{
    public void first(){
        System.out.println("classA 1st");
    }
    public void second(){
        System.out.println("classA 2nd");
    }
    public void DisplayA(){
        System.out.println("EEE");
    }
}
class ClassB extends ClassA implements A,B{
    public void first(int my){
        System.out.println("classB 1st"+my);
    }
    public void second(){
        System.out.println("classB 2nd");
    }
    public void DisplayB(){
        System.out.println("CSE");
    }
}
class ClassC extends ClassA{
    public void first(){
        System.out.println("classC 1st");
    }
}
class Interface{
    public static void main(String[] args) {
        ClassA objA=new ClassA();
        objA.first();
        objA.DisplayA();
        ClassB objB=new ClassB();
        objB.first();
        objB.second();
    }
}

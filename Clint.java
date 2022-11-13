import java.util.Scanner;

interface Clint{
     void input();// bydefault public+abstract
 void output();// bydefault public+abstract
}
class kona implements Clint
{
    String name; int sal;
    public void input()
    {
        Scanner r=new Scanner(System.in);
        Scanner k=new Scanner(System.in);
        System.out.println("Enter username : ");
        name=r.nextLine();
        System.out.println("Enter salary: ");
        sal=k.nextLine();
    }
    public void output()
    {
        System.out.println(name+" "+sal);
    }
     public static void main(String[] args) {
        
        Clint c=new kona();
        c.input();

    }
}

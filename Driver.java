public class Driver {
    public static void main(String args[]){
        /*  Rectangular rect=new Rectangular();
        Circle circle=new Circle();
        System.out.println("Area of Rectangular : "+rect.compute(52.2f, 40.0f));
        System.out.println("Area of Circle :"+Circle.compute(10.5f,63.0f));
        */

        Account account=new Account();
        account.show_data();
        account.setInput(101, 10502.65);
        account.show_data();
        account.deposit(500.5);
        account.show_data();
        
    }
}

import java.util.Scanner;
class Businessman {
    private float si;
    private float p;
    private float t;
    static private float r;
    static {
        r = 15.2f;
    }
    public void acceptance(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        si = scan.nextInt();
        System.out.println("Enter the tenure");
        t=scan.nextInt();
    }
    public void calcInterest() {
        si=(p*t*r)/100;
        public void disp(){
            System.out.println(si);
        }
    }
    public class Demo {
        public static void main(Strings[] args) {
            Businessman b1 = new Businessman();
            b1.acceptInput();
            b1.calcInterest();
            b1.disp();

            Businesssman b2 = new Businessman();
            b2.accepInput();
            b2.calcInterest();
            b2.disp();

            Businessman b3 = new Businessman();
            b3,accepInput();
            b3.calcInterest();
            b3.disp();
        }
    }

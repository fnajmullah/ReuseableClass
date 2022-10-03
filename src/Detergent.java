import sun.misc.Cleaner;

public class Detergent extends Cleanser{
    public void scrub(){
        append("Detergent.scrub");
        super.scrub();

    }
    public void foam(){
        System.out.println("append(foam())");
    }

    public static void main(String[] args) {
        Detergent x= new Detergent();
//        x.dilute();
//        x.scrub();
        x.foam();
//        System.out.println(x);
//        System.out.println("testing base class");
//        Cleanser.main(args);

//        Cleanser c= new Cleanser();
//        c.dilute();
    }

}

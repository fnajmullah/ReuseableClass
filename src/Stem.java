public class Stem  extends Root{
    Stem(String n){
        super("hhhhhhhh");
        System.out.println("stem derived the root constructor.");
    }
    public void dispose(){
        System.out.println("Erasing Stem");
        super.dispose();
    }

    public static void main(String[] args) {
        Component1 c1=new Component1("h");
        Component2 c2= new Component2("a");
        Component3 c3= new Component3("n");
        Stem s= new Stem("Fr");
        s.dispose();

    }
}

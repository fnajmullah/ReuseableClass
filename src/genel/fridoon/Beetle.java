package genel.fridoon;

public class Beetle extends Insect{
    private int k=printInit("Beetle.initialized");
    public Beetle(){
        System.out.println("k"+k);
        System.out.println("j"+j);
    }
    private static int x2=printInit("static beetle x2 initialized");

    public static void main(String[] args) {
        System.out.println("beetle constructor");
        Beetle b= new Beetle();
    }
}

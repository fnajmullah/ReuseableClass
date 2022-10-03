package genel.fridoon;

public class Frog extends Amphibian{
    public static void main(String[] args) {
        Frog frog= new Frog();
//        Amphibian.amphy(frog);
        frog.amphy();
    }
    public void amphy(){
        System.out.println("based class override amphy");
    }
}

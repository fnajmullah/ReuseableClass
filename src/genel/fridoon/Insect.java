package genel.fridoon;

public class Insect {
    private int i=9;
    protected int j;
    Insect(){
        System.out.println("i="+i+" j"+j);
        j=45;
    }
    private static int x1=
            printInit("static insec.x1 intialiasxed");
    static int printInit(String s){
        System.out.println(s);
        return 46;
    }
}

package genel.fridoon;

public class FirstClass {
   private String ss;
    FirstClass(){
        System.out.println("FirstClass Constructor is called!!!");
        ss="Constructed";
    }
    public String toString(){
        return ss;
    }

    public String toString(int i){
        return "tostringi";
    }
    public String toString(char c){
        return "char.tostring";
    }
    public String toString(float f){
        return "asdf";
    }

}

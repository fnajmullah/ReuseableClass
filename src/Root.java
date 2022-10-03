public class Root{
    Root(String name){
        System.out.println("Root construcotr");
    }
    Component1 c1=new Component1("ahmad");
    Component2 c2= new Component2("fridoon");
    Component3 c3= new Component3("najeeb");

    public void dispose(){
//        super.dispose();
        System.out.println("dispose root");
    }
}

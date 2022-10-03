public class ProductionCompanies extends Detergent{
    public void scrub(){
        System.out.println("Override the scrub method");
    }

    public void sterilize(){
        System.out.println("Sterilized method");
    }

    public static void main(String[] args) {
        ProductionCompanies pc=new ProductionCompanies();
        pc.scrub();
    }
}

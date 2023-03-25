public class company1 {
    String brandName;
    company1 (){
        brandName = "Apple";
    }

    public static void main(String[] args) {
        company1 c = new company1();
        System.out.println(c.brandName);
    }
}


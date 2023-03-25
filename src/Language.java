public class Language {
    String Languages;

    Language(String a) {
        Languages = a;
        System.out.println(Languages + " is Language  ");

    }

    public static void main(String[] args) {
        Language l = new Language("Sinhala");
        Language l1 = new Language("English");
        Language l2 = new Language("Tamil");


    }
}

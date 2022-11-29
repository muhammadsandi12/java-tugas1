public class Biodata{
    String firstName = "M Sandi";
    String lastName ="Maulana Y";
    String birthPlace = "Bogor";
    String birthYear = "1999";


    public static void main(String[] args) throws Exception{
        Biodata bio = new Biodata(); 
        System.out.println(bio.firstName);
        System.out.println(bio.lastName);
        System.out.println(bio.birthPlace);
        System.out.println(bio.birthYear);
    }
}
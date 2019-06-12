import java.util.Arrays;

public class Merkkijonot {

    public Merkkijonot(){

    }
    public boolean onkoPalindromi(String sana){
        return sana.equals(new StringBuilder(sana).reverse().toString());
    }
    public boolean onkoAnagrammi (String ekasana, String tokasana){
        char[] sana1 = ekasana.replaceAll("[\\s]", "").toCharArray();
        char[] sana2 = tokasana.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(sana1);
        Arrays.sort(sana2);
        return Arrays.equals(sana1, sana2);
    }
    public String generoiKontinKieleen(String sana){
        StringBuilder kontiksi = new StringBuilder();
        kontiksi.append("kontti");
        return null;
    }
}

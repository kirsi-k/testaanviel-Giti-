import java.util.Arrays;

public class Merkkijonot {

    public Merkkijonot() {

    }

    public boolean onkoPalindromi(String sana) {
        return sana.equals(new StringBuilder(sana).reverse().toString());
    }

    public boolean onkoAnagrammi(String ekasana, String tokasana) {
        char[] sana1 = ekasana.toCharArray();
        char[] sana2 = tokasana.toCharArray();
        Arrays.sort(sana1);
        Arrays.sort(sana2);
        return Arrays.equals(sana1, sana2);
    }
}

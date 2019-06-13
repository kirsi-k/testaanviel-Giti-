import org.junit.Test;

import static org.junit.Assert.*;

public class MerkkijonotTest {

    Merkkijonot m = new Merkkijonot();

    @Test
    public void TestaaOnkoSanaPalindromi() {
        String alkuperainenSana = "saippuakauppias";
        boolean tulos = true;
        boolean palindromi = m.onkoPalindromi(alkuperainenSana);
        assertEquals(tulos, palindromi);
    }

    @Test
    public void TestaaOnkoSanaAnagrammi() {
        String ekasana = "lista";
        String tokasana = "silta";
        boolean tulos = true;
        boolean anagrammi = m.onkoAnagrammi(ekasana, tokasana);
        assertEquals(tulos, anagrammi);
    }
}
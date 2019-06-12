import org.junit.Test;

import static org.junit.Assert.*;

public class MerkkijonotTest {

    @Test
    public void TestaaOnkoSanaPalindromi() {
        Merkkijonot m = new Merkkijonot();
        String alkuperainenSana = "saippuakauppias";
        boolean tulos = true;
        boolean palindromi = m.onkoPalindromi(alkuperainenSana);
        assertEquals(tulos, palindromi);
    }
    @Test
    public void TestaaOnkoSanaAnagrammi(){
        Merkkijonot m = new Merkkijonot();
        String ekasana = "lista";
        String tokasana = "silta";
        boolean tulos = true;
        boolean anagrammi = m.onkoAnagrammi(ekasana, tokasana);
        assertEquals(tulos, anagrammi);
    }
    @Test
    public void TestaaToimiikoKontinKieli(){
        Merkkijonot m = new Merkkijonot();
        String sana = "yksi";
        String konttisana = m.generoiKontinKieleen(sana);
        String tulos = "koksi yntti";
        assertEquals(tulos, konttisana);
    }
}
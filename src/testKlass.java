import org.junit.Test;
import static org.junit.Assert.*;

public class testKlass {

    @Test
    public void testRäknaTecken() {
        logikKlass logik = new logikKlass();
        String text = "Hej\nJag heter inte Staffan\nMen däremot heter jag Ismail";
        int förväntatTecken = 53;
        int actualTecken = logik.räknaTecken(text);
        assertEquals(förväntatTecken, actualTecken);
    }

    @Test
    public void testRäknaRader() {
        logikKlass logik = new logikKlass();
        String text = "Hej\nJag heter inte Staffan\nMen däremot heter jag Ismail";
        int förväntatRader = 3;
        int actualRader = logik.räknaRader(text);
        assertEquals(förväntatRader, actualRader);
    }

    @Test
    public void testStop() {
        String text = "Hej\nJag heter inte Staffan\nMen däremot heter jag Ismail ;)\nstop";
        assertTrue(text.contains("stop"));
    }
}

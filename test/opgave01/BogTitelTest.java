package opgave01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class BogTitelTest {

    @Test
    void etKoeb_automatiskIndkoeb() {
        // OBS: Bemærk specifikation af indkøber


        // Arrange
        BogTitel bogTitel = new BogTitel("Således talte Zarathrusta", 6);
        Kunde kunde = new Kunde("Jens Jensen");
        Indkøber indkøber = new Indkøber("Ib inkøbersen");
        bogTitel.addObserver(indkøber);

        // Act
        bogTitel.etKoeb(kunde);

        //Assert
        assertEquals(15,bogTitel.getAntal());
    }
}
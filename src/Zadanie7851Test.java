import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Zadanie7851Test {
// testy:
    // rozny rozmiar tablic
    // rozne elementy na 1 pozycji
    // rozne elementy na losowej pozycji
    // rozne elementy na ostatniej pozycji
    // takie same tablice
    // dwie puste tablice
    // jeden element jest pusty

    @Test
    void areArraysTheSame_whenArraysHaveDifferentSize_returnsFalse() {
        //given
        String[] arrayOne = {"Ola", "miś"};
        String[] arrayTwo = {"Ola", "miś", "kosa"};
        //when
        boolean areArraysTheSame = Zadanie7851.areArraysTheSame(arrayOne, arrayTwo);
        //then
        assertFalse(areArraysTheSame);
    }

    @Test
    void areArraysTheSame_whenArraysHaveDirrefentFirst_returnsTrue() {
        String[] arrayOne = {"Ola", "miś"};
        String[] arrayTwo = {"Ola", "miś"};

    }
}

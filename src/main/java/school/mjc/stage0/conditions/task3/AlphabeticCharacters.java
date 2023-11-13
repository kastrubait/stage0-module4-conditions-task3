package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int symbolCode = (int) character;
        if (( symbolCode >= 97 && symbolCode <= 122) ||
                (symbolCode >= 65 && symbolCode <= 90)) {
            if (symbolCode == 65 ||
                symbolCode == 69 ||
                symbolCode == 73 ||
                symbolCode == 79 ||
                symbolCode == 85 ||
                symbolCode == 89 ||
                symbolCode == 97 ||
                symbolCode == 101 ||
                symbolCode == 105 ||
                symbolCode == 111 ||
                symbolCode == 117 ||
                symbolCode == 121) {
                System.out.println("Vowel");
            }
            System.out.println( "Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}

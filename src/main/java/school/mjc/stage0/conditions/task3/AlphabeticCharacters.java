package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        //int symbolCode = (int) character;
        if (( character >= 'a' && character <= 'z') ||
                (character >= 'A' && character <= 'Z')) {
            if (character == 'a' ||
                character == 'e' ||
                character == 'i' ||
                character == 'o' ||
                character == 'u' ||
                character == 'y' ||
                character == 'A' ||
                character == 'E' ||
                character == 'I' ||
                character == 'O' ||
                character == 'U' ||
                character == 'Y') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}

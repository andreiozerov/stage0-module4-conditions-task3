package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int letter = Character.getNumericValue(Character.toUpperCase(character));

        if (letter < 10 || letter > 35) {
            System.out.println("wrong alphabet!");
        } else {
            if (letter == 10
                    || letter == 14
                    || letter == 18
                    || letter == 24
                    || letter == 30
                    || letter == 34) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}

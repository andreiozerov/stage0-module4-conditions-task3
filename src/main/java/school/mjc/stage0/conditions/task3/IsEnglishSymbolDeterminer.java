package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int letter = Character.getNumericValue(Character.toUpperCase(symbol));
        if (letter >= 10 && letter <= 35) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}

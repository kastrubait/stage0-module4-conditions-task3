package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int symbolCode = (int) symbol;
        if (( symbolCode >= 97 && symbolCode <= 122) ||
            (symbolCode >= 65 && symbolCode <= 90)) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}

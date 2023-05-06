package ua.lviv.iot.algo.part1.lab5;
public class TextCleaner {
    public static final String HARMFULLLINKS =
            "(?i)(http://www.)([a-zA-Z0-9]*)"
                    + "(xxx|charmes|hacking|crack)([a-zA-Z0-9]*)(.com)";

    public static final String FORDELETEDLINK = "*link deleted*";
    public String textUrlCleaning(final String textToClean) {
        return textToClean.replaceAll(HARMFULLLINKS, FORDELETEDLINK);
    }
    /*public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        TextCleaner textCleaner = new TextCleaner();
        input = textCleaner.textUrlCleaning(input);
        System.out.println(input);
    }*/
}

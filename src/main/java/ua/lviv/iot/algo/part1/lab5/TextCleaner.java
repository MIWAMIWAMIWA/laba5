package ua.lviv.iot.algo.part1.lab5;
public class TextCleaner {
    public static final String HARMFULLLINKS =
            "(?i)(http://www.)([a-zA-Z0-9]*)(xxx|charmes|hacking|crack)([a-zA-Z0-9]*)(.com)";

    public static final String FORDELETEDLINK = "*link deleted*";
    public String textUrlCleaning(final String textToClean) {
        return textToClean.replaceAll(HARMFULLLINKS, FORDELETEDLINK);
    }
    public static void main(String[] args) {
        String miwa = "gr3pnklgrnhttp://www.feg4xxxgr4fJ.com-" +
                "grsfgfsggnerjngfknggmrwwwgrggr" +
                "http://www.g35GcharmesfgrF.comwgkl_rfr" +
                "grngerk -http://www.4ghackINGt4fb.com-fewfgwgwr " +
                "fwkrnlgejeg-http://www.gddgcRACKgrgrsg.com";
        TextCleaner textCleaner = new TextCleaner();
        miwa = textCleaner.textUrlCleaning(miwa);
        System.out.println(miwa);
    }
}

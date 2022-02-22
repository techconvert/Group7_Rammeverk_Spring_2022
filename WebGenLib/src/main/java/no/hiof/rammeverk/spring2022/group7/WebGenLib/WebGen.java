package no.hiof.rammeverk.spring2022.group7.WebGenLib;

public class WebGen {
    private int test;

    public WebGen() {
        test = 10;
    }

    public int getTest() {
        return test;
    }

    public void generateHtmlPage() {
        System.out.println("The library generated an HTML page.");
    }
}

package no.hiof.rammeverk.spring2022.group7.WebGenLib;

public class Element {
    String tag;

    String text;

    protected Element() {
        
    }

    protected Element(String tag) {
        this.tag = tag;
    }

    public static Element create(String typeOfElement) {
        return new Element(typeOfElement);


    private Element() {
    }
}}

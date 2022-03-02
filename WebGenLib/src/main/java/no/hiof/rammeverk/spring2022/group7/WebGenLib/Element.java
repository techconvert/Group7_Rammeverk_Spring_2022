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
    }

    public static Element create(String heading, String text) {
        return null;
    }

    public void render() {
        System.out.println(tag);
    }

    public void setRows(int numOfRows) {
    }

    public void appendRow() {

    }

    public void appendCell() {

    }

    public void setColumns(int numOfColumns) {

    }

    public String addText(String text) {
        this.text = text;
        return text;

    }

    public void addFbButton() {

    }

    public void addTwitterButton() {

    }

    public void addIgButton() {

    }

    public void createMedium(String media, String path) {

    }

    public void setSize(int height, int width) {

    }

    public void addControls(String play, String volume, String pause) {

    }

    public void setDescription(String description) {

    }

    public void setId(String id) {

    }

    public void setContent(String content) {

    }

    public void setBorder(String border) {

    }

    public void setPadding(String size) {

    }
}
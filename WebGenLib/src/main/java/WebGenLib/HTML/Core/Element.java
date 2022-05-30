package WebGenLib.HTML.Core;

import WebGenLib.HTML.List;
import WebGenLib.HTML.ListItem;
import WebGenLib.Interfaces.HTMLContent;

import java.util.ArrayList;

public class Element implements HTMLContent {
    String tag;
    ArrayList<HTMLContent> content = new ArrayList<>();
    ArrayList<Attribute> attributes = new ArrayList<>();

    protected Element() {

    }

    protected Element(String tag) {
        this.tag = tag;
    }

    /**
     * Method that makes any element.
     *
     * @param typeOfElement String defining the type of element user wishes to make.
     * @return
     */
    public static Element create(String typeOfElement) {
        Element element;
        if (typeOfElement.equals("li")) {
            element = ListItem.create(typeOfElement);
        } else if (typeOfElement.equals("ul") || typeOfElement.equals("ol")) {
            element = List.create(typeOfElement);
        } else {
            element = new Element(typeOfElement);
        }
        return element;
    }

    /**
     * Adds element as child.
     *
     * @param child The element to add.
     * @return
     */
    public Element insert(HTMLContent child) {
        content.add(child);
        return this;
    }

    public Attribute addAttribute(Attribute attribute) {
        attributes.add(attribute);
        return attribute;
    }

    /**
     * Displays content.
     */
    public void render() {
        System.out.print("<" + tag);
        for (Attribute attribute : attributes) {
            System.out.print(" " + attribute.getName() + "=\"" + attribute.getValue() + "\"");
        }
        System.out.println(">");
        for (HTMLContent child : content) {
            child.render();
        }
        System.out.println("</" + tag + ">");
    }

    /**
     * Makes a new row in a table.
     * @param numOfRows
     */
    public void setRows(int numOfRows) {
    }

    public void appendRow() {

    }

    public void appendCell() {

    }

    public void setColumns(int numOfColumns) {

    }

    /**
     * Method to display the Facebook button.
     */
    public void addFbButton() {

    }

    /**
     * Method to display the Twitter button.
     */
    public void addTwitterButton() {

    }

    /**
     * Method to display the Instagram button.
     */
    public void addIgButton() {

    }

    /**
     * Inserts image or video into the page.
     *
     * @param media String that defines type of media.
     * @param path String that defines the path of the media. For example "video.mp4"
     */
    public void createMedia(String media, String path) {

    }

    public void setSize(int height, int width) {

    }

    /**
     * Adds controls to a video, so the user can play or pause it, as well as
     * control the sound volume.
     *
     * @param play
     * @param volume
     * @param pause
     */
    public void addControls(String play, String volume, String pause) {

    }

    /**
     * Describes what's in the video or image.
     * The description text appears if the video or image doesn't load.
     *
     * @param description
     */
    public void setDescription(String description) {

    }

    public void setId(String id) {

    }

    public void setContent(String content) {

    }

    /**
     * Creates padding around a desired element.
     *
     * @param size The string to define the size of padding.
     */
    public void setPadding(String size) {

    }
}
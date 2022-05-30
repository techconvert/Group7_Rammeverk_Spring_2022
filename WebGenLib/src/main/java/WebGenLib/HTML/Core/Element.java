package WebGenLib.HTML.Core;

import WebGenLib.HTML.*;
import WebGenLib.Interfaces.HTMLContent;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Element implements HTMLContent {
    protected String tag;
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
     * @return Element
     */
    public static Element create(String typeOfElement) {
        Element element;

        switch (typeOfElement) {
            case "li":
                element = ListItem.create(typeOfElement);
                break;
            case "ul":
            case "ol":
                element = List.create(typeOfElement);
                break;
            case "table":
                element = Table.create(typeOfElement);
                break;
            case "tr":
                element = TableRow.create(typeOfElement);
                break;
            case "td":
            case "th":
                element = TableCell.create(typeOfElement);
                break;
            default:
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
    public void render(OutputStream destination)  throws Exception{
        destination.write(new String("<" + tag).getBytes(StandardCharsets.UTF_8));
        for (Attribute attribute : attributes) {
            destination.write(new String(" " + attribute.getName() + "=\"" + attribute.getValue() + "\"").getBytes(StandardCharsets.UTF_8));
        }
        destination.write(new String(">\n").getBytes(StandardCharsets.UTF_8));
        for (HTMLContent child : content) {
            child.render(destination);
        }
        destination.write(new String("</" + tag + ">\n").getBytes(StandardCharsets.UTF_8));
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

    public void setId(String id) {

    }
}
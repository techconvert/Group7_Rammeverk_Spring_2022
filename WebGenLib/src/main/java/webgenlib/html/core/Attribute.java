package webgenlib.html.core;

import webgenlib.css.MediaQuery;

/**
 * A class which represents an attribute within an HTML tag
 */
public class Attribute {
    String name;
    String value;

    /**
     * Protected constructor for the class.
     * @param name The attribute name for the new Attribute.
     * @param value The attribute value for the new Attribute.
     */
    protected Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Static factory method for creating new objects of type Attribute
     * @param name The name of the Attribute.
     * @param value The value of the Attribute.
     * @return The new Attribute.
     */
    public static Attribute create(String name, String value) {

        return new Attribute(name, value);
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}

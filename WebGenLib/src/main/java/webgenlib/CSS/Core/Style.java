package webgenlib.css.core;

import webgenlib.html.core.Attribute;

/**
 * Not implemented.
 */
public abstract class Style {

    protected Style() {

    }
    public Attribute createBackgroundColor(String color) {
        return null;
    }

    public void createBorder(String type, String weight) {}

    /**
     * Not implemented.
     *
     * Creates padding around a desired element.
     *
     * @param size The string to define the size of padding.
     */
    public void createPadding(String size) {}
}

package WebGenLib.CSS.Core;

import WebGenLib.HTML.Core.Attribute;

public abstract class Style {

    protected Style() {

    }
    public Attribute createBackgroundColor(String color) {
        return null;
    }

    public void createBorder(String type, String weight) {}

    /**
     * Creates padding around a desired element.
     *
     * @param size The string to define the size of padding.
     */
    public void createPadding(String size) {}
}

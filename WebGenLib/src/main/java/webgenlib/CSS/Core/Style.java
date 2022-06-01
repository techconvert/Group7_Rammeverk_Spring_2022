package webgenlib.css.core;

import webgenlib.css.MediaQuery;
import webgenlib.html.core.Attribute;

/**
 * Not implemented.
 */
public abstract class Style {

    protected Style() {

    }
    /**
     * Not implemented.
     * @param color
     * @return
     */
    public Attribute createBackgroundColor(String color) {
        return null;
    }

    /**
     * Not implemented.
     *
     * Makes a line around the element.
     *
     * @param type String describing the border (solid, dotted, dashed...)
     * @param weight String describing the thickness of the border.
     * @param color String giving the color to the border.
     */
    public void createBorder(String type, String weight, String color) {}

    /**
     * Not implemented.
     *
     * Creates padding around a desired element.
     *
     * @param size The string to define the size of padding.
     */
    public void createPadding(String size) {}

    /**
     * Defines how broad the element is going to be.
     *
     * @param size Integer that defines the percentage of the space the element is going to take.
     * @param percent The % sign itself.
     * @return
     */
    public Attribute createWidth(int size, String percent) {
        return null;
    }

    /**
     * Not implemented.
     *
     * Defines the width for a desired, already defined Media Query.
     * Here the user can decide their own default size for each query.
     *
     * @param typeOfQuery Media Query defining the type (for example cellphone, tablet or PC).
     * @param width Attribute defining desired breakpoint.
     */
    public void registerMediaQueryAttribute(MediaQuery typeOfQuery, Attribute width) {

    }

    /**
     * Not implemented.
     *
     * Defines how thick the font is going to be.
     *
     * @param weight
     */
    public void createFontWeight(String weight) {}

    /**
     * Not implemented.
     *
     * Defines how the text is going to look like when the user hovers over it with the cursor.
     */
    public void setHoverStyle() {

    }
}

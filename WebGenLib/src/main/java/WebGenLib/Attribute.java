package WebGenLib;

public class Attribute extends CSS {
    String name;
    String value;

    protected Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public static Attribute create(String name, String value) {
        return new Attribute(name, value);
    }

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
     * Defines the width for a desired, already defined Media Query.
     * Here the user can decide their own default size for each query.
     *
     * @param typeOfQuery Media Query defining the type (for example cellphone, tablet or PC).
     * @param width Attribute defining desired breakpoint.
     */
    public void registerMediaQueryAttribute(MediaQuery typeOfQuery, Attribute width) {

    }

    public Attribute createBackgroundColor(String color) {
        return null;
    }

    /**
     * Makes a line around the element.
     *
     * @param type String describing the border (solid, dotted, dashed...)
     * @param weight String describing the thickness of the border.
     * @param color String giving the color to the border.
     */
    public void createBorder(String type, String weight, String color) {}

    /**
     * Defines how thick the font is going to be.
     *
     * @param weight
     */
    public void createFontWeight(String weight) {}

    /**
     * Defines how the text is going to look like when the user hovers over it with the cursor.
     */
    public void setHoverStyle() {

    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}

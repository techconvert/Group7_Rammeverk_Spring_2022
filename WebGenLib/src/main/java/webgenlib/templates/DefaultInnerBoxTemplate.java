package webgenlib.templates;

import webgenlib.html.core.*;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class DefaultInnerBoxTemplate extends CoreTemplate {
    private Element description;
    private Element figure;
    private Element picture;
    private static String DEFAULT_DESCRIPTION = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    /**
     * Default constructor which initialises the DefaultInnerBoxTemplate.
     */
    protected DefaultInnerBoxTemplate() {
        description = Element.create("p");
        description.insert(new TextContent(DEFAULT_DESCRIPTION));
        figure = Element.create("figure");
        figure.addAttribute(Attribute.create("class", "pic"));
        picture = Element.create("picture");
        figure.insert(picture);
    }

    /**
     * Adds new element to the picture of the DefaultInnerBoxTemplate
     * @param element The element (source/img) to add.
     */
    public void addPictureElement(Element element) {
        this.picture.insert(element);
    }

    /**
     * Adds a figure caption to the template instance.
     * @param figCaption The text of the figure caption.
     */
    public void addFigCaption(String figCaption) {
        Element element = figure.insert(Element.create("figcaption"));
        element.insert(new TextContent(figCaption));
    }

    /**
     * Adds a figure caption to the template instance.
     * @param figCaption An element to insert into the figure caption.
     */
    public void addFigCaption(Element figCaption) {
        Element element = figure.insert(Element.create("figcaption"));
        element.insert(figCaption);
    }

    /**
     * Template method for writing the opening tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderOpeningTag(OutputStream destination) throws Exception {
        destination.write(new String("<section class=\"innerbox\">\n").getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Template method for writing the contents of the tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderContent(OutputStream destination) throws Exception {
        description.render(destination);
        figure.render(destination);
    }

    /**
     * Template method for writing the closing tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderClosingTag(OutputStream destination) throws Exception {
        destination.write(new String("</section>\n").getBytes(StandardCharsets.UTF_8));
    }

    public Element getDescription() {
        return description;
    }

    public void setDescription(Element description) {
        this.description = description;
    }

    public Element getPic() {
        return figure;
    }

    public void setPic(Element pic) {
        this.figure = pic;
    }
}

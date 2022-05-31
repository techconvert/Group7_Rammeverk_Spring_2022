package WebGenLib.Templates;

import WebGenLib.HTML.Core.*;
import WebGenLib.Interfaces.*;
import org.w3c.dom.Text;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class DefaultInnerBoxTemplate extends CoreTemplate {
    private Element description;
    private Element figure;
    private Element picture;
    private static String DEFAULT_DESCRIPTION = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    protected DefaultInnerBoxTemplate() {
        description = Element.create("p");
        description.insert(new TextContent(DEFAULT_DESCRIPTION));
        figure = Element.create("figure");
        figure.addAttribute(Attribute.create("class", "pic"));
        picture = Element.create("picture");
        figure.insert(picture);
    }

    public void addPictureElement(Element element) {
        this.picture.insert(element);
    }

    public void addFigCaption(String figCaption) {
        Element element = figure.insert(Element.create("figcaption"));
        element.insert(new TextContent(figCaption));
    }

    public void addFigCaption(Element figCaption) {
        Element element = figure.insert(Element.create("figcaption"));
        element.insert(figCaption);
    }

    public void renderOpeningTag(OutputStream destination) throws Exception {
        destination.write(new String("<section class=\"innerbox\">\n").getBytes(StandardCharsets.UTF_8));
    }

    public void renderContent(OutputStream destination) throws Exception {
        description.render(destination);
        figure.render(destination);
    }

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

package WebGenLib.Templates;

import WebGenLib.HTML.Core.*;
import org.w3c.dom.Attr;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Class for showcasing how to use the framework to generate complex content.
 */
public class DefaultBoxTemplate extends CoreTemplate {
    private Element header;
    private DefaultInnerBoxTemplate innerBox;
    private Element anchor;
    private final String BUTTON_TEXT = "More...";

    /**
     * Default constructor to initialise the DefaultBoxTemplate.
     */
    public DefaultBoxTemplate() {
        header = Element.create("h2");
        innerBox = new DefaultInnerBoxTemplate();
        anchor = Element.create("a");
        anchor.addAttribute(Attribute.create("class", "button"));
        anchor.insert(new TextContent(BUTTON_TEXT));
    }

    /**
     * Template method for writing the opening tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderOpeningTag(OutputStream destination) throws Exception {
        destination.write(new String("<article class=\"box\">\n").getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Template method for writing the contents of the tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderContent(OutputStream destination) throws Exception {
        header.render(destination);
        innerBox.render(destination);
        anchor.render(destination);
    }

    /**
     * Template method for writing the closing tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderClosingTag(OutputStream destination) throws Exception {
        destination.write(new String("</article>\n").getBytes(StandardCharsets.UTF_8));
    }

    public Element getHeader() {
        return header;
    }

    public void setHeader(Element header) {
        this.header = header;
    }

    public DefaultInnerBoxTemplate getInnerBox() {
        return innerBox;
    }

    protected void setInnerBox(DefaultInnerBoxTemplate innerBox) {
        this.innerBox = innerBox;
    }

    public Element getAnchor() {
        return anchor;
    }

    public void setAnchor(Element anchor) {
        this.anchor = anchor;
    }
}

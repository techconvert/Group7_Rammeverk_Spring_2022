package WebGenLib.HTML.Core;

import WebGenLib.Interfaces.HTMLContent;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Template class to represent an HTML page.
 */
public class Page extends CoreTemplate {
    protected Element head;
    protected Element body;

    /**
     * Public constructor to initialise the Page template.
     */
    public Page() {
        head = new Element("head");
        body = new Element("body");
    }

    /**
     * Template method for writing the opening tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderOpeningTag(OutputStream destination) throws Exception {
        destination.write(new String("<html>\n").getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Template method for writing the contents of the tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderContent(OutputStream destination) throws Exception {
        head.render(destination);
        body.render(destination);
    }

    /**
     * Template method for writing the closing tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void renderClosingTag(OutputStream destination) throws Exception {
        destination.write(new String("</html>\n").getBytes(StandardCharsets.UTF_8));
    }

    public Element getHead() {
        return head;
    }

    public void setHead(Element head) {
        this.head = head;
    }

    public Element getBody() {
        return body;
    }

    public void setBody(Element body) {
        this.body = body;
    }
}

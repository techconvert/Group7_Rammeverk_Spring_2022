package WebGenLib.Templates;

import WebGenLib.HTML.Core.*;
import org.w3c.dom.Attr;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class DefaultBoxTemplate extends Element {
    private Element header;
    private DefaultInnerBoxTemplate innerBox;
    private Element anchor;
    private final String BUTTON_TEXT = "More...";

    public DefaultBoxTemplate() {
        this.tag = "article";
        this.addAttribute(Attribute.create("class", "box"));
        header = Element.create("h2");
        innerBox = new DefaultInnerBoxTemplate();
        innerBox.addAttribute(Attribute.create("class", "innerBox"));
        anchor = Element.create("a");
        anchor.addAttribute(Attribute.create("class", "button"));
        anchor.insert(new TextContent(BUTTON_TEXT));
    }

    @Override
    public void render(OutputStream destination) throws Exception {
        destination.write(new String("<article class=\"box\">\n").getBytes(StandardCharsets.UTF_8));
        header.render(destination);
        innerBox.render(destination);
        anchor.render(destination);
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

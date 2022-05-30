package WebGenLib.HTML.Core;

import WebGenLib.Interfaces.HTMLContent;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Page implements HTMLContent {
    protected Element head;
    protected Element body;

    public Page() {
        head = new Element("head");
        body = new Element("body");
    }

    @Override
    public void render(OutputStream destination) throws Exception {
        destination.write(new String("<html>\n").getBytes(StandardCharsets.UTF_8));
        head.render(destination);
        body.render(destination);
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

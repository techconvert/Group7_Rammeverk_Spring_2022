package WebGenLib.HTML.Core;

import WebGenLib.Interfaces.HTMLContent;

public class Page implements HTMLContent {
    protected Element head;
    protected Element body;

    @Override
    public void render() {
        System.out.println("<html>");
        head.render();
        body.render();
        System.out.println("</html>");
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

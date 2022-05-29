package WebGenClient;
import WebGenLib.*;
import WebGenLib.HTML.Core.*;

public class Client {

    public static void main(String[] args) {

        System.out.println("Test");

        WebGen wgl = new WebGen();


        wgl.createPage("Hello!");
        System.out.println();

        Element element = Element.create("body");
        Element header = Element.create("header");
        Element heading = Element.create("h2");
        heading.insert(new TextContent("Welcome to "));
        Element part = Element.create("b");
        part.insert(new TextContent("the"));
        heading.insert(part);
        heading.insert(new TextContent(" web!"));
        element.insert(header);
        header.insert(heading);
        Element link = Element.create("a");
        Attribute href = Attribute.create("href", "about:blank");
        link.addAttribute(href);
        element.insert(link);
        element.render();
    }
}

package WebGenClient;
import WebGenLib.*;
import WebGenLib.HTML.Core.*;
import WebGenLib.HTML.*;
import WebGenLib.Templates.DefaultBoxTemplate;
import WebGenLib.Templates.DefaultPageTemplate;
import org.w3c.dom.Text;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Client {

    public static void main(String[] args) {

        OutputStream destination = System.out;
        if (args.length == 1) {
            try {
                destination = new FileOutputStream(args[0]);
            }
            catch (Exception exception) {

            }
        }

        WebGen wgl = new WebGen();

    /*
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
        element.render(); */

        DefaultPageTemplate template = new DefaultPageTemplate();
        template.getHeader().insert(Element.create("h1").insert(new TextContent("Welcome to the web carousel!")));

        template.getMenu()
                .addListItem("item 1")
                .append("item 2")
                .append("item 3");

        Table table = (Table) Element.create("table");
        template.getAside().insert(table);
        table.addTableRow().addTableHeaderCell("Number")
                .append("Translation");
        table.addTableRow().addTableCell("Yksi")
                .append("One");
        table.addTableRow().addTableCell("Kaksi")
                .append("Two");
        table.addTableRow().addTableCell("Kolme")
                .append("Three");

        DefaultBoxTemplate box = new DefaultBoxTemplate();
        template.getMainWrapper().insert(box);
        box.getHeader().insert(new TextContent("About CSS"));
        Element image = Element.create("img");
        image.addAttribute(Attribute.create("src", "resources/images/medietyper.jpg"));
        image.addAttribute(Attribute.create("alt", "Media types"));
        box.getInnerBox().addPictureElement(image);

        setStyles(template.getHead());

        Element copyright = Element.create("span");
        copyright.insert(new TextContent("Copyright &copy; 2022 Group 7"));
        copyright.addAttribute(Attribute.create("class", "copyrightnotice"));
        template.getFooter().insert(copyright);

        try {
            template.render(destination);
        }
        catch (Exception exception) {

        }
    }

    public static void setStyles(Element head) {

        Element styleLinkAll = Element.create("link");
        styleLinkAll.addAttribute(Attribute.create("rel", "stylesheet"));
        styleLinkAll.addAttribute(Attribute.create("media", "all"));
        styleLinkAll.addAttribute(Attribute.create("type", "text/css"));
        styleLinkAll.addAttribute(Attribute.create("href", "resources/css/styleall.css"));
        Element styleLinkScreen = Element.create("link");
        styleLinkScreen.addAttribute(Attribute.create("rel", "stylesheet"));
        styleLinkScreen.addAttribute(Attribute.create("media", "screen"));
        styleLinkScreen.addAttribute(Attribute.create("type", "text/css"));
        styleLinkScreen.addAttribute(Attribute.create("href", "resources/css/style.css"));

        head.insert(styleLinkAll)
            .insert(styleLinkScreen);
    }
}

package WebGenClient;
import WebGenLib.*;
import WebGenLib.HTML.Core.*;
import WebGenLib.HTML.*;
import WebGenLib.Templates.DefaultPageTemplate;

public class Client {

    public static void main(String[] args) {

        //System.out.println("Test");

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
        template.getHeader().insert(new TextContent("Welcome to the web carousel!"));

        template.getMenu()
                .addListItem("item 1")
                .append("item 2")
                .append("item 3");

        Table table = (Table) Element.create("table");
        template.getMain().insert(table);
        table.addTableRow().addTableHeaderCell("Number")
                .append("Translation");
        table.addTableRow().addTableCell("Yksi")
                .append("One");
        table.addTableRow().addTableCell("Kaksi")
                .append("Two");
        table.addTableRow().addTableCell("Kolmen")
                .append("Three");
        TableRow testRow = table.addTableRow();
        testRow.addTableCell("Test add");
        TableRow testRow2 = testRow.append();
        testRow2.addTableCell("Test append");


        Element styleLinkAll = Element.create("link");
        styleLinkAll.addAttribute(Attribute.create("rel", "stylesheet"));
        styleLinkAll.addAttribute(Attribute.create("media", "all"));
        styleLinkAll.addAttribute(Attribute.create("type", "text/css"));
        styleLinkAll.addAttribute(Attribute.create("href", "stil/stilall.css"));
        Element styleLinkScreen = Element.create("link");
        styleLinkScreen.addAttribute(Attribute.create("rel", "stylesheet"));
        styleLinkScreen.addAttribute(Attribute.create("media", "screen"));
        styleLinkScreen.addAttribute(Attribute.create("type", "text/css"));
        styleLinkScreen.addAttribute(Attribute.create("href", "stil/stil.css"));

        template.getHead()
                .insert(styleLinkAll)
                .insert(styleLinkScreen);

        template.render();

    }
}

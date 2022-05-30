package WebGenLib.Templates;

import WebGenLib.HTML.Core.Attribute;
import WebGenLib.HTML.Core.Element;
import WebGenLib.HTML.Core.Page;
import WebGenLib.HTML.List;

public class DefaultPageTemplate extends Page {
    private Element header;
    private Element nav;
    private Element main;
    private Element aside;
    private Element footer;
    private List menu;

    public DefaultPageTemplate() {
        super();
        header = Element.create("header");
        nav = Element.create("nav");
        Element menuClosed = Element.create("div");
        menuClosed.addAttribute(Attribute.create("id", "menu_closed"));
        nav.insert(menuClosed);
        Element menuOpen = Element.create("div");
        menuOpen.addAttribute(Attribute.create("id", "menu_open"));
        nav.insert(menuOpen);
        menu = List.create("ul");
        menuOpen.insert(menu);
        main = Element.create("main");
        aside = Element.create("aside");
        footer = Element.create("footer");

        body.insert(header);
        body.insert(nav);
        body.insert(main);
        body.insert(aside);
        body.insert(footer);
    }

    public Element getHeader() {
        return header;
    }

    public Element getNav() {
        return nav;
    }

    public Element getMain() {
        return main;
    }

    public Element getAside() {
        return aside;
    }

    public Element getFooter() {
        return footer;
    }

    public List getMenu() {
        return menu;
    }
}

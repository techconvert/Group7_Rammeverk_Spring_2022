package webgenlib.templates;

import webgenlib.html.core.*;
import webgenlib.html.List;

/**
 * Default page template to showcase composite functionality.
 */
public class DefaultPageTemplate extends Page {
    private Element header;
    private Element nav;
    private Element main;
    private Element mainWrapper;
    private Element aside;
    private Element footer;
    private List menu;

    /**
     * Default constructor to initialise the template with appropriate values.
     */
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
        mainWrapper = Element.create("section");
        mainWrapper.addAttribute(Attribute.create("id", "wrapper"));
        main.insert(mainWrapper);
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

    public Element getMainWrapper() {
        return mainWrapper;
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

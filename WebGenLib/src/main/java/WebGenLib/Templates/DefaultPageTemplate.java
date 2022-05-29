package WebGenLib.Templates;

import WebGenLib.HTML.Core.Element;
import WebGenLib.HTML.Core.Page;

public class DefaultPageTemplate extends Page {
    private Element header;
    private Element nav;
    private Element main;
    private Element aside;
    private Element footer;

    public DefaultPageTemplate() {
        super();
        header = Element.create("header");
        nav = Element.create("nav");
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
}

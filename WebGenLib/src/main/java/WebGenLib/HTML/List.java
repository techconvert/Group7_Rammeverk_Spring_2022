package WebGenLib.HTML;

import WebGenLib.HTML.Core.Element;
import WebGenLib.HTML.Core.TextContent;

public class List extends Element {

    protected List(String tag) {
        super(tag);
    }

    /**
     * Makes an unordered or ordered list.
     *
     * @param listType String defining whether the list is ordered or unordered.
     * @return
     */
    public static List create(String listType) {
        return new List(listType);
    }

    /**
     * Puts text at the end of the list in order to add to it.
     *
     * @param text
     */
    public ListItem addListItem(String text) {
        ListItem listItem = ListItem.create("li");
        listItem.insert(new TextContent(text));
        this.insert(listItem);
        listItem.parent = this;

        return listItem;
    }
}

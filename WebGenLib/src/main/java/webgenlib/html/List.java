package webgenlib.html;

import webgenlib.html.core.*;

/**
 * Class to represent an HTML &lt;ul&gt; or &lt;ol&gt; list.
 */
public class List extends Element {

    /**
     * Basic constructor to initialise the List.
     * @param tag The tag ("ul" or "ol") of the List.
     */
    protected List(String tag) {
        super(tag);
    }

    /**
     * Makes an unordered or ordered list.
     *
     * @param listType String defining whether the list is ordered or unordered.
     * @return A new list.
     */
    public static List create(String listType) {
        return new List(listType);
    }

    /**
     * Puts text in a new ListItem at the end of the list.
     *
     * @param text The text for the new ListItem.
     * @return The new ListItem.
     */
    public ListItem addListItem(String text) {
        ListItem listItem = ListItem.create("li");
        listItem.insert(new TextContent(text));
        this.insert(listItem);
        listItem.parent = this;

        return listItem;
    }
}

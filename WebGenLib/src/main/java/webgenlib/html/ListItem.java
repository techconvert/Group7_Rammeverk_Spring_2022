package webgenlib.html;

import webgenlib.html.core.*;

/**
 * Class to represent a single item in an HTML list.
 */
public class ListItem extends Element {
    List parent;

    /**
     * Basic constructor that initialises the tag.
     */
    protected ListItem() {
        super("li");
    }

    /**
     * Factory method to create a ListItem
     * @param tag The tag of the ListItem.
     * @return The new ListItem.
     */
    public static ListItem create(String tag) {
        return new ListItem();
    }

    /**
     * Method for appending a ListItem to the parent List.
     * @param content The text of the new ListItem.
     * @return The new ListItem.
     */
    public ListItem append(String content) {
        ListItem listItem = (ListItem) Element.create("li");
        listItem.insert(new TextContent(content));
        parent.insert(listItem);
        listItem.parent = this.parent;

        return listItem;
    }

    public List getParent() {
        return parent;
    }

    public void setParent(List parent) {
        this.parent = parent;
    }
}

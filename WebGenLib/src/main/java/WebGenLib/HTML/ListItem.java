package WebGenLib.HTML;

import WebGenLib.HTML.Core.*;

public class ListItem extends Element {
    List parent;

    protected ListItem() {
        super("li");
    }

    public static ListItem create(String tag) {
        return new ListItem();
    }

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

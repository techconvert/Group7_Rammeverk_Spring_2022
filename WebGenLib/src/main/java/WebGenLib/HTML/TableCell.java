package WebGenLib.HTML;

import WebGenLib.HTML.Core.Element;
import WebGenLib.HTML.Core.TextContent;

public class TableCell extends Element {
    TableRow parent;

    /**
     * Default constructor. Assumes "td" is most commonly used.
     */
    protected TableCell() {
        super("td");
    }

    /**
     * Constructor that takes tag as a parameter, to instantiate new
     * "th" or "td" tag.
     * @param tag "th" or "td", depending on if you want table header or table cell.
     */
    protected TableCell(String tag) {
        super(tag);
    }

    public static TableCell create(String tag) {

        return new TableCell(tag);
    }

    public TableCell append(String content) {
        TableCell tableCell = (TableCell) Element.create(this.tag);
        tableCell.insert(new TextContent(content));
        parent.insert(tableCell);
        tableCell.parent = this.parent;

        return tableCell;
    }

    public TableRow getParent() {
        return parent;
    }

    public void setParent(TableRow parent) {
        this.parent = parent;
    }

}

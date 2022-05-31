package WebGenLib.HTML;

import WebGenLib.HTML.Core.Element;
import WebGenLib.HTML.Core.TextContent;

/**
 * Class to represent a single HTML &lt;td&gt; or &lt;th&gt; table cell.
 */
public class TableCell extends Element {
    TableRow parent;

    /**
     * Default constructor. Initialises the table cell as a &lt;td&gt;.
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

    /**
     * Factory method for creating a new table cell.
     * @param tag The tag of the new table cell.
     * @return The new table cell.
     */
    public static TableCell create(String tag) {

        return new TableCell(tag);
    }

    /**
     * Method for appending a new TableCell to the parent TableRow.
     * @param content The text of the new TableCell.
     * @return The new TableCell.
     */
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

package WebGenLib.HTML;

import WebGenLib.HTML.Core.Element;
import WebGenLib.HTML.Core.TextContent;

/**
 * Class to represent a single HTML table row.
 */
public class TableRow extends Element {
    Table parent;

    /**
     * Default constructor for TableRow.
     */
    protected TableRow() {
        super("tr");
    }

    /**
     * Factory method for creating a new TableRow.
     * @param tag The HTML tag of the TableRow.
     * @return The new TableRow.
     */
    public static TableRow create(String tag) {

        return new TableRow();
    }

    /**
     * Method for inserting a new &lt;td&gt; TableCell at the end of the TableRow.
     * @param text The text of the new TableCell.
     * @return The new TableCell.
     */
    public TableCell addTableCell(String text) {
        TableCell tableCell = TableCell.create("td");
        tableCell.insert(new TextContent(text));
        this.insert(tableCell);
        tableCell.parent = this;

        return tableCell;
    }

    /**
     * Method for inserting a new &lt;th&gt; TableCell at the end of the TableRow.
     * @param text The text of the new TableCell.
     * @return The new TableCell.
     */
    public TableCell addTableHeaderCell(String text) {
        TableCell tableCell = TableCell.create("th");
        tableCell.insert(new TextContent(text));
        this.insert(tableCell);
        tableCell.parent = this;

        return tableCell;
    }

    /**
     * Method for appending a new TableRow to the parent Table.
     * @return The new TableRow.
     */
    public TableRow append() {
        TableRow tableRow = (TableRow) Element.create(this.tag);
        parent.insert(tableRow);
        tableRow.parent = this.parent;

        return tableRow;
    }


    public Table getParent() {
        return parent;
    }

    public void setParent(Table parent) {
        this.parent = parent;
    }
}

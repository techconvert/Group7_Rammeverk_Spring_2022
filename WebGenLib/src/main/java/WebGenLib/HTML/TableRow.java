package WebGenLib.HTML;

import WebGenLib.HTML.Core.Element;
import WebGenLib.HTML.Core.TextContent;

public class TableRow extends Element {
    Table parent;

    protected TableRow() {
        super("tr");
    }

    public static TableRow create(String tag) {

        return new TableRow();
    }

    public TableCell addTableCell(String text) {
        TableCell tableCell = TableCell.create("td");
        tableCell.insert(new TextContent(text));
        this.insert(tableCell);
        tableCell.parent = this;

        return tableCell;
    }

    public TableCell addTableHeaderCell(String text) {
        TableCell tableCell = TableCell.create("th");
        tableCell.insert(new TextContent(text));
        this.insert(tableCell);
        tableCell.parent = this;

        return tableCell;
    }

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

package WebGenLib.HTML;

import WebGenLib.HTML.Core.Element;
import WebGenLib.HTML.Core.TextContent;

public class Table extends Element {

    protected Table(String tag) {
        super(tag);
    }

    public static Table create(String table) {

        return new Table(table);
    }

    public TableRow addTableRow() {
        TableRow tableRow = TableRow.create("tr");
        this.insert(tableRow);
        tableRow.parent = this;

        return tableRow;
    }

    /**
     * Makes a new row in a table.
     * @param numOfRows
     */
    public void setRows(int numOfRows) {
    }

    public void setColumns(int numOfColumns) {

    }


}

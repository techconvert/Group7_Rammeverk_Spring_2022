package webgenlib.html;

import webgenlib.html.core.Element;

/**
 * Class for representing an HTML &lt;table&gt;.
 */
public class Table extends Element {

    /**
     * Basic constructor for initialising the table.
     * @param tag The html tag for the table.
     */
    protected Table(String tag) {
        super(tag);
    }

    /**
     * Factory method for creating a new table.
     * @param table The tag for the new table.
     * @return The new table.
     */
    public static Table create(String table) {

        return new Table(table);
    }

    /**
     * Method for adding a new table row to the end of the table.
     * @return The new table row.
     */
    public TableRow addTableRow() {
        TableRow tableRow = TableRow.create("tr");
        this.insert(tableRow);
        tableRow.parent = this;

        return tableRow;
    }

    /**
     * Not implemented.
     *
     * Initialises the number of rows of the table.
     * @param numOfRows
     */
    public void setRows(int numOfRows) {
    }

    /**
     * Not implemented.
     *
     * @param numOfColumns Initialises the number of columns of the table.
     */
    public void setColumns(int numOfColumns) {

    }


}

package WebGenLib;

public class List extends Element {

    protected List() {

    }

    /**
     * Makes an unordered or ordered list.
     *
     * @param listType String defining whether the list is ordered or unordered.
     * @return
     */
    public static List create(String listType) {
        return new List();
    }

    /**
     * Puts text at the end of the list in order to add to it.
     *
     * @param text
     */
    public void append(String text) {

    }
}

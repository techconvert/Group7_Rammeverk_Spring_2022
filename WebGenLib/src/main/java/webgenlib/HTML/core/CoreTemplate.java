package webgenlib.html.core;

import webgenlib.interfaces.HTMLContent;

import java.io.OutputStream;

/**
 * Class to represent complex HTML structures.
 */
public abstract class CoreTemplate implements HTMLContent {

    /**
     * Write the method to the chosen OutputStream.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public void render(OutputStream destination) throws Exception {
        renderOpeningTag(destination);
        renderContent(destination);
        renderClosingTag(destination);
    }

    /**
     * Template method for writing the opening tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public abstract void renderOpeningTag(OutputStream destination) throws Exception;
    /**
     * Template method for writing the contents of the tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public abstract void renderContent(OutputStream destination) throws Exception;
    /**
     * Template method for writing the closing tag.
     * @param destination The OutputStream to which to write.
     * @throws Exception
     */
    public abstract void renderClosingTag(OutputStream destination) throws Exception;
}

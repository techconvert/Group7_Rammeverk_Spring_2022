package webgenlib.interfaces;

import java.io.OutputStream;

/**
 * Interface which defines the common basic functionality for all HTML content.
 */
public interface HTMLContent {
    void render(OutputStream destination) throws Exception;
}

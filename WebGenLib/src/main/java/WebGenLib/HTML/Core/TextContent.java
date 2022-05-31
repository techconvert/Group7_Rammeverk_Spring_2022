package WebGenLib.HTML.Core;

import WebGenLib.Interfaces.HTMLContent;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Class to represent basic text content in HTML.
 */
public class TextContent implements HTMLContent {
    private String text;

    /**
     * Basic constructor with parameter.
     * @param text The text the TextContent represents.
     */
    public TextContent(String text) {
        this.text = text;
    }

    /**
     * Recursive method that displays content.
     * @param destination The OutputStream to write to.
     * @throws Exception
     */
    @Override
    public void render(OutputStream destination) throws Exception {
        destination.write(new String(text + "\n").getBytes(StandardCharsets.UTF_8));
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

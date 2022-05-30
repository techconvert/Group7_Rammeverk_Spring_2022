package WebGenLib.HTML.Core;

import WebGenLib.Interfaces.HTMLContent;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class TextContent implements HTMLContent {
    private String text;

    public TextContent(String text) {
        this.text = text;
    }

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

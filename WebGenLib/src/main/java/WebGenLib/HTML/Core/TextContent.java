package WebGenLib.HTML.Core;

import WebGenLib.Interfaces.HTMLContent;

public class TextContent implements HTMLContent {
    private String text;

    public TextContent(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

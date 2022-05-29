package WebGenLib;

public class HTMLText implements HTMLContent {
    private String text;

    public HTMLText(String text) {
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

package WebGenLib.Templates;

import WebGenLib.Interfaces.HTMLContent;

import java.io.OutputStream;

public abstract class BaseTemplate implements HTMLContent {

    public void render(OutputStream destination) {
        renderOpeningTag(destination);
        renderContent(destination);
        renderClosingTag(destination);
    }

    public abstract void renderOpeningTag(OutputStream destination);
    public abstract void renderContent(OutputStream destination);
    public abstract void renderClosingTag(OutputStream destination);
}

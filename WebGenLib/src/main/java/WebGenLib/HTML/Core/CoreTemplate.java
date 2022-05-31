package WebGenLib.HTML.Core;

import WebGenLib.Interfaces.HTMLContent;

import java.io.OutputStream;

public abstract class CoreTemplate implements HTMLContent {

    public void render(OutputStream destination) throws Exception{
        renderOpeningTag(destination);
        renderContent(destination);
        renderClosingTag(destination);
    }

    public abstract void renderOpeningTag(OutputStream destination) throws Exception;
    public abstract void renderContent(OutputStream destination) throws Exception;
    public abstract void renderClosingTag(OutputStream destination) throws Exception;
}

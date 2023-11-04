package calculator.text_split.concrete;

import calculator.text_split.InputText;
import calculator.text_split.handler.TextSplit;

public class BasicSplit extends TextSplit {
    public BasicSplit(InputText text) {
        super(text);
    }

    @Override
    protected boolean resolve() {
        return false;
    }

    @Override
    protected void done() {
    }
}

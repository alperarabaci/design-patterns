package com.udemy.factorymethod.ex2.factory;

import com.udemy.factorymethod.ex2.buttons.Button;
import com.udemy.factorymethod.ex2.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
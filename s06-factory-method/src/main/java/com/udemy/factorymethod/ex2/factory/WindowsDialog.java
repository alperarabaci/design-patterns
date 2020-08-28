package com.udemy.factorymethod.ex2.factory;

import com.udemy.factorymethod.ex2.buttons.Button;
import com.udemy.factorymethod.ex2.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
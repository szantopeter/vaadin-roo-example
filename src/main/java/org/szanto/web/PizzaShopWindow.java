package org.szanto.web;

import com.vaadin.ui.Window;

public class PizzaShopWindow extends Window {

    public PizzaShopWindow() {

        // entity manager
        PizzaShopEntityManagerView entityManagerView = new PizzaShopEntityManagerView();
        setContent(entityManagerView);

        // select window theme
        setTheme("pizza");
    }
}

package org.szanto.web.ui;

import org.szanto.web.AbstractEntityView;
import org.szanto.web.EntityEditor;
import com.vaadin.spring.roo.addon.annotations.RooVaadinEntityView;
import com.vaadin.ui.Table;

@RooVaadinEntityView(formBackingObject = org.szanto.domain.Pizza.class)
public class PizzaView extends AbstractEntityView<org.szanto.domain.Pizza> {

    @Override
    protected EntityEditor createForm() {
        return new PizzaForm();
    }

    @Override
    protected void configureTable(Table table) {
        table.setContainerDataSource(getTableContainer());
        table.setVisibleColumns(getTableColumns());

        setupGeneratedColumns(table);
    }

}

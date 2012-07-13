package org.szanto.web.ui;

import org.szanto.web.AbstractEntityView;
import org.szanto.web.EntityEditor;
import com.vaadin.spring.roo.addon.annotations.RooVaadinEntityView;
import com.vaadin.ui.Table;

@RooVaadinEntityView(formBackingObject = org.szanto.domain.Topping.class)
public class ToppingView extends AbstractEntityView<org.szanto.domain.Topping> {

    @Override
    protected EntityEditor createForm() {
        return new ToppingForm();
    }

    @Override
    protected void configureTable(Table table) {
        table.setContainerDataSource(getTableContainer());
        table.setVisibleColumns(getTableColumns());

        setupGeneratedColumns(table);
    }

}

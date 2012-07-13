package org.szanto.web.ui;

import org.szanto.web.AbstractEntityView;
import org.szanto.web.EntityEditor;
import com.vaadin.spring.roo.addon.annotations.RooVaadinEntityView;
import com.vaadin.ui.Table;

@RooVaadinEntityView(formBackingObject = org.szanto.domain.Base.class)
public class BaseView extends AbstractEntityView<org.szanto.domain.Base> {

    @Override
    protected EntityEditor createForm() {
        return new BaseForm();
    }

    @Override
    protected void configureTable(Table table) {
        table.setContainerDataSource(getTableContainer());
        table.setVisibleColumns(getTableColumns());

        setupGeneratedColumns(table);
    }

}

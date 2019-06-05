package com.company.speedypizza.web.screens.products;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizza.entity.Products;

@UiController("speedypizza_Products.edit")
@UiDescriptor("products-edit.xml")
@EditedEntityContainer("productsDc")
@LoadDataBeforeShow
public class ProductsEdit extends StandardEditor<Products> {
}
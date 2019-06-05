package com.company.speedypizza.web.screens.products;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizza.entity.Products;

@UiController("speedypizza_Products.browse")
@UiDescriptor("products-browse.xml")
@LookupComponent("productsesTable")
@LoadDataBeforeShow
public class ProductsBrowse extends StandardLookup<Products> {
}
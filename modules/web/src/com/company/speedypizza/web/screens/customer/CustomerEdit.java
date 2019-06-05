package com.company.speedypizza.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizza.entity.Customer;

@UiController("speedypizza_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}
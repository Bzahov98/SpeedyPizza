package com.company.speedypizza.web.screens.delivery;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizza.entity.Delivery;

@UiController("speedypizza_Delivery.edit")
@UiDescriptor("delivery-edit.xml")
@EditedEntityContainer("deliveryDc")
@LoadDataBeforeShow
public class DeliveryEdit extends StandardEditor<Delivery> {
}
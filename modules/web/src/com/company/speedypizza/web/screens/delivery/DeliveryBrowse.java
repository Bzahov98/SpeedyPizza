package com.company.speedypizza.web.screens.delivery;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizza.entity.Delivery;

@UiController("speedypizza_Delivery.browse")
@UiDescriptor("delivery-browse.xml")
@LookupComponent("deliveriesTable")
@LoadDataBeforeShow
public class DeliveryBrowse extends StandardLookup<Delivery> {
}
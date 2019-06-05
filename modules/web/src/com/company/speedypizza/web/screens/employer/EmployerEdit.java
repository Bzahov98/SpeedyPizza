package com.company.speedypizza.web.screens.employer;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizza.entity.Employer;

@UiController("speedypizza_Employer.edit")
@UiDescriptor("employer-edit.xml")
@EditedEntityContainer("employerDc")
@LoadDataBeforeShow
public class EmployerEdit extends StandardEditor<Employer> {
}
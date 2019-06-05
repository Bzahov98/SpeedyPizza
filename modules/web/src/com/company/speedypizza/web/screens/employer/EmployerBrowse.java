package com.company.speedypizza.web.screens.employer;

import com.haulmont.cuba.gui.screen.*;
import com.company.speedypizza.entity.Employer;

@UiController("speedypizza_Employer.browse")
@UiDescriptor("employer-browse.xml")
@LookupComponent("employersTable")
@LoadDataBeforeShow
public class EmployerBrowse extends StandardLookup<Employer> {
}
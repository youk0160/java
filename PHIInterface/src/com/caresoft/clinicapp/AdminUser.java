package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
public class AdminUser extends User implements PHIAdminCompliant, PHICompliantUser {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

	public AdminUser() {}
	
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

	@Override
	public void assignPin(int pin) {
	}

	@Override
	public boolean isAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

}

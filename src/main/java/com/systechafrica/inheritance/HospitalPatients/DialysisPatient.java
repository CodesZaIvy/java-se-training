package com.systechafrica.inheritance.HospitalPatients;

public class DialysisPatient extends patient{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return "Name: " + getPatientname()+" No: "+ getPatientNo()+" Address:"+getPatientAddress()+ " Title: "+getTitle();
}
}
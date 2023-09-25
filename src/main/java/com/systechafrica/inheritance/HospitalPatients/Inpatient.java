package com.systechafrica.inheritance.HospitalPatients;

public class Inpatient extends patient {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Name: " + getPatientname()+" No: "+ getPatientNo()+" Address:"+getPatientAddress()+ " Title: "+getTitle();
    
}
}
package com.systechafrica.inheritance.HospitalPatients;

public class patient {
    private String PatientNo;
     private String Patientname;
      private String PatientAddress;

    public String getPatientNo() {
        return PatientNo;
    }
    public void setPatientNo(String patientNo) {
        PatientNo = patientNo;
    }
    public String getPatientname() {
        return Patientname;
    }
    public void setPatientname(String patientname) {
        Patientname = patientname;
    }
    public String getPatientAddress() {
        return PatientAddress;
    }
    public void setPatientAddress(String patientAddress) {
        PatientAddress = patientAddress;
    }
    public String toString() {
        return "Name: " + Patientname+" No: "+ PatientNo+" Address "+PatientAddress;
    }
    
}

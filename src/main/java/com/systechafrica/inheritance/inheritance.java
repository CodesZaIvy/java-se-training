package com.systechafrica.inheritance;

import java.util.logging.Logger;

import com.systechafrica.inheritance.HospitalPatients.Inpatient;
import com.systechafrica.inheritance.HospitalPatients.OutPatient;

public class inheritance {
    private static final Logger LOGGER = Logger.getLogger(inheritance.class.getName());
    
    public static void main(String[] args) {
        inheritance app =new inheritance();
        app.HospitalPatients();
    }
    public void HospitalPatients(){
      OutPatient p1 = new OutPatient() ;
      p1.setPatientname("viola");
      p1.setPatientNo("0721345678");
      p1.setPatientAddress("3900-Eldoret");
      p1.setTitle(" Outpatient ");
      LOGGER.info(" OutPatient=>"+p1.toString());

       Inpatient n1 = new Inpatient() ;
      n1.setPatientname("vincent");
      n1.setPatientNo("011223344");
      n1.setPatientAddress("74567-Nairobi");
      n1.setTitle(" InPatient ");

      Inpatient n2 = new Inpatient() ;
      n2.setPatientname("valeria");
      n2.setPatientNo("073412345 ");
      n2.setPatientAddress("7-Lodwar");
      n2.setTitle(" InPatient ");
      LOGGER.info(" Inpatient=>"+n1.toString());
      LOGGER.info(" Inpatient=>"+n2.toString());
    } 
}
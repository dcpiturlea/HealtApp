package com.company;

import sun.awt.windows.WEmbeddedFrame;

public class BloodPressureDiagnosis extends BpmDiagnosis {

    short systolicPressure;
    short diastolicPressure;

    public void BloodPressureMethod() {
//age <20 years old
        if (age < 20) {
            if (systolicPressure > 135) {
                System.out.println("Your systolic pressure is too high for your age. ");
            }
            if ((diastolicPressure > 40 && diastolicPressure < 75) || (systolicPressure > 65 && systolicPressure < 105)) {
                System.out.println("Your blood pressure is high|\n\n");
            } else if ((diastolicPressure > 60 && diastolicPressure < 77) || (systolicPressure > 105 && systolicPressure < 117)) {
                System.out.println("Your blood pressure is above the normal average(aprox 120/70).\n\n");
            } else if ((diastolicPressure > 77 && diastolicPressure < 85) || (systolicPressure > 117 && systolicPressure < 130)) {
                System.out.println("Your blood pressure is well above the normal average(120/70).\n\n");
            } else {
                System.out.println("Your blood pressure is too high(normal 120/70) .\n\n");
            }
        }
//age 20-40 years old
        if (age >= 20 && age < 40) {
            if (systolicPressure > 135) {
                System.out.println("Your systolic pressure is too high for your age. ");
            }
            if ((diastolicPressure > 50 && diastolicPressure < 65) || (systolicPressure > 90 && systolicPressure < 115)) {
                System.out.println("Blood pressure is low for your age group(20-40 years old)\n\n");
            } else if ((diastolicPressure > 65 && diastolicPressure < 85) || (systolicPressure > 115 && systolicPressure < 129)) {
                System.out.println("Blood pressure is normal for your age group(20-40 ani)\n\n");
            } else if ((diastolicPressure > 85 && diastolicPressure < 100) || (systolicPressure >= 130 && systolicPressure < 190)) {
                System.out.println("Your blood pressure is over the limit for your age group (For 20-40 years old the " +
                        "blood pressure is 120/70).\n\n");
            } else {
                System.out.println("Error. It is possible that the blood pressure values entered may be incorrect.\n\n");
            }
        }

    }
}

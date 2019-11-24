package com.company;

public class BpmDiagnosis {

    String name, sex;
    Byte age;
    short bpm; //nr de batai ale inimii pe minut

    public void BpmMethod() {
        if (bpm > 90) {
            System.out.println("Your pulse is quite high, a normal pulse should be 60-90bpm.\n");
        } else if (bpm < 60) {
            System.out.println("Your pulse is smaller than it should be, a normal pulse should be between 60-90bpm.\n");
        } else {
            System.out.println("Your pulse is normal.\n");


        }
    }
}

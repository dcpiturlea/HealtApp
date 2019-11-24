package com.company;

import sun.awt.windows.WingDings;

public class WeightDiagnosis extends BloodPressureDiagnosis{

    float height; //inaltimea in metri a utilizatorului
    float  weight; //greutatea in kg a utilizatorului
    float  weightIndex; //variabila indica indicele de.masa corporala care se calculeaza in functie de inaltime si greutate
    float idealWeight; //arata greutatea minima la care trebuie sa ajunga utilizatorul
    float gainWeight; //variabila arata de cate kg e nevoie sa te ingrasi ca sa ajungi la greutatea ideala
    float loseWeight; //variabila arata cate kg trebuie slabesti ca sa ajungi la o greutate ideala

    public void WeightDiagnosisMethod(){

        //calculate the weight index
        weightIndex = weight/(height*height);
        loseWeight = 25*(height*height);
        idealWeight = weight - loseWeight;
        gainWeight = loseWeight - weight;

        if((sex.equals("W")) && (weightIndex>0) && (weightIndex<18.5)){
        System.out.println("Hello, "+name+ " you have a few pounds." +
                "\nYou must reach  "+loseWeight+ " Kg, so you must gain " +gainWeight+" kg");
        }
        else if (weightIndex>0 && weightIndex<18.5){
            System.out.println("Hello, "+name+ " your weight is a little." +
                    "\nYou must reach  "+loseWeight+ " Kg, so you must gain " +gainWeight+" kg");
        }
        else if (weightIndex>=18.5 && weightIndex<25){
            System.out.println("Hello, "+name+" you have a normal weight:)!");
        }
        else if (weightIndex>=18.5&& weightIndex<30){
            System.out.println("Hello, "+name+" you have some plus Kg.\nYour ideal weight is "+loseWeight+" kg, so you have " +
                    "to lose "+idealWeight+" Kg." );
        }
        else if (weightIndex>=30&& weightIndex<40){
            System.out.println("Hello, "+name+" You have a lot of extra pounds, you have to reach "+loseWeight+" kg, so he must lose " + idealWeight);
        }
        else{
            System.out.println("Hello, "+name+" You have a lot of extra pounds." +
                    "\nYou must reach "+loseWeight+" so he must lose "+idealWeight+" kg");
        }
    }
}

package com.company;

import java.util.Scanner;

public class InputClass extends WeightDiagnosis{


    public void WelcomeMessage(){
        System.out.println("Hello, this is a program that can really help you with the kilogram and at the same time" +
                " it can provide to you some information about your pulse and blood pressure depending on the data you" +
                " enter.\nThe results cannot replace a doctor's diagnosis.\n");
    }

public void InputFromUser(){
    Scanner in = new Scanner(System.in);

    System.out.println("What's your name? ");
    name = in.next();

    System.out.println("Are you a woman(W) or a man?(M)");
    sex= in.next();

    System.out.println("How old are you?");
    age=in.nextByte();

    System.out.println("How tall are you? (meters.centimeters)");
    height = in.nextFloat();

    System.out.println("What's your weight?");
    weight = in.nextFloat();

    System.out.println("Please enter your BPM: ");
    bpm = in.nextShort();

    System.out.println("Please enter your systolic pressure of blood: ");
    systolicPressure = in.nextShort();

    System.out.println("Please enter your diastolic pressure of blood");
    diastolicPressure = in.nextShort();
    }

}

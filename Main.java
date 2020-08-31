package com.company;

public class Main {

    public static void main(String[] args) {

        String patientName = "Stacey Manson";
        boolean hasInsurance = false;
        double temp = 102.2d;
        int numVisits = 5;
        String copay = "$35";
        String next_appt = "30/9/2020";
        String phone = "202-876=7933";

        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temperature: " + temp);
        System.out.println("Number of visits: " + numVisits);
        System.out.println("Co-pay: "+ copay);
        System.out.println("Next appointment date: " + next_appt);
        System.out.println("Contact number: " + phone);
    }
}

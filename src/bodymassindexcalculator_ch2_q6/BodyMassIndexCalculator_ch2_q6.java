/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindexcalculator_ch2_q6;

import java.util.Scanner;

/**
 *
 * @author kamve
 */
public class BodyMassIndexCalculator_ch2_q6 {

    public static double getHeight(int quit)
    {
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in inches or "+quit+" to quit: ");
        height = input.nextDouble();
        return height;
    }
    public static double getWeight()
    {
        double weight;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        weight = input.nextDouble();
        return weight;
    }
        public static double convertHeightToMeters(double height, int cmInMeters, double cmInInches)
    {
        double heightToMeters;
        heightToMeters = cmInMeters/(height * cmInInches);
        return heightToMeters;
    }
        public static double convertWeightToKg(double weight, int gramsInKg, double gramsInPounds)
    {
        double weightToKg;
        weightToKg = gramsInKg/(weight * gramsInPounds);
        return weightToKg;
    }
        public static double calculateBMI(double weightToKg, double heightToMeters)
    {
        double convertBmi;
        convertBmi = weightToKg/(heightToMeters * heightToMeters);
        return convertBmi;
    }
        public static void displayResults(double convertBmi)
    {
        System.out.println("____________________________________________________");
        System.out.println("The person's bmi is: "+convertBmi);
        System.out.println("____________________________________________________");
    }
        public static void displayEofMessage(String eofMess)
    {
        System.out.println(eofMess);
        System.out.println("____________________________________________________");
    }
        
    public static void main(String[] args) {
        // Declarations
        double heightInInches;
        int quit = 0;
        double weightInPounds;
        double heightInMeters;
        double weightInKg;
        double bmi;
        double cmInInches = 2.54;
        int cmInMeters = 100;
        double gramsInPound = 453.59;
        int gramsInKg = 1000;
        String eofMessage = "End of job.";
        
        //housekeepingTasks
        heightInInches = getHeight(quit);
        while (heightInInches != quit)
        {
            //detailLoopTasks
            weightInPounds = getWeight();
            heightInMeters = convertHeightToMeters(heightInInches, cmInMeters, cmInInches);
            weightInKg = convertWeightToKg(weightInPounds, gramsInKg, gramsInPound);
            bmi = calculateBMI(weightInKg, heightInMeters);
            displayResults(bmi);
            heightInInches = getHeight(quit);
        }
        //endOfJobTasks
        displayEofMessage(eofMessage);
    }
    
}

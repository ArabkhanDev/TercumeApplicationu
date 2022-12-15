/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.appilcationSualCavab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author SMART
 */
public class ApplicationSualCavab {
    public static void SualCavab() throws FileNotFoundException{
        // words.txt faylini oxumaq uchun fayl yigini aciriq
        File inputFile = new File("C:\\menimFaylim\\words.txt");
        Scanner fileScanner = new Scanner(inputFile);

// hashmap-i yaradiriq
        Map<String, String> words = new HashMap<>();

// words.txt faylini oxuyuruq ve hashmap-e doldururuq
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(",");
            words.put(parts[0], parts[1]);
        }

// mushteriden dil sechimini sorushuruq
        System.out.println("Sual ingilisce sorushulsun yoxsa Azerbaycan dilinde?");
        Scanner inputScanner = new Scanner(System.in);
        String choice = inputScanner.nextLine();

// mushterinin secdiyi dil uchun sozleri random olaraq sorushuruq
        if (choice.equals("Ingilisce")) {
            // Ingilisce dilinde sorushma
            for (String key : words.keySet()) {
                System.out.println(key + " nedir?");
                String answer = inputScanner.nextLine();
                if (answer.equals(words.get(key))) {
                    System.out.println("Duzgun!");
                } else {
                    // sehv cavab yazilibsa 3 defe yene sorushur
                    for (int i = 0; i < 3; i++) {
                        System.out.println(key + " nedir?");
                        answer = inputScanner.nextLine();
                        if (answer.equals(words.get(key))) {
                            System.out.println("Duzgun!");
                            break;
                        }
                    }
                    // duz cavab gosterilir
                    System.out.println("Duz cavab: " + words.get(key));
                }
            }
        } else if(choice.equals("Azerbaycanca")){
            // Azerbaycan dilinde sorushma
            for (String key : words.keySet()) {
                System.out.println(words.get(key) + " nedir?");
                String answer = inputScanner.nextLine();
                if (answer.equals(key)) {
                    System.out.println("Duzgun!");
                } else {
            // sehv cavab yazilibsa 3 defe yene sorushur
                    for (int i = 0; i < 3; i++) {
                        System.out.println(words.get(key) + " nedir?");
                        answer = inputScanner.nextLine();
                        if (answer.equals(key)) {
                            System.out.println("Duzgun!");
                            break;
                        }
                    }
                // duz cavab gosterilir
                    System.out.println("Duz cavab: " + key);
                }
            }
        }else{
            System.out.println("zehmet olmasa dili duzgun daxil edin");
            SualCavab();
            
        }
    }
}

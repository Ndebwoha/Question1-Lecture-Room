/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

import java.util.Scanner;

/**
 *
 * @author Ndebwoha
 */
public class main_programme {
    public static void main(String[] args) {
        LectureRoom room = new LectureRoom();
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Main Menu:");
            System.out.println("W: Add students");
            System.out.println("X: Remove students");
            System.out.println("Y: Turn on a light");
            System.out.println("Z: Turn off a light");
            System.out.println("Q: Quit");
            System.out.println("Enter your choice: ");
            choice = scanner.next().charAt(0);
        
            switch (choice) {
                case 'W' -> {
                    System.out.print("Enter number of students to add: ");
                    int addStudents = scanner.nextInt();
                    room.addStudents(addStudents);
                    System.out.println("Added " + addStudents + " students. Total students: " + room.getNumberOfStudents());
                }
                case 'X' -> {
                    System.out.print("Enter number of students to remove: ");
                    int removeStudents = scanner.nextInt();
                    room.removeStudents(removeStudents);
                    System.out.println("Removed " + removeStudents + " students. Total students: " + room.getNumberOfStudents());
                }
                case 'Y' -> {
                    System.out.print("Enter light number to turn on (1, 2, or 3): ");
                    int lightOn = scanner.nextInt();
                    room.turnOnLight(lightOn);
                    System.out.println("Light " + lightOn + " is now " + (room.isLightOn(lightOn) ? "on" : "off"));
                }
                case 'Z' -> {
                    System.out.print("Enter light number to turn off (1, 2, or 3): ");
                    int lightOff = scanner.nextInt();
                    room.turnOffLight(lightOff);
                    System.out.println("Light " + lightOff + " is now " + (room.isLightOn(lightOff) ? "on" : "off"));
                }
                case 'Q' -> System.out.println("Quitting program.");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'Q');

        scanner.close();
    }
}
    


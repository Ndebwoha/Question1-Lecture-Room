/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
public class LectureRoom {
    private int numberOfStudents;
    private boolean[] lights;
    public LectureRoom() {
        this.numberOfStudents = 0;
        this.lights = new boolean[3]; // Three lights are all initially off
    }
    public void addStudents(int num) {
        this.numberOfStudents += num;
    }
    public void removeStudents(int num) {
        this.numberOfStudents = Math.max(0, this.numberOfStudents - num);
    }
    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            this.lights[lightNumber - 1] = true;
        }
    }
     public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            this.lights[lightNumber - 1] = false;
        }
    }
    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }
    public boolean isLightOn(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            return this.lights[lightNumber - 1];
        }
        return false;
    }
}

        
    


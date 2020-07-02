package guitar;

import java.awt.Color;
import java.util.Random;
import java.util.List;
import java.lang.String;
import java.util.Arrays;
/**
 *
 * Autumn Capasso
 * UMUC
 * CMIS 141
 *Homework
 *Guitar Class Assignment
 **/

//Guitar class
public class Guitar {

//private data feilds
    private int numStrings = 6;
    private double guitarLength = 28.2;
    private String guitarManufacturer = "Gibson";
    private Color guitarColor = Color.red;
    private List<String> noteValue = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
    private List<String> duration = Arrays.asList("(.25)", "(.5)", "(1)", "(2)", "(4)");
    private Random randomGenerator = new Random();


    public String playGuitar() {
        List<String> notes = Arrays.asList();

        for (int i = 0; i<16; i++) {
            String newNote = noteValue.get(randomGenerator.nextInt(6));
            newNote += duration.get(randomGenerator.nextInt(5));
            notes.add(newNote);
        }
        return notes.toString();
    }

    public String toString() {
        String guitarDescription = "(numStrings: " + numStrings + ", " +
                "Length: " + guitarLength + ", " +
                "Manufaturer: " + guitarManufacturer + ", " +
                "Color: " + guitarColor;
        return guitarDescription;
    }

    // Constructor
    public Guitar(){}

    public Guitar(int strings, double length, String manufacturer, Color color) {
        this.numStrings = strings;
        this.guitarLength = length;
        this.guitarManufacturer = manufacturer;
        this.guitarColor = color;
    }
// Getter methods
    public int getNumStrings(){
        return numStrings;
    }

    public double getGuitarLength() {
        return guitarLength;
    }

    public String getGuitarManufacturer() {
        return guitarManufacturer;
    }

    public Color getGuitarColor() {
        return guitarColor;
    }
}

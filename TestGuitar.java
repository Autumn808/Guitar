import java.awt.Color;
import java.lang.String;
/**
 *
 * Autumn Capasso
 * UMUC
 * CMIS 141
 *Homework
 *HeadPhones Class Assignment
 **/

//HeadPhones test class
public class TestHeadPhones {

    public static void main(String args[])

     {
        // TestGuitar1 that has 7 strings, 30.2 length, brand is Fender and color is  black
        Guitar testGuitar1 = new Guitar(7, 30.2, "Fender", Color.black);
        System.out.println("toString(): " + testGuitar1.toString());
        System.out.println("getNumStrings(): " + testGuitar1.getNumStrings());
        System.out.println("getGuitarLength(): " + testGuitar1.getGuitarLength());
        System.out.println("getGuitarManufacturer(): " + testGuitar1.getGuitarManufacturer());
        System.out.println("getGuitarColor(): " + testGuitar1.getGuitarColor().toString());
        System.out.println("playGuitar(): " + testGuitar1.playGuitar());

        // TestGuitar2 that has 5 strings, 20.5 length, brand is  Basic and color is  green

        Guitar testGuitar2 = new Guitar(5, 25.5, "Basic", Color.green);
        System.out.println("toString(): " + testGuitar2.toString());
        System.out.println("getNumStrings(): " + testGuitar2.getNumStrings());
        System.out.println("getGuitarLength(): " + testGuitar2.getGuitarLength());
        System.out.println("getGuitarManufacturer(): " + testGuitar2.getGuitarManufacturer());
        System.out.println("getGuitarColor(): " + testGuitar2.getGuitarColor().toString());
        System.out.println("playGuitar(): " + testGuitar2.playGuitar());;

        // TestGuitar3 that has 10 strings, 40.2 length, brand is Target and color is a orange

        Guitar testGuitar3 = new Guitar(10, 40.2, "Target", Color.orange);
        System.out.println("toString(): " + testGuitar3.toString());
        System.out.println("getNumStrings(): " + testGuitar3.getNumStrings());
        System.out.println("getGuitarLength(): " + testGuitar3.getGuitarLength());
        System.out.println("getGuitarManufacturer(): " + testGuitar3.getGuitarManufacturer());
        System.out.println("getGuitarColor(): " + testGuitar3.getGuitarColor().toString());
        System.out.println("playGuitar(): " + testGuitar3.playGuitar());;
    }
}

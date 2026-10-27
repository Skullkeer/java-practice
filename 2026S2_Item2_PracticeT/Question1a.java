/*
 * Java submission file
 *
 * ITEM 2 (PRACTICE - TERTIARY) - QUESTION 1
 *
 * Provide your responses for Q1 here.
 * Unless otherwise indicated, no other files will be assessed for this question.
 *
 * If you delete a file or it is otherwise missing from your submission,
 * you will automatically score 0 for the question.
 * If you think you are missing a file, ask your teacher for help.
 *
 * Test your code! Read any errors reported by the compiler or runtime and fix them.
 * ** Code which does not compile or throws unhandled exceptions will be heavily penalized! **
 *
 * Avoid the use of any imports/libraries which were not covered in our lesson notes.
 * When in doubt about whether you can include something, ask your teacher.
 *
 * Comment your code if it helps you, but only working code will earn marks.
 * Do your best to write a functional program, even if it is not perfect.
 *
 * When writing your Java program, prioritize:
 * 1. Correctness - the program should do what is required by the question
 * 2. Simplicity - do not use a more complex technique when a simpler one will do
 * 3. Style - natural naming for variables and methods, appropriate indentation, etc.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

interface MapMarker {
    String label();
}

public class Question1a {

    static void main(String[] args) {
        ShopMarker s = new ShopMarker();
        ParkMarker p = new ParkMarker();
        ArrayList<MapMarker> arrayList = new ArrayList<>();
        arrayList.add(s);
        arrayList.add(p);

        for (MapMarker marker : arrayList) {
            System.out.println(marker.label());
        }

    }


}

class ShopMarker implements MapMarker {

    @Override
    public String label() {
        return "Shop";
    }
}

class ParkMarker implements MapMarker {

    @Override
    public String label() {
        return "Park";
    }
}
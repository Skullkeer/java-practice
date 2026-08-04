import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {

    public static void main() {
        int[] nums = new int[5];
        int[] nums2 = {1, 2, 3, 4, 5, 6};
//        System.out.println(nums2[2]);
//        System.out.println(nums[0]);

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
        System.out.println("length of nums: " + nums2.length);

        System.out.println();

        String[] bestBuddies = {"Jadey", "Drew", "Teijo"};

        for (int f = 0; f < bestBuddies.length; f++) {
            System.out.println("Friend " + (f + 1) + ": " + bestBuddies[f]);
        }

        System.out.println();

//        for each loop
        for (int number : nums2) {
            if (number % 2 == 0)
                System.out.println(number);

        }

//        -------------------------------------------------------------------------------

//      ARRAY LIST

        List<String> awesomeProgrammers = new ArrayList<>();
        awesomeProgrammers.add("Jadey");
        awesomeProgrammers.add("Willow");
        awesomeProgrammers.add("Drew");
        for (String name : awesomeProgrammers) {
            System.out.println("Programmer: " + name);
        }

        System.out.println();

        for (String name : awesomeProgrammers) {
            if (name.startsWith("J"))
            System.out.println("My Sweetie: " + name);
        }

        System.out.println();

        awesomeProgrammers.add("Teijo");
        awesomeProgrammers.remove(0);

        for (String name : awesomeProgrammers) {
            System.out.println("Programmer: \n " + name);
        }

        Map<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Mango", 4);
        fruitCount.put("Bannana", 2);
        fruitCount.put("Apple", 3);

        System.out.println();
        for (String name : fruitCount.keySet()) {
            System.out.println(name + ": " + fruitCount.get(name));
        }
        

    }

}

package CollectionIntergration;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Diddy Butter", 111, 200);
        Product pr2 = new Product("Diddy Butter Max Mode", 111, 200);

        System.out.println(pr1.equals(pr2));

        HashSet<Product> hashSet = new HashSet<>();
        hashSet.add(pr1);
        hashSet.add(pr2);
//        System.out.println(hashSet.size());

        TreeSet<Product> treeSet = new TreeSet<>();
        treeSet.add(pr1);
        treeSet.add(pr2);
        System.out.println(treeSet);

    }
}

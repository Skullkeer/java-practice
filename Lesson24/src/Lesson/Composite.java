package Lesson;

import java.util.ArrayList;
import java.util.List;

public class Composite {

    interface MenuPart {
        void show(String indent);
    }

    static class MenuItem implements MenuPart {
        private final String name;

        MenuItem(String name) {
            this.name = name;
        }

        @Override
        public void show(String indent) {
            System.out.println(indent + name);
        }
    }

    static class Menu implements MenuPart{
        private final String name;
        private final List<MenuPart> children = new ArrayList<>();

        Menu(String name) {
            this.name = name;
        }

        void add(MenuPart part) {
            children.add(part);
        }

        void remove(MenuPart part) {
            children.remove(part);
        }

        @Override
        public void show(String indent) {
            System.out.println(indent + name);
            for (MenuPart c : children) {
                c.show(indent + indent);
            }
        }
    }

    public static void main() {
        Menu menu = new Menu("File");
        menu.add(new MenuItem("Open File"));
        menu.add(new MenuItem("Move"));
        Menu newMenu = new Menu("New");
        newMenu.add(new MenuItem("Java Project"));
        Menu recentMenu = new Menu("Recent Files");
        recentMenu.add(new MenuItem("Clear Recent"));

        menu.add(newMenu);
        menu.add(recentMenu);
        menu.show("  ");
    }

}

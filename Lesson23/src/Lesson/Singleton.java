package Lesson;

public class Singleton {

    static final class Settings {
        private static final Settings INSTANCE = new Settings();


        private Settings() {

        }

        static Settings getInstance() {
            return INSTANCE;
        }

        String getCurrentTheme() {
            return "dark";
        }

    }

    public static void main() {
        Settings first = Settings.getInstance();
        System.out.println("Calender theme: " + first.getCurrentTheme());


        Settings second = Settings.getInstance();

        System.out.println("Theme: " + second.getCurrentTheme());

    }

}

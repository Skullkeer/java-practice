package Lesson;

public class Adapter {
    interface Printable {
        void print(String text);
    }

    static class LegacyPrinter {
        void printOld(String text) {
            System.out.println("Old: " + text);
        }
    }

    static class PrinterAdapter implements Printable {

        private final LegacyPrinter oldPrinter;

        PrinterAdapter(LegacyPrinter oldPrinter) {
            this.oldPrinter = oldPrinter;
        }

        @Override
        public void print(String text) {
            // tweaking
            // redesigning
            oldPrinter.printOld(text);
        }

    }

    public static void main() {
        Printable printer = new PrinterAdapter(new LegacyPrinter());
        printer.print("hi!");

    }

}

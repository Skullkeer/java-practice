package Lesson;

import java.io.File;

public class Proxy {
    interface FileAccess {
        void read();
    }

    static class RealFile implements FileAccess {

        @Override
        public void read() {
            System.out.println("File Contents...");
        }
    }

    static class FileProxy implements FileAccess {
        private RealFile file;
        private final String role;

        FileProxy(String role) {
            this.role = role;
        }

        @Override
        public void read() {
            if (!role.equals("admin")) {
                System.out.println("Error! Access Denied");
                return;
            }
            if (file == null) {
                file = new RealFile();
            }
            file.read();
        }
    }

    public static void main() {
        new FileProxy("guest").read();
        new FileProxy("admin").read();
    }

}

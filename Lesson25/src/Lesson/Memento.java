package Lesson;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    // context
    static class Editor {
        private String text = "";

        void setText(String text) {
            this.text = text;
        }

        String getText() {
            return text;
        }

        Snapshot save() {
            return new Snapshot(text);
        }

        public void restore(Snapshot snapshot) {
            this.text = snapshot.text;
        }

    }

    // memento
    static class Snapshot {
        private final String text;

        private Snapshot(String text) {
            this.text = text;
        }

    }

    // caretaker
    static class History {
        private final List<Editor.Snapshot> snapshots = new ArrayList<>();

        void save(Editor editor) {
            snapshots.add(editor.save());
        }

        void undo(Editor editor) {
            int last = snapshots.size() - 1;
            editor.restore(snapshots.remove(last));
        }
    }

    public static void main() {

    }

}

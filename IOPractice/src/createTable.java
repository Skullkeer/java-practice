public class createTable {
    public static void create_table(int rows, int cols, String names) {
        StringBuilder sb = new StringBuilder();
        Object[] args = new Object[cols];

        for (int i =0; i < cols; i++) {
            sb.append("%10s ");
            args[i] = names;
        }
        sb.append("%n");
        for (int i = 0; i < rows; i++) {
            System.out.printf(sb.toString(), args);
        }
    }
}

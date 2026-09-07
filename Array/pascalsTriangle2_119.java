import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle2_119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        long val = 1;
        for (int i = 1; i <= rowIndex; i++) {
            val = val * (rowIndex - i + 1) / i;
            row.add((int) val);
        }

        return row;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> result = getRow(rowIndex);
        System.out.println("Row " + rowIndex + " of Pascal's Triangle is: " + result);
    }
}
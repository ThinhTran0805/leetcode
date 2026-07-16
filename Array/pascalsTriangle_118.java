import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle_118 {
    public static void main(String[] args) {
        pascalsTriangle_118 sol = new pascalsTriangle_118();
        int rowNums = 5;
        List<List<Integer>> result = sol.pascalsTriangle(rowNums);
        System.out.println("Pascal's Triangle for " + result + " line.");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }

    public List<List<Integer>> pascalsTriangle(int rowNums) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (rowNums == 0) {
            return triangle;
        }

        for (int i = 0; i < rowNums; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = triangle.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}

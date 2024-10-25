import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Solution1 {
        public List<String> removeSubfolders(String[] folder) {
            Arrays.sort(folder);
            List<String> list = new ArrayList<>();

            for (String f : folder) {
                if (list.isEmpty() || !f.startsWith(list.get(list.size() - 1) + "/")) {
                    list.add(f);
                }
            }
            return list;
        }

        public static void main(String[] args) {
            Solution1 solution1 = new Solution1();

            String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
            List<String> result = solution1.removeSubfolders(folder);

            System.out.println("Folders after removing subfolders: " + result);
        }
    }


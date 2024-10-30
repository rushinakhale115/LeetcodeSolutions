import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        this.requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.add(t);
        while (requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }
}

public class Numberofrecentcalls {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        // Test cases
        System.out.println(counter.ping(1));     // Output: 1
        System.out.println(counter.ping(100));   // Output: 2
        System.out.println(counter.ping(3001));  // Output: 3
        System.out.println(counter.ping(3002));  // Output: 3
    }
}

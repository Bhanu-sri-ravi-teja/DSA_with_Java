import java.util.*;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double gainA = gain(a[0], a[1]);
            double gainB = gain(b[0], b[1]);
            return Double.compare(gainB, gainA);
        });

        for (int[] c : classes) {
            pq.offer(c);
        }

        while (extraStudents-- > 0) {
            int[] c = pq.poll();

            c[0]++;
            c[1]++;

            pq.offer(c);
        }

        double sum = 0;

        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            sum += (double) c[0] / c[1];
        }

        return sum / classes.length;
    }

    private double gain(int pass, int total) {
        return (double) (pass + 1) / (total + 1) - (double) pass / total;
    }
}
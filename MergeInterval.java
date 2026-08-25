import java.util.*;

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals based on starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // Start with the first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            // Overlapping intervals
            if (currentStart <= end) {

                end = Math.max(end, currentEnd);

            } else {

                // No overlap
                result.add(new int[]{start, end});

                start = currentStart;
                end = currentEnd;
            }
        }

        // Add the last interval
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = merge(intervals);

        System.out.println("Merged Intervals:");

        for (int[] interval : result) {

            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}
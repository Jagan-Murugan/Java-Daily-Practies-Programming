class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans =0;
        for(int i = 0;i<seats.length;i++){
            int max = Math.max(seats[i],students[i]);
            int min = Math.min(seats[i],students[i]);

            ans += max - min;
        }
        return ans;
    }
}
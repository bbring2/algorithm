class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int reachTime = arrivalTime+delayedTime;
        
        if(reachTime >= 24) {
            return reachTime-24;
        } else {
            return reachTime;
        }
    }
}
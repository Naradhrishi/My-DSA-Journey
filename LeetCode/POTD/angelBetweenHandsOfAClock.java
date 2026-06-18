class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12) hour = 0;
        return Math.abs((hour*30) - (5.5*minutes)) > 180 ? 360 - Math.abs((hour*30) - (5.5*minutes)) : Math.abs((hour*30) - (5.5*minutes));
    }
}
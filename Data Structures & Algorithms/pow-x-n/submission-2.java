
class Solution {
    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            x = 1.0 / x;
            power = -power;
        }

        return Math.pow(x, power);
    }
}

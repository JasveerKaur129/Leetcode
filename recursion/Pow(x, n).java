class Solution {
    public double myPow(double x, int n) {
	if (n == 0) {
		return 1;
	}
	double power = myPow(x, n / 2);
	if (n % 2 == 0) {
		return power * power;
	} else {
		if (n > 0) {
			return (x * power * power);
		} else {
			return (power * power) / x;
		  }
	  }
  }    
}

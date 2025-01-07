class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int original = x;

        if (x < 0) {
			original = original * -1;
		}

        while (original > 0) {
          int remainder = original % 10;

       if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && remainder > 7)) {
    return 0; // This would cause an overflow
}
if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && remainder < -8)) {
    return 0; // This would cause an underflow
}

          reverse = (reverse * 10) + remainder ;
          original /= 10;  
        }

        

        if (x < 0) {
            reverse = reverse * -1;
        }
       

        return reverse;

        
    }
}
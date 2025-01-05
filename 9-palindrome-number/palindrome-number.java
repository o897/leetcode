class Solution {
    public boolean isPalindrome(int x) {
        // turn number intw
        int original = x;
        int reverse = 0;


        if (x < 0 ) {
            return false;       
        };

			while (original > 0) {
		        int remainder = original % 10;
		        reverse = (reverse * 10) + remainder;
		        original /= 10;   
		    }

        return x == reverse;

    }
}
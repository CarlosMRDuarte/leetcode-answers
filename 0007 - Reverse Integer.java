class Solution {
    public int reverse(int x) {
        Boolean isNegative = x < 0;
        
        String val = String.valueOf(x);

        if (isNegative) {
            val = val.replace("-", "");
        } 
        try {
            int r = Integer.valueOf(new StringBuilder(val).reverse().toString());
            return isNegative ? r*-1 : r;
        } catch (NumberFormatException ex) {
            return 0;
        }
        
    }
}

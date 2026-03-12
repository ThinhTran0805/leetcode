
public class romanToInteger_013 {

    public static void main(String[] args) {

        romanToInteger_013 sol = new romanToInteger_013();
        String s = "MCMXCIV";
        int result = sol.romanToInt(s);
        System.out.println("The value of String " + s + " is: " + result);
    }

    private int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:
                throw new IllegalArgumentException("Character " + c + " is not accept!");
        }
    }

    public int romanToInt(String s) {

        int total = 0;

        for(int i = 0; i < s.length(); i++){
            int curr = value(s.charAt(i));

            if(i < s.length() - 1 && curr < value(s.charAt(i + 1))){
                total -= curr;
            } else {
                total += curr;
            }
        }

        return total;
    }


//    //Solution 2: right to left
//    public int romanToInt (String s) {
//        int total = 0;
//        int prev = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int curr = value(s.charAt(i));
//            if (curr < prev) {
//                total -= curr;
//            } else {
//                total += curr;
//            }
//            prev = curr;
//        }
//        return total;
//    }
}



// https://leetcode.com/problems/letter-combinations-of-a-phone-number

class PhonePad {
    static String[] map = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void main(String[] args){
        pad("", "23");
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        String letters = map[digit];
        for(char ch : letters.toCharArray()){
            pad(p + ch, up.substring(1));
        }
    }
}




// Step 3: Subtraction

// When you subtract two characters in Java, you’re really subtracting their ASCII (numeric) values.

// Example:

// '1' - '0' = 49 - 48 = 1
// '2' - '0' = 50 - 48 = 2
// '9' - '0' = 57 - 48 = 9


// So this expression converts the character digit into an integer digit.




// ----------------by using the arraylist------------------
// import java.util.*;

// class PhonePad {
//     static String[] map = {
//         "",     // 0
//         "",     // 1
//         "abc",  // 2
//         "def",  // 3
//         "ghi",  // 4
//         "jkl",  // 5
//         "mno",  // 6
//         "pqrs", // 7
//         "tuv",  // 8
//         "wxyz"  // 9
//     };

//     public static void main(String[] args) {
//         ArrayList<String> result = pad("", "23");
//         System.out.println(result);
//     }

//     static ArrayList<String> pad(String p, String up) {
//         if (up.isEmpty()) {
//             ArrayList<String> list = new ArrayList<>();
//             list.add(p);
//             return list;
//         }

//         int digit = up.charAt(0) - '0'; // converts char '2' into int 2
//         String letters = map[digit];
//         ArrayList<String> ans = new ArrayList<>();

//         for (char ch : letters.toCharArray()) {
//             ans.addAll(pad(p + ch, up.substring(1)));
//         }

//         return ans;
//     }
// }

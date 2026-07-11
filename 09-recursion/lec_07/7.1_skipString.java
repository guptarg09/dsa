class Solution {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip2("", "baccad"));
        System.out.println(skip3("baccad"));
    }

    // prints directly
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // returns a string (with accumulator 'p')
    static String skip2(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(p, up.substring(1));
        } else {
            return skip2(p + ch, up.substring(1));
        }
    }

    // (without accumulator)
    static String skip3(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip3(up.substring(1)); 
        } else {
            return ch + skip3(up.substring(1)); 
        }
    }
}

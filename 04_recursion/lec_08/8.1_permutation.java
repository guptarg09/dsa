import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        permutation("", "abc");
        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        
        // recusive calls are increased at every level through loop
        for(int i = 0; i <= p.length(); i++){ 
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f+ch+s, up.substring(1));
        }
    }

    // by using the arraylist
    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call 
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationList(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}
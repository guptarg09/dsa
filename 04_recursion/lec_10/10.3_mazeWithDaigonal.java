import java.util.ArrayList;
public class mazePath{
    public static void main(String[] args){
        pathDaigonal("", 3, 3);
        System.out.println(pathRetDaigonal("", 3, 3));
    }
    static void pathDaigonal(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
         if(r > 1){
            pathDaigonal(p + 'V', r-1, c);
        }
        if(c > 1){
            pathDaigonal(p + 'H', r, c-1);
        }
        if(r > 1 && c > 1){
            pathDaigonal(p + 'V', r-1, c-1);
        }
    }

    // --------------using ArrayList----------------
    static ArrayList<String> pathRetDaigonal(String p, int r, int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(pathRetDaigonal(p + 'V', r-1, c));
        }
        if(c > 1){
            ans.addAll(pathRetDaigonal(p + 'H', r, c-1));
        }
        if(r > 1 && c > 1){
            ans.addAll(pathRetDaigonal(p + 'H', r-1, c-1));
        }
        return ans;
    }
}
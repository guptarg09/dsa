public class dice{
    public static void main(String[] args){
        Dice("", 4, 6);
    }
    static void Dice(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= face && i <= target; i++){
            Dice(p + i, target - i, face);
        }
    }
}


// ----------------------using the list-----------------------


// import java.util.ArrayList;
// public class dice{
//     public static void main(String[] args){
//         System.out.println(DiceRet("", 4, 6));
//     }
//     static ArrayList<String> DiceRet(String p, int target, int face){
//         if(target == 0){
//             ArrayList<String> list = new ArrayList<>();
//             list.add(p);
//             return list;
//         }
        
        // ArrayList<String> list = new ArrayList<>();
//         for(int i = 1; i <= face && i <= target; i++){
//             list.addAll(DiceRet(p + i, target - i, face));
//         }
//         return list;
//     }
// }


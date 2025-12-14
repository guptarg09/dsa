class Main {
    public static void main(String[] args) {
        triangle(4, 0);
    }
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            triangle(r, c+1);
        }
        else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
}



// class Main {
//     public static void main(String[] args) {
//         triangle(1, 0);
//     }
//     static void triangle(int r, int c){
//         if(r == 5){
//             return;
//         }
//         if(r > c){
//             System.out.print("*");
//             triangle(r, c+1);
//         }
//         else{
//             System.out.println();
//             triangle(r+1, 0);
//         }
//     }
// }
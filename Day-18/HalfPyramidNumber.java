// 1
// 12
// 123
// 1234


public class HalfPyramidNumber {
    public static void main(String args[]){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                if(i>=j){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

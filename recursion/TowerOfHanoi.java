public class TowerOfHanoi {

    static int towerOfHanoi(int n, int from, int to, int aux){
        if(n==1){
            System.out.println("move rod "+n+" from rod "+from+" to rod "+to);
            return 1;
        }
        int count =0;
        count+=towerOfHanoi(n-1,from,aux,to);
        System.out.println("move rod "+n+" from rod "+from+" to rod "+to);
        count++;
        count+=towerOfHanoi(n-1,aux,to,from);
        return count;
    } 
    public static void main(String[] args) { 
        System.out.println(towerOfHanoi(3,1,2,3));
    }
}

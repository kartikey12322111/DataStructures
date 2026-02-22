public class TowerOfHanoi {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if(n==0) return 0;
        return (int)Math.pow(2,n)-1;
    }
}

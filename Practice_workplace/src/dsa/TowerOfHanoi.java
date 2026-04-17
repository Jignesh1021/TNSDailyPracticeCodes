package dsa;

public class TowerOfHanoi {

    static void solve(int n, char src, char dest, char helper) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        solve(n - 1, src, helper, dest);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        solve(n - 1, helper, dest, src);
    }

    public static void main(String[] args) {
        solve(3, 'A', 'C', 'B');
    }
}
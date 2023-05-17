public class Enemy extends Character{
    public void move () {
        System.out.println("Enemy bergerak");
    }
    public void move (int step) { 
        System.out.println("Enemy bergerak" + step + "step(s)");
    }
}

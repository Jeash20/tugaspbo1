public class App {
        public static void main(String[] args) {
            Character character = new Character();
            Hero hero = new Hero();
            Enemy enemy = new Enemy();
            Fighter fighter = new Fighter();
            Witch witch = new Witch();
    
            // Memanggil metode move() dari masing-masing objek
            character.move();
            hero.move();
            hero.move("North");
            enemy.move();
            enemy.move(5);
            fighter.move();
            witch.move();
        }
    }
    
    class Character {
        public void move() {
            System.out.println("Character bergerak.");
        }
    }
    
    class Hero extends Character {
        public void move() {
            System.out.println("Hero bergerak.");
        }
    
        public void move(String direction) {
            System.out.println("Hero bergerak ke arah " + direction + ".");
        }
    }
    
    class Enemy extends Character {
        public void move() {
            System.out.println("Enemy bergerak.");
        }
    
        public void move(int step) {
            System.out.println("Enemy bergerak sebanyak " + step + " langkah.");
        }
    }
    
    class Fighter extends Character {
        public void move() {
            System.out.println("Fighter bergerak.");
        }
    }
    
    class Witch extends Character {
        public void move() {
            System.out.println("Witch bergerak.");
        }
    }
    

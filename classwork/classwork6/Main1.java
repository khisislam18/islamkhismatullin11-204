public class Main1 {
    public static void main(String[] args) {
        Weapon blade = new Weapon(7, 6, "Obsidian", 7);
        blade.dangerCheck();
        blade.addMaterial("Gold");
        blade.testFighting();
        blade.cutTest();
    }
}

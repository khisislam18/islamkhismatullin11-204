public abstract class Blade{
    int sharpness;
    String material;
    int length;

    public Blade(int sharpness, String material, int length){
        this.sharpness = sharpness;
        this.material = material;
        this.length = length;
    }

    abstract void dangerCheck();
    void addMaterial(String newMaterial){
        material += ", " + newMaterial;
        System.out.println("Material added: " + material);
    }
}

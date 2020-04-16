public class SimpleArray {
    public static void main(String[]args) {

        String[] materials = new String[5];
        materials[0] = "wood";
        materials[1] = "steel";
        materials[2] = "glass";
        materials[3] = "aluminium";
        materials[4] = "composite";

        String mainMaterial = materials[3];
        int numOfMaterials = materials.length;
        System.out.println("Project involves " + numOfMaterials + " materials.");
        System.out.println("Main material: " + mainMaterial + ".");
    }
}

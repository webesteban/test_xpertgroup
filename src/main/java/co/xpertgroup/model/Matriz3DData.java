package co.xpertgroup.model;

public class Matriz3DData {

    public static int N = 2;

    private static int[][][] instance = null;
    public static int[][][] getInstance(){
        if(instance == null){
            instance = Matriz3DData.getMatriz3D();
            Matriz3DData.populateMatriz3D();
        }
        return instance;
    }

    public static int[][][] getMatriz3D() {

        int[][][] matriz3D = new int[N][N][N];

        return matriz3D;
    }

    public static void populateMatriz3D() {

        for (int i = 0; i<N; i++) {
            for (int j =0; j<N; j++) {
                for (int k = 0; k<N; k++) {
                    instance[i][j][k] = 0;
                }

            }

        }

    }

}

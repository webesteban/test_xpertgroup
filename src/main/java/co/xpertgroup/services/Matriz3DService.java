package co.xpertgroup.services;

import co.xpertgroup.model.Matriz3DData;

public class Matriz3DService {

    int[][][] matriz3DMockup = Matriz3DData.getInstance();


    public boolean updateMatriz(int x,int y,int z, int value){
        matriz3DMockup[x][y][z] = value;
        return true;
    }


    public int queryMatriz(int x,int y,int z, int x2,int y2,int z2){
        int sumTotal = 0;

        for (int i = x; i<x2; i++) {
            for (int j =y; j<y2; j++) {
                for (int k = z; k<z2; k++) {
                    sumTotal =sumTotal + matriz3DMockup[i][j][k];
                }

            }
        }
        return sumTotal;
    }
}

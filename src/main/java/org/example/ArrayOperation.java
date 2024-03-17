package org.example;

public class ArrayOperation {
    private int[] mineArray;

    public void setMineArray(int[] mineArray) {
        this.mineArray = mineArray;
    }

    public int[] getMineArray() {
        return mineArray;
    }

    public int[] arrWhile(){
        int i = 0, j;
        while(i != mineArray.length - 1){
            j = i + 1;
            while(j != mineArray.length){
                if(mineArray[j] < mineArray[i]){
                    int tmd = mineArray[i];
                    mineArray[i] = mineArray[j];
                    mineArray[j] = tmd;
                }
                j++;
            }
            i++;
        }
        return mineArray;
    }
}

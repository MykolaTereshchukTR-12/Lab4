package org.example;

public class ArrayOperation {
    private int[] mineArray;

    public ArrayOperation(int[] _array) {
        this.mineArray = _array;
    }

    public int[] getMineArray() {
        return mineArray;
    }

    public void setMineArray(int[] _mineArray) {
        this.mineArray = _mineArray;
    }

    public void arrWhile(){
        int i = 0, j = 0;
        while(i <= (mineArray.length - 1)) {
            while(j <= mineArray.length) {
                if (mineArray[i] >= mineArray[j]) {
                    int m = mineArray[j];
                    mineArray[j] = mineArray[i];
                    mineArray[i] = m;
                }
                j++;
            }
            i++;
        }
    }
}

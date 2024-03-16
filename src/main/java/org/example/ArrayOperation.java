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
        while(i < mineArray.length) {
            while(j < (mineArray.length - i)) {
                if (mineArray[j] < mineArray[j+i]) {
                    int m = mineArray[i+1];
                    mineArray[i+1] = mineArray[i];
                    mineArray[i] = m;
                }
                j++;
            }
            i++;
        }
    }
}

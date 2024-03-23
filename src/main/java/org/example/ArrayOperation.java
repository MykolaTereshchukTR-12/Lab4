package org.example;

public class ArrayOperation {
    private int[] mineArray;

    public void setMineArray(int[] _arr) {
        this.mineArray = _arr;
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

    public int[] arrFor(int flag) {
        for (int i = 0; i != mineArray.length - 1; i++) {
            for (int j = i + 1; j != mineArray.length; j++) {
                if(flag == 1) {
                    if (mineArray[j] < mineArray[i]) {
                        int tmd = mineArray[i];
                        mineArray[i] = mineArray[j];
                        mineArray[j] = tmd;
                    }
                }else if(flag == 0){
                    if (mineArray[j] > mineArray[i]) {
                        int tmd = mineArray[i];
                        mineArray[i] = mineArray[j];
                        mineArray[j] = tmd;
                    }
                }
            }
        }
        return mineArray;
    }

    public int arrSum(){
        int sum = 0;
        for(int i : mineArray){
            sum += i;
        }
        return sum;
    }

    public int[] arrInvertionOddNumbers(){
        for(int i = 0; i != mineArray.length; i++){
            if(mineArray[i] % 2 == 1){
                mineArray[i] *= -1;
            }
        }
        return mineArray;
    }
}
package org.example;

public class FiftyEvenOrNonEven {
    private int[] evenNumber = new int[50];
    private int[] nonEvenNumber = new int[50];

    public int[] getEvenNumber() {
        fillerEven();
        return evenNumber;
    }

    public void setEvenNumber(int[] evenNumber) {
        this.evenNumber = evenNumber;
    }

    public int[] getNonEvenNumber() {
        fillerNonEven();
        return nonEvenNumber;
    }

    public void setNonEvenNumber(int[] nonEvenNumber) {
        this.nonEvenNumber = nonEvenNumber;
    }

    public void fillerEven(){
        for(int i = 0; i <= 49; i++){
            int a = (int) (1000 * Math.random());
            if((a % 2) == 0){
                evenNumber[i] = a;
            }else{
                i--;
            }
        }
    }

    public void fillerNonEven(){
        for(int i = 0; i <= 49; i++){
            int a = (int) (1000 * Math.random());
            if((a % 2) != 0){
                nonEvenNumber[i] = a;
            }else{
                i--;
            }
        }
    }


}

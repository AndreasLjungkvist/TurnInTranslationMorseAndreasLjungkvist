package TranslationMorse;

import java.util.Scanner;

public class TranslationMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String translation ="";
        TranslationLogic logicTrans = new TranslationLogic("");

        logicTrans.putArraysToHashMap();
        //System.out.println(logicTrans.getHMap("A"));
        System.out.println("Give an input to translate:");
        logicTrans.setTextData(scan.nextLine().toUpperCase());
        logicTrans.splitByCommaToArrayList();
        //System.out.println(logicTrans.getArrayList());
        //System.out.println(logicTrans.getArrayList().size());
        //For index up to elements in Arraylist.
        for (int i=0;i<logicTrans.getArrayList().size();i++){
            String hKey = logicTrans.getArrayList().get(i);
            translation += logicTrans.getHMap(hKey) + ",";
        }
        System.out.println(translation);
    }
}

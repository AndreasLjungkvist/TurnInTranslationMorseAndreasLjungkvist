package TranslationMorse;

import java.util.Scanner;

public class TranslationMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String translation ="";
        int inputSwitch;
        boolean running = true;
        TranslationLogic logicTrans = new TranslationLogic("");
        //Import keys and elements to HashMap for bidirectional translation.
        logicTrans.putArraysToHashMap();
        System.out.println("Welcome to the Morse-Eng translation program.");
        while (running){
            System.out.println("What would you like to do:\n" +
                    "1: Add input for translation.\n" +
                    "2: Translate.\n" +
                    "3: Clear Data.\n" +
                    "4: Exit Program");
            inputSwitch = Integer.parseInt(scan.nextLine());
            switch(inputSwitch) {
                case 1:
                    System.out.println("Give an input to translate:\n"+
                            "(Separate letters and corresponding morse signs with comma ex:'a,b,c' or '*,-**'");
                    logicTrans.setTextData(scan.nextLine().toUpperCase());
                    logicTrans.splitByCommaToArrayList();
                    break;
                    //Påbörjad förbättring för att få bort komma från inmatning.
                /*case 1:
                    System.out.println("Give an input to translate:");
                    logicTrans.setTextData(scan.nextLine().toUpperCase());
                    if (logicTrans.getTextData().isLetter("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.? ")){
                        System.out.println("It contained symbols.");
                    }
                    else if (logicTrans.getTextData().contains("*")||logicTrans.getTextData().contains("*") ){
                        System.out.println("Adding to morse.");
                        logicTrans.splitByCommaToArrayList();
                    }else{
                        System.out.println("Something went wrong, try again.");
                    }
                    break;*/
                case 2:
                    for (int i=0;i<logicTrans.getArrayList().size();i++){
                        String hKey = logicTrans.getArrayList().get(i);
                        translation += logicTrans.getHMap(hKey) + ",";
                    }
                    System.out.println(translation);
                    break;
                case 3:
                    logicTrans.clearArrayList();
                    translation ="";
                    System.out.println("Data has been cleared");
                    break;
                case 4:
                    System.out.println("Program ending");
                    running = false;
                    break;
                default:

                    break;
        }

        }
        /*System.out.println("Give an input to translate:");
        logicTrans.setTextData(scan.nextLine().toUpperCase());
        logicTrans.splitByCommaToArrayList();*/
        //System.out.println(logicTrans.getArrayList());
        //System.out.println(logicTrans.getArrayList().size());
        //For index up to elements in Arraylist.
        /*for (int i=0;i<logicTrans.getArrayList().size();i++){
            String hKey = logicTrans.getArrayList().get(i);
            translation += logicTrans.getHMap(hKey) + ",";
        }
        System.out.println(translation);*/
        /* Överbliven kod
        //System.out.println(logicTrans.getHMap("A"));
        //System.out.println(logicTrans.getArrayList());
        //System.out.println(logicTrans.getArrayList().size());
         */
    }
}

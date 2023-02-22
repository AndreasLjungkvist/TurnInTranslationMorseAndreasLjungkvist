package TranslationMorse;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class TranslationLogic {

    String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T",
            "U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0",".","?"," "};
    String[] morse = {"*-","-***","-*-*","-**","*","**-*","--*","****","**","*---","-*-","*-**","--","-*",
            "---","*--*","--*-","*-*","***","-","**-","***-","*--","-**-","-*--","--**","*----","**---","***--","****-",
            "*****","-****","--***","---**","----*","-----","*-*-*-","**--**"," "};
    private HashMap<String,String> transHash= new HashMap<>();
    private String textData;
    private ArrayList<String> commaSeparatedAL= new ArrayList<>();

    public TranslationLogic (String textInput) {
        textData = textInput;
    }
    public void putArraysToHashMap() {
        for (int i=0;i< alphabet.length;i++){
            transHash.put(alphabet[i],morse[i]);
            transHash.put(morse[i],alphabet[i]);
        }
    }

    public String getHMap(String HMKey) {
        return transHash.get(HMKey);
    }

    public String getTextData() {
        return textData;
    }

    public void setTextData(String input){
        textData = input;
    }

    public void splitByCommaToArrayList() {
        String[] commaSeparated = textData.split(",");
        for (int i=0;i< commaSeparated.length;i++) {
            commaSeparatedAL.add(commaSeparated[i]);
        }
    }
    public ArrayList<String> getArrayList() { return commaSeparatedAL;
    }

    public void clearArrayList() {
        commaSeparatedAL.clear();
    }

    //isMorseSymbols kollar inmatningen mot element i array "morse" för bool true or false.
    //isLetter kollar inmatning element mot array för latinska alfabetet.
    public boolean isLetter(String textInAlphabet){
        boolean latBool = false;
        for (int i=0;i<textInAlphabet.length();i++) {
            if (textInAlphabet.contains(alphabet[i])){
                latBool = true;
            }
        }
        return latBool;
    }

    public boolean isMorseSymbols(String textIn){
        boolean latBool = false;
        for (int i=0;i<textIn.length();i++) {
            if (textIn.contains(morse[i])){
                latBool = true;
            }
        }
        return latBool;
    }
    //textDataCommaFormatting tillsammans med isLetter kollar om det är latinska alfabetet,
    //och genererar då komma-separation av sig själv för att underlätta för användaren.
    public String textDataCommaFormatting(){
        String textDataFormatted="";
        for (int i=0;i<textData.length();i++){
            textDataFormatted += textData.charAt(i) +",";
        }
        textData = textDataFormatted;
        return textData;
    }
}
package TranslationMorse;

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

   /* public  getHMap() {
    }

    /*public String setText(String textInput) {

    }*/

}

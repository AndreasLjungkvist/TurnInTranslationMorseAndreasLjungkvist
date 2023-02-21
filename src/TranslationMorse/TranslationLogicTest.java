package TranslationMorse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TranslationLogicTest {
    @Test
    //Create elements and keys from arrays.
    public void getHashMap() {
        //Arrange
        TranslationLogic logicTrans = new TranslationLogic("");
        //Act
        logicTrans.putArraysToHashMap();
        String actual = logicTrans.getHMap("A");
        String expected = "*-";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    //Create elements and keys from arrays.
    public void updateHashMap() {
        //Arrange
        TranslationLogic logicTrans = new TranslationLogic("");
        //Act
        logicTrans.putArraysToHashMap();
        String actual = logicTrans.getHMap("A");
        String expected = "*-";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    //Create elements and keys from arrays.
    public void getTextData() {
        //Arrange
        TranslationLogic logicTrans = new TranslationLogic("ABC");
        //Act
        String actual = logicTrans.getTextData();
        String expected = "ABC";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void setTextData() {
        //Arrange
        TranslationLogic logicTrans = new TranslationLogic("");
        //Act
        logicTrans.setTextData("Andreas");
        String actual = logicTrans.getTextData();
        String expected = "Andreas";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void splitLetters() {
        //Arrange
        TranslationLogic logicTrans = new TranslationLogic("A,B,C,D,E");
        //Act
        logicTrans.putArraysToHashMap();
        logicTrans.splitByCommaToArrayList();
        ArrayList<String> actual = logicTrans.getArrayList();
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void clearDataAL() {
        //Arrange
        TranslationLogic logicTrans = new TranslationLogic("A,B,C,D,E");
        //Act
        logicTrans.putArraysToHashMap();
        logicTrans.splitByCommaToArrayList();
        logicTrans.clearArrayList();
        ArrayList<String> actual = logicTrans.getArrayList();
        ArrayList<String> expected = new ArrayList<>();
        //Assert
        assertEquals(expected, actual);
    }
}
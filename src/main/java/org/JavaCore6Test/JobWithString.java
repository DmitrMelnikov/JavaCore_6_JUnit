package org.JavaCore6Test;

public class JobWithString {

    // метод позволяет узнать длину строки
    public  int lengthString( String str ){
        return str.length();
    }
    // проверка на NULL строки
    public boolean stringIsNull( String str ){
        return str.isEmpty();
    }
    // соединенение двух строк
    public  String  addTwoStrings( String strOne,String strTwo ){
        return   strOne + strTwo;
    }
    // Вхождение строки в другую строку
    public  boolean  occurrenceStrings( String strOne, String strTwo ){
        return strOne.contains(strTwo);
    }

}

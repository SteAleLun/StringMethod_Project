package stringmethod;

import java.util.Locale;

public class StringMethod {

    public static void stringMethod(String string){
        // распечатать последний символ строки
        System.out.println(string.charAt(string.length()-1));
        // проверка, заканчивается ли наша строка подстрокой "!!!"
        System.out.println(string.endsWith("!!!"));
        // проверка, начнается ли наша строка подстрокой "I like"
        System.out.println(string.startsWith("I like"));
        // проверка, содержит ли наша строка подстроку “Java”
        System.out.println(string.contains("Java"));
        // найти позицию подстроки “Java” в строке “I like Java!!!”
        System.out.println(string.lastIndexOf("Java"));
        // заменить все символы “а” на “о”
        System.out.println(string.replace('a', 'o'));
        // преобразовать строку к верхнему регистру
        System.out.println(string.toUpperCase());
        // преобразовать строку к нижнему регистру
        System.out.println(string.toLowerCase());
        // вывести последнее слово в строке
        System.out.println(string.substring(string.lastIndexOf(" ") + 1).split("\\W")[0]);
    }

}

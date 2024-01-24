package step.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new Basics().run();
        //System.out.println( "Hello World!" );
    }
}

/*
Java:
- JRE (JVM) -  середовище виконання
- JDK - засоби розробника (компілятор)
- IDE - Intellij Idea (Apache NetBeans, Eclipse, ...)

= мова траслюючого типу (видає проміжний код - файли .class)
= GL (покоління 4), парадигма - ООП, типізація статична,
= висока зворотня сумісність
= прив'язка до файлової системи:
    - файли классів повинні називатись так само, як і самі класи (+.java)
   -> один файл - один клас (public)
   - пакети (package) - вони привєязуються до папок, назяваються як папки, точка у назвах - підпаки
   - документуючий коментак, котрий використовуюється для підсказок
   - один клас не можно розбити на декілька файлів
   -
  = Casing
  - Types: CapitalCamelCase
  - methods, vars: lowerCamelCase
  - const: Pascal_
    (- класи
    - інтерфейс
    - єнум - перелів
    - нумерал -
    )

 */
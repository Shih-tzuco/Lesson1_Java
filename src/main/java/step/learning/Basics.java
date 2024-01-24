package step.learning;

import java.util.*;

public class Basics {
    public void run() {
        System.out.println("Java basics");
        // Змінні та типи данних
        // є прімітиви, які поводяться як значимі  типи
        // всі інші даних - reference
        // одразу виделяється память 10
        int x = 10;
        Integer xx = 10; // reference - аналог int
        // беззнаковые типы не предусмотрены
        // byte -128 -> 127 = 8 byt
        // short - -32,768 .. 32,767 = 16 byt
        // long 8	-9*1018 .. 9*1018
        // float -1038 .. 1038 = 32
        // double 64
        // char UTF-16
        //boolean = true / false
        byte b = 127;
        b = -128;
        short s = 16000;
        long  lng = 1000000000L;
        float f = 0.1f;
        double d = 1.23E-4;
        char c = 'A';
        Character chr = 'B';
        boolean bool = true;
        Boolean boolRef = false;


        System.out.println(x);
        System.out.printf("xx = %d, b = %d, s = %d, lng = %d, f = %e, d = %f %n", xx, b, s, lng, f, d);
        System.out.println(c + " " + chr);
        System.out.println(bool + " " + boolRef);
        control();
        strings();

    }
    private void control(){
        // инструкции управления (ветвление/розгалуження та цикл)
        int x = 10;
        if (x % 2 == 1){
            System.out.println("x id odd");
        }
        else {
            System.out.println("x is even");
        }
        System.out.println(x % 2 == 0 ? "even" : "odd");
        switch(x){
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("other");
        }
        // Array and Collections
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++)
        {
            arr2[i] = i;
        }
        for (int element : arr1 )
        { // foreach
            System.out.println(element);
        }
        int[][] arrs = new int[4][];
        for (int i = 0; i < 4; i++)
        {
            arrs[i] = new int[5];
            for(int j  = 0; j  <5; j++) {
                arrs[i][j] = i * 10 + j + 11;
            }
        }
        System.out.println(" --------") ;
        for (int[] subarr : arrs)
        {
            for (int element : subarr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // List<int> list1 = error - only reference in collections
        List<Integer> list1; // List is interface;
        list1 = new ArrayList<>(); // ArrayList - implementation
        list1 = new LinkedList<>(); // <> - 'diamond' operator
        for (int i = 0; i < 10; i++)
        {
            list1.add(i);
        }
        System.out.println("-------");
        Map<String, String> dict = new HashMap<>(); // без сохранения добавления порядка
        dict.put("dog", "big dog");
        dict.put("nice dog", "small dog");
        dict.put("beautiful dog", "funny dog");
        dict.put("amazing dog", "happy dog");
        for (String key : dict.keySet())
        {
            System.out.printf("%s -> %s \n", key, dict.get(key));
        }
    }

    // about string
    private void strings() {
        String str1 = "Hello"; // только ""
        String str2 = "Hello"; // pooling - обэдинение строк одинакового значения(не создаются копии)

        if (str1 == str2) // Equal - ссылки на один объект
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Egual");
        }

        String str3 = new String ("Hello");
        String str4 = new String ("Hello"); // pooling - обэдинение строк одинакового значения(не создаются копии)

        if (str3 == str4)
        { // not equal - сравления идет ссылки на объект, а не самого адреса
            System.out.println("Equal"); // равными могут быть только две ссылки на один и тот же объект
        }
        else
        {
            System.out.println("Not Egual");
        }

        if(str3.equals(str4))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        // перегрузка опиратов в джаве отсутствует
    }
}

/*
повністю встановити джава, засоби розробніка, IDE
Створити проєкт за Maven quickstart
Налаштувати Git, опуублікувати репозиторій
Прикласти посилання на репозіторий проєкту
 */
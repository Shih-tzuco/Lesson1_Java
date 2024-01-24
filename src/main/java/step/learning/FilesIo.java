package step.learning;

import java.io.File;

public class FilesIo {
    public void run()
    {
        // Work with files
        // tradition separate for two groups
        //  - create, search, copy
        fsDemo();
        listDemo();
        //  - save, renew datas
    }
    private void listDemo() {
        //получения перечня файлов в директориии
        String filename = "." + File.separator;
        File f = new File(filename);
        //   f.list() - перечень имен файлов в директории String[]
        String[] list = f.list();
        if (list == null) {
            System.out.println("Access denied");
        }
        else
        {
            for (String name : list) {
                System.out.println(name);
            }
        }
        // f.listFiles() - перечень файловых объектов (File[])
        File[] files  = f.listFiles();
        if (files == null)
        {
            System.err.println("Access denied");
        }
        else {
            for(File file : files)
            {
                System.out.println(file.getName());
            }
        }
    }

    private void fsDemo()
        {
            String filename = "." + File.separator;
            File f = new File(filename);
            // ! create Object its not create File (any action)
            // for action on this object have to use method this object
            if (f.exists()) {
                System.out.printf("Path  '%s' exists\n", filename);
            } else {
                System.out.printf("Path '%s' does not  exists\n", filename);
            }
            // !!! в файловой системе существует разные объекты, за которые отвечает File:
            //это директории, файлы, симлинки, (где они существуют) др
            // f.exists() - определяет существования независисо от вида объекта
            if (f.isDirectory()) {
                System.out.printf("Path  '%s' exists as Directory\n", filename);
            }
            if (f.isFile()) {
                System.out.printf("Path  '%s' exists as File\n", filename);
            }
            filename = "." + File.separator + "subdir";
            File subdir = new File(filename);
            if (subdir.exists()) {
                System.out.printf("Path '%s' exists \n", filename);
                if (subdir.delete()) {
                    System.out.printf("Path  '%s' delete\n", filename);
                } else {
                    System.out.printf("Path  '%s' coudn't delete. Was Error! \n", filename);
                }
            } else {
                if (subdir.mkdir()) // create directoty
                {
                    System.out.printf("Path  '%s' create as File\n", filename);
                } else {
                    System.out.printf("Path  '%s' create as File\n", filename);
                }
            }

    }
}

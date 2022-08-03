package com.company;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.io.FileWriter;
class createfile
{
    public static void newfile() throws IOException
    {
        Path path = Paths.get("Saibaba.txt");
        try
        {
            Files.createFile(path);
            System.out.println("File Created"+" "+path);
            FileWriter write = new FileWriter("Saibaba.txt");
            write.write("I am new to java file handling");
            write.close();
            System.out.println("Successfully Written");
        }
        catch(FileAlreadyExistsException e)
        {
            System.out.println("File Already Exists");
            System.out.println("An error Ocurred");
        }
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        createfile f = new createfile();
        f.newfile();
    }
}
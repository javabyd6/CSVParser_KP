package pl.sda.parser;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Parser parser = new Parser();
        parser.readFile();

        System.out.println("po");
    }
}

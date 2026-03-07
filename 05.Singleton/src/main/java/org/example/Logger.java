package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;
    private File file;
    private BufferedWriter bw;

    private Logger() {
        try {
            file = new File("log.txt");
            bw = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void write(String writeMessage) {
        try {
            bw.write(writeMessage);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();  // this is my robust logging
        }

    }

    public void close() {
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setFileName(String newFileName) {
        try {
            close();
            file = new File(newFileName);
            bw = new BufferedWriter(new FileWriter(newFileName, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        boolean renamed = file.renameTo(newFileName);
//        if (renamed) {
//            System.out.println("File renamed to " + newFileName);
//        } else {
//            System.out.println("File renamed failed");  // checking to see if it works
//        }
    }


    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getInstance();
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");

        logger.setFileName("newLog.txt");
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");
        logger.close();
    }
}
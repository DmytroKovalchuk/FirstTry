package FilesToTry;

import java.io.*;

/**
 * Created by Lenovo on 13.10.2016.
 */
public class ClassToCreate {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("D://ModernMyMiner/src/MyMiner.CLASS"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("D://WhatHappened@.src"));
    }
}

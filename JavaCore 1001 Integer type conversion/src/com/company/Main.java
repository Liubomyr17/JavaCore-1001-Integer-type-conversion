package com.company;

/*

1001 integer type conversion
Place the type conversion operators correctly to get the answer: d> 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a * b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);

Requirements:
1. The program should display the text on the screen.
2. You cannot change the display command.
3. The main () method must contain a variable of type int.
4. The main () method must contain a variable b of type int.
5. The main () method must contain a byte variable c.
6. The main () method must contain a variable f of type double.
7. The main () method must contain a d variable of type long.
8. The initial value of the variables during initialization cannot be changed. You can add only cast operators.
9. The program should output a number greater than 0.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
        public static void main(String[] args) {
            int a = 0;
            int b = (byte) a + 46;
            byte c = (byte) (a * b);
            double f = 1234.15;
            long d = (long) (a + f / c + b);
            System.out.println(d);
        }
    }













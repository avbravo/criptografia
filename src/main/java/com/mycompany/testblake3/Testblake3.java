/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.testblake3;

import io.github.rctcwyvrn.blake3.Blake3;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author avbravo
 */
public class Testblake3 {

    public static void main(String[] args) {
        String textoaEncriptar = "Panama$amX1234578966666666666666666666666999999999999999999999999999990000000000000066666666666666666666666666666666666666";
        String textoBaseDatos = "";
        System.out.println("Hello World!");
        System.out.println("_________________simple______________________");
        Blake3 hasher = Blake3.newInstance();
        hasher.update(textoaEncriptar.getBytes());
        String hexhash = hasher.hexdigest();
        System.out.println("encriptado simple = " );
        System.out.println( hexhash);
        
        
        System.out.println("+++++++++++++++++COMNPUYESTO+++++++++++++++++++++++++");
         Blake3 hasher128 = Blake3.newInstance();
         hasher128.update(textoaEncriptar.getBytes(StandardCharsets.UTF_8));
        String hexhash128 = hasher128.hexdigest(256);
        System.out.println("encriptadoCompuesto = " );
        System.out.println(hexhash128);
        System.out.println("size= "+hexhash128.length());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        
//        
//        Blake3 hasher2 = Blake3.newInstance();
//        hasher2.update("This is a string".getBytes());
//        String hexhashx == hasher2.hexdigest();
//        
//        System.out.println("_______________________________________");
//        if(hexhash)
        System.out.println("=====================================");
        System.out.println("Descomprimiendo");
        String x = hasher.hexdigest();
        System.out.println("x = " + x);
        System.out.println("toString");
        System.out.println(hasher.hexdigest().toString());

        System.out.println("*****************************");

        byte[] testBytes = textoaEncriptar.getBytes(StandardCharsets.UTF_8);
        Blake3 hasherx = Blake3.newInstance();
        hasherx.update(testBytes);
        if ("718b749f12a61257438b2ea6643555fd995001c9d9ff84764f93f82610a780f243a9903464658159cf8b216e79006e12ef3568851423fa7c97002cbb9ca4dc44b4185bb3c6d18cdd1a991c2416f5e929810290b24bf24ba6262012684b6a0c4e096f55e8b0b4353c7b04a1141d25afd71fffae1304a5abf0c44150df8b8d4017"
                .equals(hasherx.hexdigest(128))) {

        }
    }
}

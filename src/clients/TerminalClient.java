package src.clients;

import src.engine.*;
import src.objects.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminalClient {
    // private Monomial monomial;
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Java Bestir, an algebraic engine implemented in Java");

        System.out.println("Enter the coefficient of your monomial: ");
       
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        String coefficient = reader.readLine();



        Monomial monomial = new Monomial(Double.parseDouble(coefficient));
        
        System.out.println("zero value monomial is: " + monomial.evaluateMonomial());
    }
}
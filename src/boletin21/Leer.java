
package boletin21;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Leer {
    Scanner sc;
    File fichero;
    PrintWriter p = null;
    ArrayList<String> lista = new ArrayList<String>();
    
    public void añadir(String nombreFichero){
        fichero = new File (nombreFichero);
        try{
            p = new PrintWriter(new FileWriter(nombreFichero,true));
            
            for(int i=0; i<lista.size();i++){
                p.print(lista.get(i)+"");
            }
            p.println();
        }catch (IOException ex){
            System.out.println("Error"+ex);
            
        }
        finally{
            p.close();
        }
    }
    public void mostrarLista(String nomeFicheiro){
      sc = new Scanner(nomeFicheiro);
      fichero = new File(nomeFicheiro);
      String cadena = JOptionPane.showInputDialog("Introduce la cadena de caracteres");
       JOptionPane.showMessageDialog(null,cadena);
      cadena = sc.nextLine();
      String palabras[]= cadena.split(" ");
      for(int i=0;i<palabras.length;i++){
          lista.add(palabras[i]);
      }
      Collections.sort(lista);
      añadir(nomeFicheiro);
      
    }
   
}


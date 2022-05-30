/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author DETEC_IT
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class DH {

    public static void main(String[] args) {
        try {  
            while (true) {  
                Date d = new Date();  
                StringBuffer data = new StringBuffer();  

                    SimpleDateFormat sdfData = new SimpleDateFormat("dd.MM.yyyy");  
                    data.append(sdfData.format(d));  
                    data.append(" - ");  

                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");  
                System.out.println(""+data.toString() + sdf.format(d));

                Thread.sleep(1000);  
            }  
        } catch (InterruptedException ex) {  
            System.out.println("Problema na atualização da data/hora");  
            ex.printStackTrace();  
        }  
    }
}

package control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;
import javax.swing.JOptionPane;

public class Data_Hora {

    public static void main(String args[]) throws IOException {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(
          new Runnable() {
              public void run() {
                  System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                  JOptionPane.showMessageDialog(null, new SimpleDateFormat("HH:mm:ss").format(new Date()));
              }
        }, 1, 1, TimeUnit.SECONDS);
    }
}
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

public class DataHora {

    public String data() throws InterruptedException {
        Date d = new Date();
        StringBuilder data = new StringBuilder();

        SimpleDateFormat sdfData = new SimpleDateFormat("dd.MM.yyyy");
        data.append(sdfData.format(d));
        data.append("-");

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("" + data.toString() + sdf.format(d));
        String data1 = (data.toString() + sdf.format(d));

        return data1;
    }

    public Date dataS() throws InterruptedException {
        Date d = new Date();

        return d;

    }
}

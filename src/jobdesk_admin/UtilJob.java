/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jobdesk_admin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Userpc
 */
public class UtilJob {

    
    String namabulan[]={"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
    
    public String GetNamabulan(String bulan){
    
        return namabulan[Integer.parseInt(bulan)];
    
    }
    
    public String GetDate(String i) {
        
        DateFormat dateFormat = null;
        
        Date date = new Date();
        
        
        
        if (i.equals("full")) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        }
        else if (i.equals("bulan")) {
            dateFormat = new SimpleDateFormat("MM");

        }
        else if (i.equals("tahun")) {
            dateFormat = new SimpleDateFormat("yyyy");

        }
        
        return dateFormat.format(date);
    }
}

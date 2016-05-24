/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jobdesk_admin;

import java.util.prefs.Preferences;

/**
 *
 * @author Userpc
 */
public class StrPr {

    Preferences preferences =  Preferences.userNodeForPackage(StrPr.class);

    public void setCredentials(String nm, String pr) {
        preferences.put("nm", nm);
        preferences.put("pr", pr);
    }

    public String getUsername() {
        return preferences.get("nm", null);
    }

    public String getPassword() {
        return preferences.get("pr", null);
    }
    
    
}

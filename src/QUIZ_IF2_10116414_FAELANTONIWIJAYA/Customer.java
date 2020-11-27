/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ_IF2_10116414_FAELANTONIWIJAYA;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author sweenutt
 */
public class Customer extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isMember() {
        return member;
    }
    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        SimpleDateFormat date = new SimpleDateFormat("EEEEEE, d MMM yyyy HH:mm:ss");
        date.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta")));
        return date.format(System.currentTimeMillis());
    }
}

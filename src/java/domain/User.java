/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author jasper
 */
public class User {
    
    private boolean receiveNewsletter = true;
    private List<String> favFrameworks;

    public User() {
    }

    public boolean getReceiveNewsletter() {
        return receiveNewsletter;
    }

    public void setReceiveNewsletter(boolean receiveNewsletter) {
        this.receiveNewsletter = receiveNewsletter;
    }

    public List<String> getFavFrameworks() {
        return favFrameworks;
    }

    public void setFavFrameworks(List<String> favFrameworks) {
        this.favFrameworks = favFrameworks;
    }
    
    
}

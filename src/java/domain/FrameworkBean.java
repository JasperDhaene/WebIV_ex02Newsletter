/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jasper
 */
public class FrameworkBean {

    private final List<String> webFrameworkList;

    public FrameworkBean() {
        webFrameworkList = new ArrayList<>(
                Arrays.asList(new String[]{"Spring MVC", "Struts 2", "JSF"}));
    }

    public List<String> getWebFrameworkList() {
        return webFrameworkList;
    }
}

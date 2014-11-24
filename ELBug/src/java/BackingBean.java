
import java.util.Collection;
import java.util.Vector;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salih ERİKCİ <salih.erikci@live.com>
 */
@Named
@RequestScoped
public class BackingBean {
    
    private Collection<String> myStringList = new Vector<String>();
    
    public BackingBean(){
        myStringList.add("String 1");
        myStringList.add("String 2");
        myStringList.add("String 3");
    }


    public Collection<String> getMyStringList() {
        return myStringList;
    }

    
}

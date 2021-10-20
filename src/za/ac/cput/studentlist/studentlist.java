/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentlist;

/**
 *
 * @author Master Vee
 */
public class studentlist {
    
    /**
     * This is a name sending app
     */
  private String  name ;
//Constructor
    public studentlist(String name) {
        this.name = name;
    }
//getters and setters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "studentlist{" + "name=" + name + '}';
    }
  

}
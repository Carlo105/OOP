 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

import employee.version3.myDate;

/**
 *
 * @author User
 */
public class myName {
    private String firstName;
    private String middleName;
    private String lastName;
    private String article;
    private String title;

    public myName(){
    }

    public myName(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public myName(String article, String firstName, String middleName, String lastName){
        this.article = article;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public myName(String article, String firstName, String middleName, String lastName, String title){
        this.article = article;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.title = title;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getfirstName(){
        return firstName;
    }

    public void setmiddleName(String middleName){
        this.middleName = middleName;
    }

    public String getmiddleName(){
        return middleName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setarticle(String article){
        this.article = article;
    }

    public String getarticle(){
        return article;
    }

    public void settitle(String title){
        this.title = title;
    }

    public String gettitle(){
        return title;
    }
    
    public void displayName(){
            toString();
    }
    
    @Override
    public String toString(){
         return String.format(" %s %s %c. %s %s", article, firstName, middleName, lastName, title);
    }
}

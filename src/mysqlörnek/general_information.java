/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlörnek;

/**
 *
 * @author MFİ
 */
public class general_information {

    int ID;
    String Name;
    String Surname;
    int Age;
    String Gender;
    String Address;
    public general_information(int gID,String gName,String gSurname,int gAge,String gGender,String gAddress){
        this.ID=gID;
        this.Name=gName;
        this.Surname=gSurname;
        this.Age=gAge;
        this.Gender=gGender;
        this.Address=gAddress;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
    public String getSurname(){
        return Surname;
    }
    public int getAge(){
        return Age;
    }
    public String getGender(){
        return Gender;
    }
    public String getAddress(){
        return Address;
    }
    

}

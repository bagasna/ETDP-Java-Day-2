package org.example;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class Employee
{
    public String name = "Bagas";
    public Integer id = 1122;
    public String phone = "021021";

    public boolean updatePhone(String phone){
        boolean hasil = false;
        if (!Objects.equals(this.phone, phone)){
            this.phone = phone;
            hasil = true;
            return hasil;
        }else {
            return hasil;
        }
    }

    public void getById(int id){
        Designer des = new Designer();
            if (id == this.id){
                    System.out.println("Id = "+ this.id + "\nNama = "+this.name+ "\nPhone = "+ this.phone);
                }
            }
    }


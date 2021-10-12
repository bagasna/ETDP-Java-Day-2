package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Task 1");
        System.out.println("2. Task 2");
        System.out.println("3. Keluar");
        System.out.println("Silahkan pilih : ");
        String pilih = sc.next();

        if (pilih.equals("1")) {
            Developer dev = new Developer();
            Designer des = new Designer();
            Employee em = new Employee();


            System.out.println("==============");
            System.out.println("Data Awal");
            System.out.println("==============");
            em.getById(1122);

            System.out.println("");
            System.out.println("=====================");
            System.out.println("Sesudah Update");
            System.out.println("=====================");
            dev.updateGitLink();
            des.updateDribbleLink();

            boolean updatePhone = em.updatePhone("08980809890");

            if (updatePhone) {
                Result(dev, des, em);
            } else {
                Result(dev, des, em);
                System.out.println("No HP tidak berubah, Please Check inputan Phone ");
            }
        }
        else if (pilih.equals("2")){
            // ======= Document ========
            Document doc = new Document();
            doc.addAuthor("Author Fadhel");

            String authors = "";
            for (String x : doc.getAuthors()){
                authors += x + " ";
            }
            System.out.println("");
            System.out.println("======== Percobaan Document ========");
            System.out.println("Nama Authors = " + authors);
            System.out.println("Tanggal = " + String.valueOf(doc.getDate()));
            System.out.println("");

            // ======= BOOK ========
            Book book = new Book();
            authors = "";
            for (String x : book.getAuthors()) {
                authors += x + " ";
            }
            System.out.println("======== Percobaan Book ========");
            System.out.println("Nama Authors = " + authors);
            System.out.println("Tanggal = " + String.valueOf(book.getDate()));
            System.out.println("Title = " + book.getTitle());
            System.out.println("");

            // ======= Email ========
            Email email = new Email();
            authors = "";
            for (String x : email.getAuthors()) {
                authors += x +" ";
            }
            String to = "";
            for (String x : email.getTo()) {
                to += x + " ";
            }
            System.out.println("======== Percobaan Email ========");
            System.out.println("Nama Authors = " + authors);
            System.out.println("Tanggal = " + String.valueOf(email.getDate()));
            System.out.println("Subject = " + email.getSubject());
            System.out.println("To = " +to);
            System.out.println("");

        }
        else {
            System.out.println("Thank You !!!");
            System.exit(0);
        }
    }
    public static void Result(Employee em, Employee em2, Employee em3){
        System.out.println("name : "+ em.name+"\nphone : "+em3.phone+"\nid : "+em.id+"\ngithub : "+((Developer) em).gitHubLink+"\ndribble : "+((Designer) em2).dribbleLink);
    }


}

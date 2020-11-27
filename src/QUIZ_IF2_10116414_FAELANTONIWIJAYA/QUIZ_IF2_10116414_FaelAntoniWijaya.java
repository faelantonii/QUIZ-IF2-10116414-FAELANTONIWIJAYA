/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ_IF2_10116414_FAELANTONIWIJAYA;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program Quiz
 */
public class QUIZ_IF2_10116414_FaelAntoniWijaya {
    public static void main(String[] args) {
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Customer pelanggan = new Customer();
        
        System.out.print("Customer Name : ");
        pelanggan.setName(scan1.nextLine());
        
        System.out.print("Customer Email : ");
        pelanggan.setEmail(scan2.next());
        
        pelanggan.displayService();
        
        pelanggan.setPriceService(pelanggan.getPrice(scan4.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        pelanggan.setMember(pelanggan.checkMemberStatus(scan3.next()));
        
        System.out.println("\n#*******************************#");
        System.out.println("#********CUSTOMER INVOICE*******#");
        System.out.println("Date Transaction : "+pelanggan.currentTime());
        System.out.println("Service Price : Rp." + pelanggan.getPriceService());
        System.out.println("Discount : Rp." + pelanggan.getSale(pelanggan.isMember(), pelanggan.getPriceService()));
        System.out.println("Total Pay : Rp." + pelanggan.getTotalPay(pelanggan.getPriceService(),
                
        pelanggan.getSale(pelanggan.isMember(), pelanggan.getPriceService())));
    }
}

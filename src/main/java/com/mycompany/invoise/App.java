package com.mycompany.invoise;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceService;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Quel est le nom du client ?" );
        Scanner sc=new Scanner(System.in);
        String customerName=sc.nextLine();

        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerName);

        InvoiceService invoiceService=new InvoiceService();
        invoiceService.createInvoice(invoice);
    }
}

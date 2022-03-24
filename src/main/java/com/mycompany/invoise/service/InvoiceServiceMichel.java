package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepository;

public class InvoiceServiceMichel {

    private static long lastNumber=112L;

    private InvoiceRepository invoiceRepository=new InvoiceRepository();

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf("INV_3" + (++lastNumber)));
        invoiceRepository.create(invoice);
    }
}

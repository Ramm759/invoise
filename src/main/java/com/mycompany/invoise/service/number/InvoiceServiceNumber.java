package com.mycompany.invoise.service.number;

import com.mycompany.invoise.entity.Invoice;

import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;

//@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber=0L;

    private InvoiceRepositoryInterface invoiceRepository;

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}

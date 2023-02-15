package pl.javastart.task.app;

import pl.javastart.task.creditgrantservice.CustomerService;
import pl.javastart.task.creditgrantservice.Offer;
import pl.javastart.task.creditgrantservice.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 2000);

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}
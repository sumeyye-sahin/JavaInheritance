//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IndividualCustomer  sumeyye = new IndividualCustomer();
        sumeyye.customerNumber="143380";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber="999999";

        CustomerManager cm = new CustomerManager();
     //   cm.add(sumeyye);
    //    cm.add(hepsiBurada);
//
        SendikaCustomer sendikaCustomer = new SendikaCustomer();
        sendikaCustomer.customerNumber="1432250";
       // cm.add(sendikaCustomer);

        Customer[] customers = {sumeyye,hepsiBurada,sendikaCustomer};

        cm.addMultiple(customers);


    }
}
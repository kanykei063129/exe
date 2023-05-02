package org.example;

import org.example.config.Config;
import org.example.entity.Bank;
import org.example.entity.Client;
import org.example.entity.Passport;
import org.example.entity.Region;
import org.example.service.BankService;
import org.example.service.ClientService;
import org.example.service.PassportService;
import org.example.service.RegionService;
import org.example.service.serviceImpl.BankServiceImpl;
import org.example.service.serviceImpl.ClientServiceImpl;
import org.example.service.serviceImpl.PassportServiceImpl;
import org.example.service.serviceImpl.RegionServiceImpl;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Config.getEntityManager();
        BankService bankService = new BankServiceImpl();
        ClientService clientService = new ClientServiceImpl();
        PassportService passportService = new PassportServiceImpl();
        RegionService regionService = new RegionServiceImpl();

        System.out.println(bankService.save(new Bank()));
//        System.out.println(bankService.delete(1L));
//        System.out.println(bankService.getBanksByRegionName("Kanykei"));

        System.out.println(clientService.save(new Client()));
//        System.out.println(clientService.beleteById(2L));
//        System.out.println(clientService.findById(3L));

        System.out.println(passportService.save(new Passport()));
//        System.out.println(passportService.deleteAllPassport());
//        passportService.assignPassportToClient(3L,4L);

        System.out.println(regionService.save(new Region()));
//        System.out.println(regionService.getAll());
        regionService.update(5L,new Region());
    }
}
package com.dre.sfgstarter.model.bootstrap;

import com.dre.sfgstarter.model.Owner;
import com.dre.sfgstarter.model.Vet;

import com.dre.sfgstarter.services.OwnerService;
import com.dre.sfgstarter.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    //@Autowired //not required anymore
    public DataLoader( OwnerService ownerService1, VetService vetService1){
        this.ownerService = ownerService1;
        this.vetService = vetService1;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets.... ");

    }
}

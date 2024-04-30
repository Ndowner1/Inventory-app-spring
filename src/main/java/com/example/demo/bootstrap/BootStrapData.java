package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        long partCount = partRepository.count() + outsourcedPartRepository.count();
        long productCount = productRepository.count();
        if (partCount == 0) {


            OutsourcedPart wings = new OutsourcedPart();
            wings.setCompanyName("Western Governors University");
            wings.setName("Wings (Set)");
            wings.setInv(20);
            wings.setPrice(10000.0);
            wings.setId(100L);
            wings.setMinInv(0);
            wings.setMaxInv(40);
            outsourcedPartRepository.save(wings);
            OutsourcedPart thePart = null;
            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Wings Set")) thePart = part;
            }

            if (thePart != null) {
                System.out.println(thePart.getCompanyName());
            } else {
                System.out.println("Wings Set part not found.");
            }

            OutsourcedPart engine = new OutsourcedPart();
            engine.setCompanyName("Western Governors University");
            engine.setName("Engine");
            engine.setInv(20);
            engine.setPrice(10000.0);
            engine.setId(101L);
            engine.setMinInv(0);
            engine.setMaxInv(40);
            outsourcedPartRepository.save(engine);
            OutsourcedPart thePart1 = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Engine")) thePart1 = part;
            }
            if (thePart1 != null) {
                System.out.println(thePart1.getCompanyName());
            } else {
                System.out.println("Engine part not found.");
            }

            OutsourcedPart navigationSystem = new OutsourcedPart();
            navigationSystem.setCompanyName("Western Governors University");
            navigationSystem.setName("Navigation System");
            navigationSystem.setInv(20);
            navigationSystem.setPrice(10000.0);
            navigationSystem.setId(102L);
            navigationSystem.setMinInv(0);
            navigationSystem.setMaxInv(40);
            outsourcedPartRepository.save(navigationSystem);
            OutsourcedPart thePart2 = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Navigation System")) thePart2 = part;
            }

            if (thePart2 != null) {
                System.out.println(thePart2.getCompanyName());
            } else {
                System.out.println("Navigation System part not found.");
            }
            ;

            OutsourcedPart gasTank = new OutsourcedPart();
            gasTank.setCompanyName("Western Governors University");
            gasTank.setName("Gas Tank");
            gasTank.setInv(20);
            gasTank.setPrice(10000.0);
            gasTank.setId(103L);
            gasTank.setMinInv(0);
            gasTank.setMaxInv(40);
            outsourcedPartRepository.save(gasTank);
            OutsourcedPart thePart3 = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Gas Tank")) thePart3 = part;
            }

            if (thePart3 != null) {
                System.out.println(thePart3.getCompanyName());
            } else {
                System.out.println("Gas Tank part not found.");
            }

            OutsourcedPart tail = new OutsourcedPart();
            tail.setCompanyName("Western Governors University");
            tail.setName("Tail");
            tail.setInv(20);
            tail.setPrice(10000.0);
            tail.setId(104L);
            tail.setMinInv(0);
            tail.setMaxInv(40);
            outsourcedPartRepository.save(tail);
            OutsourcedPart thePart4 = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Tail")) thePart4 = part;
            }

            if (thePart4 != null) {
                System.out.println(thePart4.getCompanyName());
            } else {
                System.out.println("Tail part not found.");
            }

            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }
        }

        if (productCount == 0) {

            Product plane = new Product("plane", 100000.0, 30);
            Product jet = new Product("jet", 200000.0, 30);
            Product helicopter = new Product("helicopter", 50000.0, 30);
            Product spaceShuttle = new Product("space shuttle", 500000.0, 30);
            Product drone = new Product("drone", 10000.0, 30);

            productRepository.save(plane);
            productRepository.save(jet);
            productRepository.save(helicopter);
            productRepository.save(spaceShuttle);
            productRepository.save(drone);


            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());

        }
    }
}

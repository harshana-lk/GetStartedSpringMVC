package me.harshu.getstartedspringmvc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Customer {
    @PostMapping
    public String saveCustomer() {
        System.out.println("Customer Saved");
        return "Save Customer";
    }

    @GetMapping
    public String getCustomer(){
        System.out.println("Get Customer");
        return "Get Customer";
    }

    public String deleteCustomer(){
        System.out.println("Customer Deleted");
        return "";
    }
}

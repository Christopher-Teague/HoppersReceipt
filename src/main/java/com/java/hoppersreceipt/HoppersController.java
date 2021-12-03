package com.java.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HoppersController {

	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Keanu Reeves";
        String itemName = "Red Pill";
        double price = 331.99;
        String description = "Free your mind...";
        String vendor = "Morpheus' Goods and Services";
    
    	// Your code here! Add values to the view model to be rendered
        
        String value = Double.toString(price);
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", value);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        
        return "index.jsp";
    }
    //...    	
}
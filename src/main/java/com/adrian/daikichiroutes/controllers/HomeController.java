package com.adrian.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @RequestMapping("/lotto/{id}")
  public String test(@PathVariable("id")String id){
    if(Integer.parseInt(id) % 2 == 0) {
      return "You will take a grand journey in the near future, but be weary of tempting offers";
    } else {
    // return String.format("the answer is: %s", id);
    return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    }
  }

  @RequestMapping("/travel/{id}")
  public String travel(@PathVariable("id") String id){ //or we could set another param defaultValue = "human" and not use the if
    if(id == null) {
      return "Congratulations! you will soon travel";
    }else {
      return "Congratulations! you will soon travel to " + id;
    }
  
  }
}

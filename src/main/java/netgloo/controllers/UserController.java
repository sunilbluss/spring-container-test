package netgloo.controllers;

import java.util.*;

import netgloo.models.User;
import netgloo.models.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class UserController {

  @RequestMapping(value="/crash")
  @ResponseBody
  public String create() {
    try {

      List<int[]> rowList = new ArrayList<int[]>();
	      for (int i = 0; i < Integer.MAX_VALUE; i++){
	      	int[] p = new int[1000000];
	        rowList.add(p);
	        System.out.println("Array size = " + rowList.size());
	        Thread.sleep(100);
	      }

    }
    catch(Exception ex) {
      return ex.getMessage();
    }
    return "application exits success";
  }

} // class UserController

package com.code.springMvcHibernateXmlCrm.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.code.springMvcHibernateXmlCrm.Entity.Customer;
import com.code.springMvcHibernateXmlCrm.Service.CustomerService;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
}

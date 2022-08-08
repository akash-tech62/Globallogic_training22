package com.EMPL.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.EMPL.DAO.EmplDao;
import com.EMPL.Model.Employee;

@Controller
public class MController {

	@Autowired
	private EmplDao emplDao;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) {
		List<Employee> listContact = emplDao.list();
		model.addObject("listContact", listContact);
		model.setViewName("index");

		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee newContact = new Employee();
		model.addObject("contact", newContact);
		model.setViewName("Empl-form");
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Employee contact) {
		if (contact.getId() == 0) {
			emplDao.save(contact);
		} else {
			emplDao.update(contact);

		}

		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Employee contact = emplDao.get(id);
		ModelAndView model = new ModelAndView("contact_form");
		model.addObject("contact", contact);
		return model;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteContact(@RequestParam int id) {
		emplDao.delete(id);
		return new ModelAndView("redirect:/");
	}

}
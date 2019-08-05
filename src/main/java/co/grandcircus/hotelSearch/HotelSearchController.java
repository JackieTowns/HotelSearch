package co.grandcircus.hotelSearch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.hotelSearch.daos.HotelDao;
import co.grandcircus.hotelSearch.entities.Hotel;


@Controller
public class HotelSearchController {

	@Autowired
	private HotelDao dao;


	@RequestMapping("/")
	public ModelAndView index() {
		List<Hotel> theHotels = dao.findAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("hotel", theHotels);
		return mv;

	}

	@RequestMapping("/hotel-result")
	public ModelAndView showHotelResult(@RequestParam(value = "city", required = false) String city) {
		ModelAndView mv = new ModelAndView("hotel-result");
		mv.addObject("hotel", dao.findByCity(city));
		return mv;
	}


	/*
	 * @RequestMapping("/hotel-result") public ModelAndView
	 * showHotelResult(@RequestParam("city") String city) { List<Hotel> theHotels =
	 * dao.findAll(); ModelAndView mv = new ModelAndView("hotel-result");
	 * mv.addObject("hotel", theHotels); return mv; }
	 */



}

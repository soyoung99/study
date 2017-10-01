package cf.studycafe.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String center1(){
		return "/board/noticeListAll";
	}
	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public String center(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		/*Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );*/
		
		return "/board/noticeListAll";
	}
	
}

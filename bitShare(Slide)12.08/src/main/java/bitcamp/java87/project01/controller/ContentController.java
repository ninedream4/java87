package bitcamp.java87.project01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bitcamp.java87.project01.domain.Content;
import bitcamp.java87.project01.service.ContentService;

@Controller
@RequestMapping("/content/*")
public class ContentController {

	/// Field
	@Autowired
	@Qualifier("contentServiceImpl")
	private ContentService contentService;

	public ContentController() {
		System.out.println(this.getClass());
	}

	@Value("#{commonProperties['pageUnit']}")
	int pageUnit;

	@Value("#{commonProperties['pageSize']}")
	int pageSize;

	@RequestMapping(value = "addContent", method = RequestMethod.POST)
	public String addContent(@ModelAttribute("content") Content content) throws Exception {

		System.out.println("/content/addContent : POST");
		// Business Logic
		contentService.addContent(content);
		
		return "redirect:/index.jsp";
	}

	@RequestMapping(value = "getContent", method = RequestMethod.GET)
	public String getContent(@RequestParam("title") String title, Model model) throws Exception {

		System.out.println("/content/getContent : GET");
		// Business Logic
		Content content = contentService.getContent(title);
		model.addAttribute("content", content);

		return "redirect:/index.jsp";
	}

	@RequestMapping(value = "deleteContent", method = RequestMethod.GET)
	public String deleteContent(@RequestParam("contentId") int contentId, Model model) throws Exception {

		System.out.println("/content/deleteContent : GET");
		// Business Logic
		Content content = contentService.deleteContent(contentId);
		model.addAttribute("content", content);

		return "redirect:/index.jsp";
	}

	@RequestMapping(value = "updateContent", method = RequestMethod.POST)
	public String updateContent(@ModelAttribute() Content content, Model model) throws Exception {

		System.out.println("/content/updateContent : POST");
		System.out.println(content);
		System.out.println(model);

		contentService.updateContent(content);

		// Business Logic
		content = contentService.getContent(content.getTitle());
		model.addAttribute("content", content);

		return "forward:/index.jsp";
	}

}
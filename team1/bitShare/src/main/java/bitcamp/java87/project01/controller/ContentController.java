package bitcamp.java87.project01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bitcamp.java87.project01.domain.Content;
import bitcamp.java87.project01.service.ContentService;

@Controller
@RequestMapping("/content/*") //
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

//@RequestMapping("/addUser.do")
  @RequestMapping( value="addContent", method=RequestMethod.POST )
  public String addContent( @ModelAttribute("content") Content content ) throws Exception {

    System.out.println("/content/addContent : POST");
    //Business Logic
    contentService.addContent(content);
    
    return "redirect:/index.jsp";
  }

}
package it.begear.springTopBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.begear.springTopBoot.entities.Videogioco;
import it.begear.springTopBoot.service.VGService;

@Controller
public class VGController {
	
	@Autowired
    VGService vgService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Videogioco> listaVG = vgService.listAll();
	    model.addAttribute("listaVG", listaVG);
	    return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	    Videogioco vg = new Videogioco();
	    model.addAttribute("vg", vg);
	    return "add-vg";
	}
    
    @RequestMapping("/addVG")
    public String saveProduct(@ModelAttribute("vg") Videogioco vg) {
        vgService.save(vg);
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditVG(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit-vg");
        Videogioco vg = vgService.get(id);
        mav.addObject("vg", vg);
        return mav;
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        vgService.delete(id);
        return "redirect:/";       
    }
    
    @RequestMapping("/search")
    public String findByGenere(@RequestParam("genere") String genere, Model model) {
    	List<Videogioco> listaVG = vgService.findByGenere(genere);
        model.addAttribute("listaVG", listaVG);
        return "index";   
    }

}

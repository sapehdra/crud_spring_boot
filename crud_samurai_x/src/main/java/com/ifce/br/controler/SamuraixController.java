package com.ifce.br.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Samuraix;
import com.ifce.br.service.SamuraixService;

@Controller
public class SamuraixController {
	
	@Autowired
	private SamuraixService samuraixService;
	
	@GetMapping("/samuraix/formulario")
	public String formulario() {
		
		return "formulario";
	}
	
	@GetMapping("/samuraix/salvar")
	public String salvar(Samuraix samuraix) {
		samuraixService.cadastrarSamuraix(samuraix);
		
		return "sucesso";
	}
	
	@GetMapping("/samuraix/listar")
	public ModelAndView listarSamuraix() {
		
		List<Samuraix> samuraix = samuraixService.listarSamuraix();
		ModelAndView mv = new ModelAndView("listagem-samuraix");
		
		mv.addObject("listarSamuraix", samuraix);
		
		return mv;

	}
	
	@RequestMapping("/samuraix/excluir/{codigo}")
	public ModelAndView excluirSamuraix(@PathVariable Long codigo) {
		samuraixService.excluirSamuraix(codigo);
		 ModelAndView mv = new ModelAndView("redirect:/samuraix/listar");
		
		 return mv;
	}

}

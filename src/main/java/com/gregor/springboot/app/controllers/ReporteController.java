package com.gregor.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("reporte")
public class ReporteController {
    
        @GetMapping("ver")
	public String reporte() {
		return "reporte/lista";
	}
        
	@GetMapping("/reporteconcesionario")
	public String ver(Model model, RedirectAttributes flash) {
		return "reporteconcesionario";
	}
        
	@GetMapping("/reporteubicacion")
	public String verUbicacion(Model model, RedirectAttributes flash) {
		return "reporteubicacion";
	}
}

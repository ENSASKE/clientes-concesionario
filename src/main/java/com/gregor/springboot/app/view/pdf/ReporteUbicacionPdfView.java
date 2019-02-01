package com.gregor.springboot.app.view.pdf;

import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.gregor.springboot.app.models.entity.Cliente;
import com.gregor.springboot.app.models.service.IClienteService;
import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("reporteubicacion")
public class ReporteUbicacionPdfView extends AbstractPdfView {

	@Autowired
	private IClienteService clienteService;
        
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
                
		PdfPTable tabla = new PdfPTable(1);
		tabla.setSpacingAfter(20);
		
		PdfPCell cell = null;
		
		cell = new PdfPCell(new Phrase("Repore Clientes por Ubicación"));
		cell.setBackgroundColor(new Color(184, 218, 255));
		cell.setPadding(8f);
		tabla.addCell(cell);
		
		document.add(tabla);
		
		PdfPTable tabla2 = new PdfPTable(4);
		tabla2.setWidths(new float [] {1, 1, 2.5f, 1});
		tabla2.addCell("Nombre");
		tabla2.addCell("Apellido");
		tabla2.addCell("Correo");
		tabla2.addCell("Ubicación");
		
		for(Cliente item: clienteService.findAllUbicacion()) {
			tabla2.addCell(item.getNombre());
			tabla2.addCell(item.getApellido());
			tabla2.addCell(item.getEmail());
			
			cell = new PdfPCell(new Phrase(item.getUbicacion().getNombre()));
			cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			tabla2.addCell(cell);
		}
		
	    cell = new PdfPCell(new Phrase("Total Clientes: "));
	    cell.setColspan(3);
	    cell.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
	    tabla2.addCell(cell);
            int total = clienteService.findAllUbicacion().size();
	    tabla2.addCell(String.valueOf(total));
	    
	    document.add(tabla2);		
	}
}

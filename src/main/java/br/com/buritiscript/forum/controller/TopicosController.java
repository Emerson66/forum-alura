package br.com.buritiscript.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.buritiscript.forum.controller.dto.TopicoDTO;
import br.com.buritiscript.forum.model.Curso;
import br.com.buritiscript.forum.model.Topico;
import br.com.buritiscript.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> listar(){
		
		List<Topico> topicos = topicoRepository.findAll();
		
		return TopicoDTO.converter(topicos);
	}
}

package br.com.buritiscript.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.buritiscript.forum.controller.dto.TopicoDTO;
import br.com.buritiscript.forum.controller.form.TopicoForm;
import br.com.buritiscript.forum.model.Topico;
import br.com.buritiscript.forum.repository.CursoRepository;
import br.com.buritiscript.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<TopicoDTO> listar(String nomeCurso){
		
		List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
		
		return TopicoDTO.converter(topicos);
	}
	
	@PostMapping
	public void cadastrar(@RequestBody TopicoForm topicoForm) {
		
		Topico topico = topicoForm.converter(cursoRepository);
		topicoRepository.save(topico);
	}
}

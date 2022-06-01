package ar.com.unpaz.recurso.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.unpaz.recurso.model.Recurso;
import ar.com.unpaz.recurso.repository.RecursoRepository;
import ar.com.unpaz.recurso.service.RecursoService;

@Service
public class RecursoServiceImp implements RecursoService {
   
	@Autowired
	private RecursoRepository  recursoRepository;
	@Override
	public List<Recurso> getAll() {
		// TODO Auto-generated method stub
		return  (List<Recurso>) recursoRepository.findAll();
	}

	@Override
	public Recurso getById(Long id) {
		// TODO Auto-generated method stub
		return  recursoRepository.findById(id).get();
	}

	@Override
	public Recurso save(Recurso xModel) {
		// TODO Auto-generated method stub
		return recursoRepository.save(xModel);
	}

}

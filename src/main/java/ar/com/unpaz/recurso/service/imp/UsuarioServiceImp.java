package ar.com.unpaz.recurso.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.unpaz.recurso.model.Usuario;
import ar.com.unpaz.recurso.repository.UsuarioRepository;
import ar.com.unpaz.recurso.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return  (List<Usuario>) repository.findAll();
	}

	@Override
	public Usuario getById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public Usuario save(Usuario xModel) {
		// TODO Auto-generated method stub
		return repository.save(xModel);
	}

}

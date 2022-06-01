
package ar.com.unpaz.recurso.service.imp;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.unpaz.recurso.model.Agenda;
import ar.com.unpaz.recurso.model.DetalleAgenda;
import ar.com.unpaz.recurso.repository.AgendaRepository;
import ar.com.unpaz.recurso.service.AgendaService;

@Service
public class AgendaServiceImp implements AgendaService {

	@Autowired
	private AgendaRepository agendaRepository;
	@Override
	public List<Agenda> getAll() {
		
		return (List<Agenda>) agendaRepository.findAll();
	}

	@Override
	public Agenda getById(Long id) {
		return (Agenda) agendaRepository.findById(id).get();
	}

	@Override
	public Agenda save(Agenda xModel) {
	     for (DetalleAgenda item : xModel.getListDetalle()) {
			item.setAgenda(xModel);
		}
		return agendaRepository.save(xModel);
	}

}

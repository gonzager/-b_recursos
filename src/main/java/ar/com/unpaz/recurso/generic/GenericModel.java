package ar.com.unpaz.recurso.generic;

import java.util.List;

public interface GenericModel <T>{

	
	 List<T> getAll();
	 T getById(Long id);
	 T save(T xModel);
	 
	 
}

package br.com.educa.Educa.Service;

import br.com.educa.Educa.Repository.PessoaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.educa.Educa.Entity.Pessoa;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository repository;
	
	public List<Pessoa> findall(){
		return null;
	}
	
	public Pessoa findById(int id) {
		return null;
	}
	
	public boolean Save(Pessoa pessoa) {
		return false;
	}
	
	public boolean Delete(int id) {
		return false;
	}
	
}

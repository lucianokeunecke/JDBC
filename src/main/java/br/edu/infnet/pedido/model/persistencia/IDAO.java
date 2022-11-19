package br.edu.infnet.pedido.model.persistencia;

import java.util.List;

import br.edu.infnet.pedido.model.entidade.Cliente;

public interface IDAO<T> {

	Boolean incluir(T obj);

	Boolean alterar(T obj);

	Boolean excluir(Long id);

	T listarPeloId(Long id);

	List<T> listarTodos();

}
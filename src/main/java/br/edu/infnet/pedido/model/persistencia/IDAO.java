package br.edu.infnet.pedido.model.persistencia;

import java.util.List;

import br.edu.infnet.pedido.model.entidade.Cliente;

public interface IDAO<T> {

	Boolean incluir(T obj);

	Boolean alterar(T obj);

	Boolean excluir(T obj);

	Cliente listarPeloId(Long codigo);

	List<T> listarTodos();

}
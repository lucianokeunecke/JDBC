package br.edu.infnet.pedido.model.persistencia;

import java.util.List;

public interface IDAO<T> {

	Boolean incluir(T obj);

	Boolean alterar(T obj);

	Boolean excluir(Long id);

	T buscarPeloId(Long id);

	List<T> listarTodos();

}
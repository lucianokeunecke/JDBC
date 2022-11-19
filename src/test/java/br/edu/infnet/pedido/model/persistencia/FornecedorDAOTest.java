package br.edu.infnet.pedido.model.persistencia;

import br.edu.infnet.pedido.model.entidade.Cliente;
import br.edu.infnet.pedido.model.entidade.Fornecedor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FornecedorDAOTest {

	
	@Before
	public void inicializar() {
		IDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = new Fornecedor("Luciano Keunecke", 3189734992L, "Rua Max Weise", 290, "BL 28 AP 31", "Água Verde", 89032280, "Blumenau");
		fornecedorDAO.salvar(fornecedor);
	}
	
	
	@Test
	public void test() {
		IDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = new Fornecedor("Adriana Konell", 3189734992L, "Rua Max Weise", 290, "BL 28 AP 31", "Água Verde", 89032280, "Blumenau");
		boolean validacao = fornecedorDAO.salvar(fornecedor);
		Assert.assertTrue(validacao);
	}
	
	
	/*@Test
	public void testUpdate() {
		IDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.listarTodos();
		Cliente cliente = new Cliente("Maria das Couves", lista.get(0).getCodigo()); 
		boolean validacao = clienteDAO.atualizar(cliente);
		Assert.assertTrue(validacao);
	}
	
	@Test
	public void testDelete() {
		IDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.listarTodos();
		Cliente cliente = new Cliente("Maria das Couves", lista.get(lista.size()-1).getCodigo()); 
		boolean validacao = clienteDAO.deletar(cliente);
		Assert.assertTrue(validacao);
	}
	
	
	@Test
	public void testListaClientes() {
		IDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.listarTodos();
		Assert.assertTrue(lista.size() > 0);
	}
	

	@Test
	public void testObterCliente() {
		IDAO clienteDAO = new ClienteDAO();
		List<Cliente> lista = clienteDAO.listarTodos();
		Cliente cliente = clienteDAO.obter(lista.get(0).getCodigo());
		Assert.assertNotNull(cliente);;
	}*/
	

}

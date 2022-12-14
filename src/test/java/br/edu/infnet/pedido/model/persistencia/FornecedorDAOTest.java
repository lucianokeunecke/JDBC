package br.edu.infnet.pedido.model.persistencia;

import br.edu.infnet.pedido.model.entidade.Fornecedor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FornecedorDAOTest {
	
	@Before
	public void inicializar() {
		IDAO fornecedorDAO = new FornecedorDAO();

		List<Fornecedor> listaFornecedores = fornecedorDAO.listarTodos();

		if (listaFornecedores.size() == 0) {
			Fornecedor fornecedor = new Fornecedor("Luciano Keunecke", "031.897.349-92", "Rua Max Weise", 290, "BL 28 AP 31", "Água Verde", 89032280, "Blumenau");
			fornecedorDAO.incluir(fornecedor);

			fornecedor = new Fornecedor("Casa das Tintas", "05.698.650/0001-76", "Rua XV de Novembro", 746, "Sala 530", "Centro", 89035287, "Indaial");
			fornecedorDAO.incluir(fornecedor);

			fornecedor = new Fornecedor("Marcos da Silva", "075.976.954-97", "Rua das Palmeiras", 2465, "Apto 103", "Velha Central", 89074280, "Blumenau");
			fornecedorDAO.incluir(fornecedor);

			fornecedor = new Fornecedor("Serralheria do Zeca", "27.291.881/0001-01", "Rua Joinville", 475, "", "Passo Manso", 75965432, "Jaragua do Sul");
			fornecedorDAO.incluir(fornecedor);
		}
	}
	
	@Test
	public void incluir() {
		IDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = new Fornecedor("Maquinas Omil", "35.417.536/0001-91", "Rua Dr Getulio Vargas", 3563, "", "Bela Vista", 89140000, "Ibirama");
		boolean validacao = fornecedorDAO.incluir(fornecedor);
		Assert.assertTrue(validacao);
	}
	
	@Test
	public void alterar() {
		IDAO fornecedorDAO = new FornecedorDAO();
		List<Fornecedor> lista = fornecedorDAO.listarTodos();
		Fornecedor fornecedor = new Fornecedor( lista.get(0).getId(), "Teste Alteração do Fornecedor", "13.219.981/0001-04", "Teste Alteracao do Endereco", 1234, "Teste Alteracao Complemento", "Teste Alteracao Bairro", 12345678, "Teste Alteracao da Cidade");
		boolean validacao = fornecedorDAO.alterar(fornecedor);
		Assert.assertTrue(validacao);
	}
	
	@Test
	public void excluir() {
		IDAO fornecedorDAO = new FornecedorDAO();
		List<Fornecedor> lista = fornecedorDAO.listarTodos();
		boolean validacao = fornecedorDAO.excluir(lista.get(lista.size()-1).getId());
		Assert.assertTrue(validacao);
	}
	
	@Test
	public void listarTodosFornecedores() {
		IDAO fornecedorDAO = new FornecedorDAO();
		List<Fornecedor> lista = fornecedorDAO.listarTodos();

		System.out.println("Quantidade de fornecedores cadastrados: " + lista.size());

		Assert.assertTrue(lista.size() > 0);
	}

	@Test
	public void listarFornecedorPeloId() {
		IDAO fornecedorDAO = new FornecedorDAO();
		List<Fornecedor> lista = fornecedorDAO.listarTodos();
		Object fornecedor = fornecedorDAO.buscarPeloId(lista.get(0).getId());
		Assert.assertNotNull(fornecedor);
	}

}

package br.edu.infnet.pedido.model.persistencia;

import br.edu.infnet.pedido.model.entidade.Cliente;
import br.edu.infnet.pedido.model.entidade.Fornecedor;

import java.sql.SQLException;
import java.util.List;

public class FornecedorDAO extends JdbcDAO<Fornecedor> {


    @Override
    public Boolean incluir(Fornecedor fornecedor) {

        String sql = "insert into fornecedor(nome, cnpj_cpf, endereco, numero_endereco, complemento_endereco, bairro, numero_cep, nome_cidade, id) values (?, ?, ?, ?, ?, ?, ?, ?, null)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, fornecedor.getNome());
            pstm.setString(2, fornecedor.getCnpjCpf());
            pstm.setString(3, fornecedor.getEndereco());
            pstm.setLong(4, fornecedor.getNumeroEndereco());
            pstm.setString(5, fornecedor.getComplementoEndereco());
            pstm.setString(6, fornecedor.getBairro());
            pstm.setLong(7, fornecedor.getNumeroCep());
            pstm.setString(8, fornecedor.getNomeCidade());
            return pstm.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean alterar(Fornecedor obj) {
        return null;
    }

    @Override
    public Boolean excluir(Fornecedor obj) {
        return null;
    }

    @Override
    public Cliente listarPeloId(Long codigo) {
        return null;
    }

    @Override
    public List<Fornecedor> listarTodos() {
        return null;
    }
}

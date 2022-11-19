package br.edu.infnet.pedido.model.persistencia;

import br.edu.infnet.pedido.model.entidade.Cliente;
import br.edu.infnet.pedido.model.entidade.Fornecedor;

import java.sql.SQLException;
import java.util.List;

public class FornecedorDAO extends JdbcDAO<Fornecedor> {


    @Override
    public Boolean salvar(Fornecedor fornecedor) {

        String sql = "insert into fornecedor(nome, endereco, numero_endereco, complemento_endereco, bairro, numero_cep, nome_cidade, id) values (?, ?, ?, ?, ?, ?, ?, null)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, fornecedor.getNome());
            //pstm.setLong(2, fornecedor.getCnpjCpf());
            pstm.setString(2, fornecedor.getEndereco());
            pstm.setLong(3, fornecedor.getNumeroEndereco());
            pstm.setString(4, fornecedor.getComplementoEndereco());
            pstm.setString(5, fornecedor.getBairro());
            pstm.setLong(6, fornecedor.getNumeroCep());
            pstm.setString(7, fornecedor.getNomeCidade());
            return pstm.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean atualizar(Fornecedor obj) {
        return null;
    }

    @Override
    public Boolean deletar(Fornecedor obj) {
        return null;
    }

    @Override
    public Cliente obter(Long codigo) {
        return null;
    }

    @Override
    public List<Fornecedor> listarTodos() {
        return null;
    }
}

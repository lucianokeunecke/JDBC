package br.edu.infnet.pedido.model.persistencia;

import br.edu.infnet.pedido.model.entidade.Cliente;
import br.edu.infnet.pedido.model.entidade.Fornecedor;

import java.sql.SQLException;
import java.util.List;

public class FornecedorDAO extends JdbcDAO<Fornecedor> {


    @Override
    public Boolean salvar(Fornecedor fornecedor) {

        //String sql = "insert into fornecedor(id, nome, cnpj_cpf, endereco, numero_endereco, complemento_endereco, bairro, numero_cep, nome_cidade) values (null, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sql = "insert into fornecedor(nome, id) values (?, null)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, fornecedor.getNome());
            /*pstm.setLong(3, fornecedor.getCnpjCpf());
            pstm.setString(4, fornecedor.getEndereco());
            pstm.setLong(5, fornecedor.getNumeroEndereco());
            pstm.setString(6, fornecedor.getComplementoEndereco());
            pstm.setString(7, fornecedor.getBairro());
            pstm.setLong(8, fornecedor.getNumeroCep());
            pstm.setString(9, fornecedor.getNomeCidade());*/
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

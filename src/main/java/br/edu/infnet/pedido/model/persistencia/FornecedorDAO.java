package br.edu.infnet.pedido.model.persistencia;

import br.edu.infnet.pedido.model.entidade.Fornecedor;

import java.sql.SQLException;
import java.util.ArrayList;
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
    public Boolean alterar(Fornecedor fornecedor) {
        String sql = "update fornecedor set nome = ?, cnpj_cpf = ?, endereco = ?, numero_endereco = ?, complemento_endereco = ?, bairro = ?, numero_cep = ?, nome_cidade = ? where id = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, fornecedor.getNome());
            pstm.setString(2, fornecedor.getCnpjCpf());
            pstm.setString(3, fornecedor.getEndereco());
            pstm.setLong(4, fornecedor.getNumeroEndereco());
            pstm.setString(5, fornecedor.getComplementoEndereco());
            pstm.setString(6, fornecedor.getBairro());
            pstm.setLong(7, fornecedor.getNumeroEndereco());
            pstm.setString(8, fornecedor.getNomeCidade());
            pstm.setLong(9, fornecedor.getId());
            return pstm.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean excluir(Long id) {
        String sql = "delete from fornecedor where id = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setLong(1, id);
            return pstm.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Fornecedor listarPeloId(Long id) {
        String sql = "select * from fornecedor where id = ?";
        Fornecedor fornecedor = new Fornecedor();
        try {
            pstm = con.prepareStatement(sql);
            pstm.setLong(1, id);
            rs = pstm.executeQuery();
            if(rs.next()) {
                String nome = rs.getString("nome");
                Long codigoDB = rs.getLong("codigo");
                fornecedor = new Fornecedor(rs.getLong("id"),
                                            rs.getString("nome"),
                                            rs.getString("cnpj_cpf"),
                                            rs.getString("endereco"),
                                            rs.getLong("numero_endereco"),
                                            rs.getString("complemento_endereco"),
                                            rs.getString("bairro"),
                                            rs.getLong("numero_cep"),
                                            rs.getString("nome_cidade"));
            }
            return fornecedor;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Fornecedor> listarTodos() {
        String sql = "select * from fornecedor";
        List<Fornecedor> listaFornecedores = new ArrayList<>();
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()) {
                Fornecedor fornecedor = new Fornecedor(rs.getLong("id"),
                                                       rs.getString("nome"),
                                                       rs.getString("cnpj_cpf"),
                                                       rs.getString("endereco"),
                                                       rs.getLong("numero_endereco"),
                                                       rs.getString("complemento_endereco"),
                                                       rs.getString("bairro"),
                                                       rs.getLong("numero_cep"),
                                                       rs.getString("nome_cidade"));
                listaFornecedores.add(fornecedor);
            }
            return listaFornecedores;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

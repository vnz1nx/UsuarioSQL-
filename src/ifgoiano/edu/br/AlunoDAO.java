package ifgoiano.edu.br;

import java.sql.PreparedStatement;

public class AlunoDAO {

	public boolean insert(Aluno a) {
		try {
			String sql = "INSERT INTO aluno "+ 
		    "(nome, email, idade, observacao) " +
		    "VALUES (?, ?, ?, ?)";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setString(1, a.getNome());
			p.setString(2, a.getEmail());
			p.setInt(3, a.getIdade());
			p.setString(4, a.getObservacao());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public boolean remove(Aluno a) {
		try {
			String sql = "DELETE FROM aluno " + 
		    "WHERE id = ? ";
			PreparedStatement p = ConnectionFactory.getConnection().prepareStatement(sql);
			p.setInt(1, a.getId());
			p.execute();
			p.close();
			ConnectionFactory.close();
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	
	
}

package usp.mac321.ep2.ex2;

//para cada um dos tipos de escrita eu
//segreguei a interface em partes menores seguindo a ideia de Segregacao de Interfaces

public interface EscritaUsuariosDAO {
 void escreveUsuarios(String nomeArquivoUsuarios, List<Usuario> usuarios);
}

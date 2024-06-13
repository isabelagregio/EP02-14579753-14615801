package usp.mac321.ep2.ex2;

public interface EscritaLancamentosDAO {
    void escreveLancamentos(String nomeArquivoLancamentos, List<Lancamento> lancamentos);
}
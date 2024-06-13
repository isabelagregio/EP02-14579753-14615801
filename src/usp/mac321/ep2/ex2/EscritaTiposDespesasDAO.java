package usp.mac321.ep2.ex2;

import java.util.List;

public interface EscritaTiposDespesasDAO {
    void escreveTiposDespesas(String nomeArquivoTiposDespesas, List<TipoDespesa> tiposDespesas);
}
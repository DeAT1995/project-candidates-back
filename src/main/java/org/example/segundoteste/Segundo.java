package org.example.segundoteste;


//parte para armazenar dados de lista
import java.util.ArrayList;
import java.util.List;

//classe segundo
public class Segundo {

    //incrementar id
    private int incId = 1;

    //lista de candidatos
    private List<Candidato> candidatos = new ArrayList<>();

    //registrar candidato gerando um id e cadastrando o nome
    public int iniciarProcesso(String nome){
        if (nome.isEmpty() || nome == null){
            throw new IllegalStateException("Nome invalido!");
        }

        for (Candidato candidato : candidatos){
            if( candidato.getNome().equals(nome)){
                throw new IllegalArgumentException("Nome repetido!");
            }
        }
        Candidato candidato = new Candidato(incId, nome);
        candidatos.add(candidato);
        incId++;
        return candidato.getId();
    }

    //encontrar yn candidato
    private Candidato encontrarCandidato(int codCandidato){
        for (Candidato candidato :candidatos){
            if (candidato.getId() == codCandidato){
                return candidato;
            }
        }
        throw new IllegalArgumentException("Candidato nao encontrado!");
    }

    //marcar entrevista c candidato
    public void marcarEntrevista(int codCandidato){
        Candidato candidato = encontrarCandidato(codCandidato);
        candidato.marcarEntrevista();
    }

    public void desqualificarCandidato(int codCandidato){
        Candidato candidato = encontrarCandidato(codCandidato);
        candidatos.remove(candidato);
    }


    public String verificarStatusCandidato(int codCandidato) {
        Candidato candidato = encontrarCandidato(codCandidato);
        return candidato.getStatus();
    };

    public void aprovarCandidato(int codCandidato){
        Candidato candidato = encontrarCandidato(codCandidato);
        candidato.aprovarCandidato();
    }

    public List<String> buscarAprovados(){
        List<String> aprovados = new ArrayList<>();
        for (Candidato candidato : candidatos){
            if (candidato.candidatoAprovado()){
                aprovados.add(candidato.getNome());
            }
        }
        return aprovados;
    }
}

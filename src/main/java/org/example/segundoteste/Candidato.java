//pacote ao qual pertence
package org.example.segundoteste;

//classe do obj
public class Candidato {

    //declaração das variáveis
    private int id;
    private String nome;
    private String status;

    //construção dos dados do obj
    // começa com status recebido por isso nao recebe como parametro
    public Candidato(int id, String nome ){
        this.id = id;
        this.nome = nome;
        this.status = "recebido";
    };

    //metodos para manipular os dados
    //pegar o id
    public int getId() {
        return id;
    };

    //pegar o nome do obj
    public String getNome() {
        return nome;
    };

    //pegar o status do obj

    public String getStatus() {
        return status;
    };

    //marcar a entrevista caso nao encontrado retornar uma exception
    public void marcarEntrevista(){
        if (status.equals("recebido")){
            status = "qualificado";
        } else{
            throw new IllegalStateException("Candidato nao encontrado!");
        }
    }


    //aprovar candidato
    public void aprovarCandidato(){
        if(status.equals("qualificado")){
            status = "aprovado";
        } else{
            throw new IllegalStateException(("Candidato nao encontrado!"));
        }
    }

    //verificar se o candidato foi aprovado (true/false)
    public boolean candidatoAprovado(){
         return status.equals("aprovado");
        }
    }



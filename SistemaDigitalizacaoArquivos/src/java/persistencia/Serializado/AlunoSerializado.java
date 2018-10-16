/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.Serializado;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import modelo.Aluno;
import modelo.CPF;
import modelo.Curso;
import modelo.Documento;
import modelo.RG;
import modelo.TituloEleitor;

/**
 *
 * @author 20131bsi0173
 */
public class AlunoSerializado implements Serializable{
    persistencia.Serializado.PersistenciaSerializada persistencia = new PersistenciaSerializada();
    persistencia.Serializado.DocumentoSerializado docSerial = new DocumentoSerializado();
    persistencia.Serializado.RGSerializado rgSerial = new RGSerializado();
    persistencia.Serializado.CPFSerializado cpfSerial = new CPFSerializado();
    persistencia.Serializado.TituloEleitorSerializado tituloSerial = new TituloEleitorSerializado();
    Aluno aluno;
    
    public void salvarAlunoSerializado(Aluno aluno) throws IOException {
        this.persistencia.salvarObjeto(aluno);
    }
    
    public Aluno recuperarAlunoSerializado() throws IOException, ClassNotFoundException {
        Aluno alunoRecuperado = (Aluno) this.persistencia.recuperarObjeto(Aluno.class);
        return alunoRecuperado;
    }
    
    public void alterarAluno(String nome, String matricula, Curso curso, Documento documento) {
        this.aluno.setNome(nome);
        this.aluno.setMatricula(matricula);
        this.aluno.setCurso(curso);
        this.aluno.addDocumento(documento);
        
    }
    
    public void listarAluno() {
        System.out.println("Nome: " + this.aluno.getNome());
        System.out.println("Matrícula: " + this.aluno.getMatricula());
        System.out.println("Curso: " + this.aluno.getCurso());
        System.out.println("Documentos: ");
        for (Documento doc : this.aluno.getArrayDocumento()) {
            this.docSerial.listarDocumento(doc);
            if (doc instanceof RG) {
                this.rgSerial.listarRG((RG) doc);
            }else if (doc instanceof CPF) {
                this.cpfSerial.listarCPF((CPF) doc);
            }else{
               this.tituloSerial.listarTituloEleitor((TituloEleitor) doc);
            }
            
            
        }
        
    }
    
    public void excluirAluno() {
        
    }
}

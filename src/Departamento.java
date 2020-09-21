
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author SI04
 */
public class Departamento {
    
    private int codigo;
    private String nome;
    private List<Funcionario> listaFunc;

    public Departamento() {
        listaFunc = new ArrayList();
    }

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        listaFunc = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListaFunc() {
        return listaFunc;
    }

    public void setListaFunc(List<Funcionario> listaFunc) {
        this.listaFunc = listaFunc;
    }
    
    public void addFunc(Funcionario func){
        func.setDep(this);
        listaFunc.add(func);
    }
    
       
    
    
}

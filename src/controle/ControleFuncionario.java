package controle;

import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;

public class ControleFuncionario {
    List<Funcionario> funcionarios = new ArrayList<>();
    
    public void adicionar(Funcionario f){ //essencial!!!
        funcionarios.add(f);
    }
    
    public void remover(Funcionario f){ //essencial!!!
        funcionarios.remove(f);
    }
    
    public void exibir(){ //mostra no console
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
    
    public List<Funcionario> listar(){ //mostra na tabela
        return funcionarios;
    }
    
    public Funcionario pesquisar(int id){        
        Funcionario resultado = new Funcionario();
        int controle = 0;
        for (Funcionario f : funcionarios) {
            if(f.getId() == id){ //se ele achou o funcionário na lista
                resultado = f;
                controle = 1;
            }
        }
        if(controle == 0){ //se ele não achou o funcionário
            System.out.println("Funcionário não encontrado.");
        }
        return resultado;
    }
    
    public double calcularBrutoAnual(Funcionario f){ //calcular o salário bruto que o funcionário receberá em 12 meses
        double total;
        total = f.getSalario()*12;
        return total;
    }
}

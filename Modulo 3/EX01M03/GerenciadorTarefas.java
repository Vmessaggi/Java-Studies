package EX01M03;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<String> tarefas = new ArrayList<>();
    public void adicionarTarefa(String tarefa){
        tarefas.add(tarefa);
    }
    public void removerTarefa(String tarefa){
        tarefas.remove(tarefa);
    }
    public void listarTarefas(){
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }
    public int contarTarefas(){
        return tarefas.size();
    }
}
package EX01M03;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // adiciona tarefas
        gerenciador.adicionarTarefa("Comprar leite");
        gerenciador.adicionarTarefa("Estudar Java");
        gerenciador.adicionarTarefa("Fazer exercícios");

        // lista todas
        gerenciador.listarTarefas();

        // remove uma
        gerenciador.removerTarefa("Estudar Java");

        // lista de novo
        System.out.println("--- Após remoção ---");
        gerenciador.listarTarefas();

        // contagem final
        System.out.println("Total: " + gerenciador.contarTarefas());
    }
}
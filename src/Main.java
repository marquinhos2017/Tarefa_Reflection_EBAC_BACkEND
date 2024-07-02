public class Main {
    public static void main(String[] args) {
        try {
            // Obter a classe Cliente
            Class<?> clienteClass = Class.forName("Cliente");

            // Verificar se a anotação Tabela está presente na classe Cliente
            if (clienteClass.isAnnotationPresent(Tabela.class)) {
                // Obter a anotação
                Tabela tabela = clienteClass.getAnnotation(Tabela.class);
                // Imprimir o valor da anotação (nome da tabela)
                System.out.println("Nome da tabela: " + tabela.value());
            } else {
                System.out.println("A anotação Tabela não está presente na classe Cliente.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

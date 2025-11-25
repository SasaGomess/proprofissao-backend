package teste_aula_monitoria.principal;

import teste_aula_monitoria.entidades.Funcionario;

public class TesteModificadores {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Carlos");
        System.out.println(funcionario1.getNome());

        funcionario1.setCargo("Desenvolvedor");
        funcionario1.getCargo();
    }
}

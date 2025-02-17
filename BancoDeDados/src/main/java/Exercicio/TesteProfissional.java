package Exercicio;

import java.util.List;

public class TesteProfissional {

    public static void main(String[] args) {
        ProfissionalDAO profissionalDAO = new ProfissionalDAO();

        // 1. Inserção de um novo profissional
        Profissional profissional1 = new Profissional();
        profissional1.setNome("João Silva");
        profissional1.setCargo("Desenvolvedor");
        profissional1.setDepartamento("TI");

        profissionalDAO.save(profissional1);
        System.out.println("Profissional inserido: " + profissional1.getNome());

        // 2. Leitura (Listar todos os profissionais)
        List<Profissional> profissionais = profissionalDAO.listar();
        System.out.println("Profissionais cadastrados:");
        for (Profissional p : profissionais) {
            System.out.println(p.getNome());
        }

        // 3. Atualização de um profissional
        Profissional profissionalAtualizado = profissionalDAO.buscarPorId(profissional1.getId());
        profissionalAtualizado.setCargo("Gerente de TI");
        profissionalDAO.update(profissionalAtualizado);
        System.out.println("Profissional atualizado: " + profissionalAtualizado.getNome());

        // 4. Deleção de um profissional
        Profissional profissionalDeletado = profissionalDAO.buscarPorId(profissional1.getId());
        profissionalDAO.delete(profissionalDeletado);
        System.out.println("Profissional deletado: " + profissionalDeletado.getNome());
    }
}



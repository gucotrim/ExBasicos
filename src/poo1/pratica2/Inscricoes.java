package poo1.pratica2;

import java.util.*;

public class Inscricoes {
    private HashMap<Circuitos, List<Participante>> circuitos = new HashMap<>();

    public Inscricoes() {
        this.circuitos.put(Circuitos.PEQUENO, new ArrayList<>());
        this.circuitos.put(Circuitos.MÉDIO, new ArrayList<>());
        this.circuitos.put(Circuitos.AVANÇADO, new ArrayList<>());
    }

    public void inscreverParticipante(Scanner sc) {
        Participante participante = new Participante();

        System.out.println("Olá, para inserir um participante digite os dados pedidos!");

        System.out.print("rg (Somente números): ");
        participante.setRg(Integer.parseInt(sc.nextLine()));

        System.out.print("nome: ");
        participante.setNome(sc.nextLine());

        System.out.print("sobrenome: ");
        participante.setSobrenome(sc.nextLine());

        System.out.print("idade: ");
        participante.setIdade(Integer.parseInt(sc.nextLine()));

        System.out.print("número de celular '(99) 99999-9999': ");
        participante.setCelular(sc.nextLine());

        System.out.print("número de emergência '(99) 99999-9999': ");
        participante.setNumEmergencia(sc.nextLine());

        System.out.print("grupo sanguíneo: ");
        participante.setGrupoSanguineo(sc.nextLine());

        System.out.print("Escolha a categoria do circuito (PEQUENO, MÉDIO, AVANÇADO): ");
        Circuitos circuito = Circuitos.valueOf(sc.nextLine().toUpperCase(Locale.ROOT));

        while (participante.getIdade() < 18 && circuito.equals(Circuitos.AVANÇADO)) {
            System.out.println("Menores de 18 anos não podem se inscrever no circuito avançado.");
            System.out.print("Escolha outra categoria do circuito (PEQUENO, MÉDIO, AVANÇADO): ");
            circuito = Circuitos.valueOf(sc.nextLine().toUpperCase(Locale.ROOT));
        }

        participante.setNumInscricao(circuitos.get(circuito).size());

        this.calculaTotalAPagar(circuito, participante);

        circuitos.get(circuito).add(participante);
    }

    private void calculaTotalAPagar(Circuitos circuito, Participante participante) {
        switch (circuito) {
            case PEQUENO:
                if ((participante.getIdade() < 18)) {
                    participante.setTotalAPagar(1300);
                } else {
                    participante.setTotalAPagar(1500);
                }
                System.out.println("Total a pagar: R$ " + participante.getTotalAPagar());
                break;
            case MÉDIO:
                if ((participante.getIdade() < 18)) {
                    participante.setTotalAPagar(2000);
                } else {
                    participante.setTotalAPagar(2300);
                }
                System.out.println("Total a pagar: R$ " + participante.getTotalAPagar());
                break;
            case AVANÇADO:
                if ((participante.getIdade() >= 18)) {
                    participante.setTotalAPagar(2800);
                }
                System.out.println("Total a pagar: R$ " + participante.getTotalAPagar());
                break;
        }
    }

    public void cancelarInscricao(Circuitos circuito, Integer numInscricao) {
        circuitos.get(circuito).get(numInscricao).setStatusInscricao(StatusInscricao.CANCELADA);
    }

    public void listarCircuitosEParticipantes () {
        System.out.println("Circuito Pequeno:");
        circuitos.get(Circuitos.PEQUENO).forEach(System.out::println);

        System.out.println("Circuito Pequeno:");
        circuitos.get(Circuitos.MÉDIO).forEach(System.out::println);

        System.out.println("Circuito Pequeno:");
        circuitos.get(Circuitos.AVANÇADO).forEach(System.out::println);
    }
}

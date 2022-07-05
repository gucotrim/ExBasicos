package poo1.pratica2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inscricoes inscricoes = new Inscricoes();

        boolean sair = false;

        do {
            System.out.println("Olá, para inscrever um participante digite 1, " +
                    "para cancelar uma inscrição digite 2, " +
                    "para listar os circuitos e seus respectivos participantes digite 3, " +
                    "para sair, digite 4."
            );

            Integer opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    inscricoes.inscreverParticipante(sc);
                    break;
                case 2:
                    System.out.println("Digite o circuito do participante que deseja cancelar a inscrição (PEQUENO, MÉDIO, AVANÇADO):");
                    Circuitos circuito = Circuitos.valueOf(sc.nextLine().toUpperCase(Locale.ROOT));
                    System.out.println("Digite o número de inscrição que deseja cancelar: ");
                    Integer numInscricao = Integer.parseInt(sc.nextLine());
                    inscricoes.cancelarInscricao(circuito, numInscricao);
                    break;
                case 3:
                    inscricoes.listarCircuitosEParticipantes();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (!sair);





        sc.close();
    }
}

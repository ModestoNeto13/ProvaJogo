package src.jogo;

import java.util.ArrayList;

public class Viagem {

    //Mostrar os destinos possíveis
    public int mostrarDestinos(int peso) {
        int quantidade = 0;

        MapaGrafo.addCaminhos();
        MapaGrafo.addCidades();

        ArrayList<Integer> escolhas = new ArrayList<>();
        ArrayList<Vertice> destinos = MapaGrafo.grafo.imprimirDestinos(peso);
        
        for (int i = 0; i < destinos.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + destinos.get(i).getCidade().getNome());
            escolhas.add(i + 1);
            quantidade++;
        }

        return quantidade;
    }
    //Fazer Vaiagem
    public static void fazerViagem(Maxwell max, Vertice destino) {
        System.out.println("antes"+max.getcidadeAtual());
        max.setcidadeAtual(destino.getCidade().getId());
        max.setMoedas(max.getMoedas()-1);
        System.out.println("dps"+max.getcidadeAtual());
    }
}

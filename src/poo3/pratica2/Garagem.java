package poo3.pratica2;

import java.util.List;
import java.util.UUID;

public class Garagem {
    private UUID id;
    private List<Veiculo> veiculos;

    public Garagem(List<Veiculo> veiculos) {
        this.id = UUID.randomUUID();
        this.veiculos = veiculos;
    }

    public UUID getId() {
        return id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}

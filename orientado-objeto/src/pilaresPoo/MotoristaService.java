package pilaresPoo;

public class MotoristaService {
    Motorista motorista = new Motorista();
    public void setar(String nomeDeEntrada, int idadeDeEntrada) {


        motorista.setNome(nomeDeEntrada);
        motorista.setIdade(idadeDeEntrada);
    }

    public void mostrarIdadeENome() {
        System.out.println(motorista.getIdade());
        System.out.println(motorista.getNome());
    }
}

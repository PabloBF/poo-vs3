package arremesso;

public class Futebol extends Bola implements Arremessavel {

	public void arremessar() {
		System.out.println("Bola de futebol arremessada.");
	}

	@Override
	public void quicar() {
		System.out.println("Bola de futebol quicou.");
	}
}

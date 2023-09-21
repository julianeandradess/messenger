/*
 * Simulação do uso da classe MSNMessenger
 */

 public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
		msn.receberMensagem();

		FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
		facebook.receberMensagem();

		Telegram tel = new Telegram();
        tel.enviarMensagem();
		tel.receberMensagem();
	}
}
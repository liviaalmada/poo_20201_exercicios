import java.util.Scanner;

public class LapiseiraMain {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		String line;
		Lapiseira lapiseira;
		while(true) {
			System.out.print("$");
			line = scan.nextLine();
			String[] cmd = line.split(" ");
			if ("end".equals(cmd[0]))
				break;
			else if ("help".equals(cmd[0])) {
				System.out.println("\"init _calibre; inserir _calibre _dureza _tamanho; remover; write _pressao\"");
			}else if ("init".equals(cmd[0])) {
				float calibre;
				calibre = Float.parseFloat(cmd[1]);
				lapiseira = new Lapiseira(calibre);
			}else if ("inserir".equals(cmd[0])) {
				float calibre = Float.parseFloat(cmd[1]);;
				String dureza = cmd[2];
				int tamanho = Integer.valueOf(cmd[3]);
				Grafite g = new Grafite(calibre, dureza, tamanho);
				lapiseira.inserir(grafite);
			}else if("remover".equals(cmd[0])) {
				lapiseira.remover();
			}else if("show".equals(cmd[0])) {
				System.out.println(lapiseira.toString());
			}else if("escrever".equals(cmd[0])) {
				int pressao = Integer.valueOf(cmd[1]);
				lapiseira.escrever(pressao);
			}
		}
	}
}

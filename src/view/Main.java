package view;
import com.deniza.utils.fila.string.Fila;
import controller.EscalonadorController;

public class Main {
	
	public static void main(String[] args) {
		EscalonadorController escalonador = new EscalonadorController();
		Fila filaProcessos = new Fila();
		String processos[] = {"notepad.exe;14",  "write.exe;35",  "chrome.exe;27",  "acrobat.exe;52","firefox.exe;18","word.exe;25"};
		
		for (String processo : processos) {
			filaProcessos.insert(processo);
		}

		escalonador.escalonar(filaProcessos);
	}

}

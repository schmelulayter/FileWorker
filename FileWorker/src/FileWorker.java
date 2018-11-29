
public class FileWorker {

	public static void main(String[] args) {
		GUI gui = new GUI();
		DirectoryLister dl = new DirectoryLister(gui);
		gui.registerModel(dl);

	}

}

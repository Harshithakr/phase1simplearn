package phase1finalproject;
import phase1finalproject.FileOperations;
import phase1finalproject.HandleOptions;
import phase1finalproject.MenuOptions;
public class harshitha {
	public static void main(String[] args) {
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("harshitha", "Harshitha_KR");
		
		HandleOptions.handleWelcomeScreenInput();
	}	
}


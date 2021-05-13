public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.firstName = "Rana ";

		Instractor instractor = new Instractor();
		instractor.firstName = "Engin ";

		UserManager userManager = new UserManager();

		User[] users = {student , instractor};
		userManager.addMultiple(users);


	}
}
























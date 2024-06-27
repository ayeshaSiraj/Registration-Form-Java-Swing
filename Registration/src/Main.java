
public class Main {
    public static void main(String[] args) {
        Registration model = new Registration();
        RegistrationView view = new RegistrationView(model);
        Registration_Controller controller = new Registration_Controller(model,view);
        controller.updateview();
        controller.setRname("John");
        controller.updateview();
    }
}
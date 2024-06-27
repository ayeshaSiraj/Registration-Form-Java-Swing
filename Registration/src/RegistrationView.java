import javax.swing.*;

public class RegistrationView {

    public RegistrationView(Registration r) {
        //Print(r.gContent(),r.gtxtname(),r.gtxtroll(),r.gtxtfname(),r.gtextadd(),r.gtxtemail(),r.gtxtcontact(),r.Ggender());
        PrintRegistrationDetails(r.gContent(),r.getNaam(),r.getTxtRollNo(),r.getFname(),r.getTxtAddress(), r.getTxtContact(),r.getTxtEmail(),r.getgender());
    }


    /*public void Print(JPanel contentPane,JTextField name,JTextField ROLL,JTextField fName,JTextArea Add,JTextField Con,JTextField mail,JComboBox gen)
    {
        String naam = name.getText();
        String father = fName.getText();
        String gender = gen.getSelectedItem().toString();
        String contact = Con.getText();
        String rollno = ROLL.getText();
        String email = mail.getText();
        String address = Add.getText();
    }*/
    public void PrintRegistrationDetails(JPanel contentPane,String naam,String rollno,String fName,String Add,String Con,String mail,String gen)
    {


        JOptionPane.showMessageDialog(contentPane,"Student Name : "+naam+"\nFather Name : "+fName+"\nGender : "+gen+"\nContact : "+Con+"\nRoll_no : "+rollno+"\nEmail : "+mail+"\nAddress : "+Add);
    }
}

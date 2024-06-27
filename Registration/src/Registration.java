import javax.lang.model.element.Name;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Registration extends JFrame{
    private JPanel contentPane;
    private JTextField txtName;
    private JTextField txtFather;
    private JComboBox cbGender;
    private JTextField txtContact;
    private JTextField txtRollNo;
    private JTextField txtEmail;
    private JTextArea txtAddress;
    private JButton btSubmit;
    private String name,father,gender,contact,rollno,email,address;
    public Registration(){
        setContentPane(contentPane);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setTitle("Student's Registration");
        setLocationRelativeTo(null);
        setVisible(true);
        txtRollNo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if(txtRollNo.getText().isEmpty())
                    txtEmail.setText("");
                else{
                    String rollno = txtRollNo.getText();
                    String []r = rollno.toUpperCase().split("P-");
                    String email = "p"+r[0]+r[1]+"@pwr.nu.edu.pk";
                    txtEmail.setText(email);
                }
            }
        });
        btSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectInfo();
            }
        });
    }

    public String getNaam()
    {
        return name;
    }
    public String getFname()
    {
        return father;
    }
    public String getgender()
    {
        return gender;
    }
    public  String getTxtContact()
    {
        return  contact;
    }
    public  String getTxtRollNo()
    {
        return  rollno;
    }
    public  String getTxtEmail()
    {
        return email;
    }

    public String getTxtAddress()
    {
        return address;
    }
    public void setNaam(String name)
    {

        this.name=name;
    }
    public void setFname(String father)
    {
        this.father=father;
    }
    public void setTxtRollNo(String rollno)
    {
        this.rollno=rollno;
    }
    public void  setCbGender(String gender)
    {
        this.gender=gender;
    }
    public void setTxtContact(String contact)
    {
        this.contact=contact;
    }
    public void setTxtEmail(String email)
    {
        this.email=email;
    }
    public void  setTxtAddress(String address)
    {
        this.address=address;
    }
    public void setBtSubmit()
    {
        this.btSubmit=btSubmit;
    }
    void collectInfo(){
        String name = txtName.getText();
        String father = txtFather.getText();
        String gender = cbGender.getSelectedItem().toString();
        String contact = txtContact.getText();
        String rollno = txtRollNo.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();

        //JOptionPane.showMessageDialog(contentPane, "Name: "+name+"\nFather's Name: "+father+"\nGender: "+gender);
        //System.out.println("Name: "+name+"\nFather's Name: "+father+"\nGender: "+gender);
    }
    public JPanel gContent()
    {
        return contentPane;
    }
    public  JTextField gtxtname()
    {
        return txtName;
    }
    public  JTextField gtxtfname()
    {
        return txtFather;
    }
    public  JTextField gtxtroll()
    {
        return txtRollNo;
    }
    public  JTextField gtxtemail()
    {
        return txtEmail;
    }
    public  JTextArea gtextadd()
    {
        return txtAddress;
    }
    public JTextField gtxtcontact()
    {
        return  txtContact;
    }
    public JComboBox Ggender()
    {
        return cbGender;
    }


    public static void main(String[] args){
        Registration m;
        m = new Registration();
        RegistrationView view = new RegistrationView(m);
        Registration_Controller controller = new Registration_Controller(m,view);
        controller.updateview();
        controller.setRname("John");
        controller.updateview();
    }
}

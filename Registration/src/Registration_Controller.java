public class Registration_Controller {

    private Registration model;
    private RegistrationView view;

    public Registration_Controller(Registration model,RegistrationView view)
    {
        this.model=model;
        this.view=view;
    }
    public void setRname(String name){
        model.setNaam(name);
    }
    public void setRfather(String father){
        model.setFname(father);
    }
    public  void setRroll(String roll)
    {
        model.setTxtRollNo(roll);
    }
    public void setRgender(String gender)
    {
        model.setCbGender(gender);
    }
    public void setRcontact(String contact){
        model.setTxtContact(contact);
    }
    public void setRemail(String email){
        model.setTxtEmail(email);
    }
    public void setRaddress(String address){
        model.setTxtAddress(address);
    }
   public String getRname()
   {
       return model.getNaam();
   }
   public String getRfather(){
        return model.getFname();
   }
   public String getRroll(){
        return model.getTxtRollNo();
   }
   public String getRgender(){
        return model.getgender();
   }
   public String getRcontact(){
        return model.getTxtContact();
   }
   public String getRemail(){
        return  model.getTxtEmail();
   }
   public String getRaddress(){
        return model.getTxtAddress();
   }
   public void updateview(){
        view.PrintRegistrationDetails(model.gContent(),model.getNaam(),model.getTxtRollNo(),model.getFname(),model.getTxtAddress(),model.getTxtContact(),model.getTxtEmail(),model.getgender());
   }

}

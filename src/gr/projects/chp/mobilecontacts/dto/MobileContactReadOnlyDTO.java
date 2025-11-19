package gr.projects.chp.mobilecontacts.dto;

public class MobileContactReadOnlyDTO extends BaseDto{
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContactReadOnlyDTO(){

    }

    public MobileContactReadOnlyDTO(long id ,String firstname, String lastname, String phoneNumber) {
        setId(id);
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

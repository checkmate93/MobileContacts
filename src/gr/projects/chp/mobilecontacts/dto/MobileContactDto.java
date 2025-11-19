package gr.projects.chp.mobilecontacts.dto;

public class MobileContactDto {
    private String firstname;
    private String lasstname;
    private String phoneNumber;

    public MobileContactDto(){

    }

    public MobileContactDto(String firstname, String lasstname, String phoneNumber) {
        this.firstname = firstname;
        this.lasstname = lasstname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasstname() {
        return lasstname;
    }

    public void setLasstname(String lasstname) {
        this.lasstname = lasstname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

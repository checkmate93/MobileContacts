package gr.projects.chp.mobilecontacts.dao;



import gr.projects.chp.mobilecontacts.model.MobileContact;

import java.util.List;

public interface IMobileContactDao {
    MobileContact insert (MobileContact mobileContact);
    MobileContact update (Long id , MobileContact mobileContact);
    void deleteById(Long id);
    void deleteByPhoneNumber(String phoneNumber);
    MobileContact getById(Long id);
    List<MobileContact> getAll();
    MobileContact getByPhoneNumber(String phoneNumber);
    boolean phoneNumberExist(String phoneNumber);

}

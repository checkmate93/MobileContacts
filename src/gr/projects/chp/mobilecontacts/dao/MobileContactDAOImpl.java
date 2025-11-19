package gr.projects.chp.mobilecontacts.dao;



import gr.projects.chp.mobilecontacts.model.MobileContact;

import java.util.ArrayList;
import java.util.List;

public class MobileContactDAOImpl implements  IMobileContactDao {
    private static final List<MobileContact> contacts = new ArrayList<>();

    @Override
    public MobileContact insert(MobileContact mobileContact) {
        contacts.add(mobileContact);
        return mobileContact;
    }

    @Override
    public MobileContact update(Long id, MobileContact mobileContact) {
        contacts.set(getIndexById(id), mobileContact);
        return mobileContact;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByPhoneNumber(String phoneNumber) {

    }

    @Override
    public MobileContact getById(Long id) {
        return null;
    }

    @Override
    public List<MobileContact> getAll() {
        return List.of();
    }

    @Override
    public MobileContact getByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public boolean phoneNumberExist(String phoneNumber) {
        return false;
    }

    private int getIndexById(Long id) {
        int potitionToReturn = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId().equals(id)) {
                potitionToReturn = i;
                break;
            }


        }
        return potitionToReturn;
    }

}



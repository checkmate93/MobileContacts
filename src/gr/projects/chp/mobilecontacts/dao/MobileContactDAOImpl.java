package gr.projects.chp.mobilecontacts.dao;



import gr.projects.chp.mobilecontacts.model.MobileContact;

import java.util.ArrayList;
import java.util.List;

public class MobileContactDAOImpl implements  IMobileContactDao {
    private static final List<MobileContact> contacts = new ArrayList<>();
    private  static long id = 1l;

    @Override
    public MobileContact insert(MobileContact mobileContact) {
        mobileContact.setId(id++);
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

        //contacts.remove(getIndexById(id));
        contacts.removeIf(contact -> contact.getId().equals(id));
    }

    @Override
    public void deleteByPhoneNumber(String phoneNumber) {
        contacts.removeIf(contact -> contact.getPhoneNumber().equals(id));

    }

    @Override
    public MobileContact getById(Long id) {
        int positionToReturn= getIndexById(id);
        return (positionToReturn != -1 ) ? contacts.get(positionToReturn) : null;
    }

    @Override
    public List<MobileContact> getAll() {

        return new ArrayList<>(contacts);
    }

    @Override
    public MobileContact getByPhoneNumber(String phoneNumber) {
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);
        return  (positionToReturn != -1) ? contacts.get(positionToReturn) : null;


    }

    @Override
    public boolean phoneNumberExist(String phoneNumber) {
        int position = getIndexByPhoneNumber(phoneNumber);
        return  position != -1 ;



    }

    @Override
    public boolean userIdExists(Long id) {
        int position = getIndexById(id);
        return  position != -1 ;

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

    private int getIndexByPhoneNumber(String phoneNumber) {
        int potitionToReturn = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                potitionToReturn = i;
                break;
            }


        }
        return potitionToReturn;
    }




}



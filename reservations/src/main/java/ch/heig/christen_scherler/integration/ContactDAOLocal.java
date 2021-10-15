package ch.heig.christen_scherler.integration;

import ch.heig.christen_scherler.model.Contact;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ContactDAOLocal {
    List<Contact> getContacts();
    void add(Contact contact);
    Contact getContact(String nom);
    void updateConjoint(Contact contact);
}

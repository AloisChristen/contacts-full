package ch.heig.christen_scherler.integration;

import ch.heig.christen_scherler.model.Contact;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ContactDAORemote {
    List<Contact> getContacts();
    void add(Contact contact);
    void create();
}

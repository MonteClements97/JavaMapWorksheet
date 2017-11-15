import java.util.Map;
import java.util.HashMap;

/**
 * Created by Montell on 2017-11-15.
 */
public class HashPhoneBook implements PhoneBook {

    private Map<Integer, String> phoneBook;

    public HashPhoneBook(){
        phoneBook = new HashMap<Integer, String>();
    }

    public String search(int phoneNumber){
        return phoneBook.get(phoneNumber);
    }

    public boolean add(int phoneNumber, String name){
        if (!(phoneBook.get(phoneNumber) == null)){
            return false;
        }
        return (phoneBook.put(phoneNumber, name) == null);
    }

    public String update(int phoneNumber, String name){
        String oldName = phoneBook.get(phoneNumber);
        if((oldName) == null){
            return null;
        }
        phoneBook.remove(phoneNumber);
        phoneBook.put(phoneNumber, name);

        return oldName;
    }

    public String remove(int phoneNumber){
        return phoneBook.remove(phoneNumber);
    }
}

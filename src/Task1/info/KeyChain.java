package Task1.info;

import Task1.Connectable;
import Task1.util.FIleService;

import java.io.File;
import java.util.Objects;

public class KeyChain implements Connectable {
    private String key;
    private String value;
    KeyChain [] keysArray = FIleService.readFile();

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public String toString(){
        return "info.Key{" +
                "key = " + key +
                ", value = '" + value + '\'' +
                '}';
    }

    @Override
    public boolean openConnection() {
        return true;
    }

    @Override
    public boolean closeConnection() {
        return false;
    }

    @Override
    public boolean checkConnection() {
        if (openConnection()){
            System.out.println("Connection is open");
        } else {
            System.out.println("Connection is closed");
        } return true;
    }

    @Override
    public void readAString(int index) {
        try {
            if (openConnection()){
                System.out.println(keysArray[index]);
            }
        } catch (Exception e){
            System.out.println("No connection");
        }
    }

    @Override
    public void checkARecord(String key) {
    int index = 0;
    for (int i=0; i<keysArray.length; i++){
        if (getKey().equals(key)){
            System.out.println("There is a record with this key");
        } else {
            System.out.println("There is no record with this key");
        }
    }
    }

    public void readAString(String key) {
        int index = 0;
        for (KeyChain item : keysArray) {
            if (Objects.equals(getKey(), key)) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void readASet(int initialIndex, int finalIndex) {

    }

    @Override
    public void calculateRecords() {
        int number = keysArray.length;
        System.out.println("Number of records " + number);
    }

    @Override
    public void addARecord() {
        keysArray[5].setKey("K5");
        keysArray[5].setValue("HHH");
        FIleService.writeFile(keysArray);
    }

    @Override
    public void updateRecordValue(int index) {
        keysArray[index].setKey("H1");
        keysArray[index].setValue("LLL");
        FIleService.writeFile(keysArray);

    }

    @Override
    public void updateRecordContents(String key) {
    }
}

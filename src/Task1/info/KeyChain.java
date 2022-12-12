package Task1.info;

import Task1.Connectable;
import java.security.Key;
import java.util.Objects;

public class KeyChain implements Connectable {
    private String key;
    private String value;
    Key[] keysArray;

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
        System.out.println("Connection is open now");
        return true;
    }

    @Override
    public boolean closeConnection() {
        System.out.println("Connection is closed now");
        return false;
    }

    @Override
    public void checkConnection() {
        if (openConnection()){
            System.out.println("Connection is open");
        } else {
            System.out.println("Connection is closed");
        }
    }

    @Override
    public void readAString(int index) {
        int i = 0;
        if (keysArray[i] == keysArray[index]){
            System.out.println(keysArray[index]);
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
        for (Key item : keysArray) {
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

    }

    @Override
    public void addARecord() {

    }

    @Override
    public void updateRecordValue(int index) {

    }

    @Override
    public void updateRecordContents(String key) {

    }
}

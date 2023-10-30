package Backend.DesignPattern.Singleton.DoubleCheckingLocks;

public class DBConnection {

    private static DBConnection instance;

    private DBConnection(){

    }
    private static DBConnection getInstance(){
        if(instance == null){
            synchronized (DBConnection.class){
                if(instance == null){
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}

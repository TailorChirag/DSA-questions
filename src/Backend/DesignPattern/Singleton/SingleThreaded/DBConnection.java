package Backend.DesignPattern.Singleton.SingleThreaded;

public class DBConnection {

    private static DBConnection instance;

    private DBConnection(){

    }
    private static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }
}

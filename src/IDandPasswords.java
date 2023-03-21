import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPasswords(){

        loginInfo.put("Acapella","Burgers");
        loginInfo.put("Miami","Bromania");
        loginInfo.put("Silviu123","Silviu321");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}

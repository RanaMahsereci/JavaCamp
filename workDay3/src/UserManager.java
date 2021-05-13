public class UserManager {
    public void add(User user){
        System.out.println(user.firstName + "eklendi");

    }
    //bulk insert
    public void addMultiple(User[] users){
        for(User user : users){
            add(user);
        }

    }




}

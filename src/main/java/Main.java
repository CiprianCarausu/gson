import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
       // serializeUserSimple();
        deserializationUserSimple();
    }

    public static void serializeUserSimple() {
        UserSimple user = new UserSimple(
                "Ciprian Carausu",
                "carausuciprian@gmail.com",
                23,
                true
        );

        Gson gson = new Gson();
        String json = gson.toJson(user);
        //System.out.println(json);
    }

    public static void deserializationUserSimple(){
        String userJson = "{'age':24,'email':'carausuciprian@gmail.com','isDeveloper':true,'name':'Ciprian Carausu'}";
        Gson gson = new Gson();
        UserSimple userSimple = gson.fromJson(userJson, UserSimple.class);
    }
}

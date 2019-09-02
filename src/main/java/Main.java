import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        serializeUserSimple();
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
}

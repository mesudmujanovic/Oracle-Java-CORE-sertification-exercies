package org.example.ArraysMaps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class UserMap {
    public static void main(String[] args) {

        User user = new User(10, "mesko", "@gmail");

        Map<String, Function<User, Object>> businessKeys = new LinkedHashMap<>();
            businessKeys.put("userId", u -> u.getId());
            businessKeys.put("name", name -> name.getName());
        Object userId = businessKeys.get("userId").apply(user);
        Object userName = businessKeys.get("name").apply(user);



    }
}


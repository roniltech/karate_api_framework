package helpers;

import com.github.javafaker.Faker;

import net.minidev.json.JSONObject;

public class DataGenerator {

    public static Boolean getRandomBoolean(){
        Faker faker = new Faker();
        Boolean result = faker.bool().bool();
        return result;
    }

    public static JSONObject getRandomUserValue(){
        Faker faker = new Faker();
        String persona = faker.name() + "@groove.co";
        String type = faker.cat().breed();
        String source = faker.gameOfThrones().city();
        String due_at = faker.business().creditCardExpiry();
        String priority = faker.music().chord();
        String timezone = faker.space().star();
        JSONObject json = new JSONObject();
        json.put("persona", persona);
        json.put("type", type);
        json.put("source", source);
        json.put("due_at", due_at);
        json.put("priority", priority);
        json.put("timezone", timezone);
        return json;
    }

}
package org.example.ArraysMaps.Example1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kandidate {
    final private String name, lastname;
    private String email, address;
    final private Map<String, Integer> knowledges;

    public Kandidate(String name, String lastname, String email) {
        this.name      = name;
        this.lastname  = lastname;
        this.email     = email;
        this.address   = "";
        this.knowledges = new HashMap<>();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Map<String, Integer> getKnowledge() {
        return knowledges;
    }

    public Kandidate addKnowledge(String knowledge, int numberOfMonthExperience){
        this.knowledges.put(knowledge, numberOfMonthExperience);
        return this;
    }

    public int getNumberOfMonthWorkExperienceForKnowledge(String knowledge){
        if(this.knowledges.containsKey(knowledge)){
            return this.knowledges.get(knowledge);
        }
        return 0;
    }

    private String getKnowledgeList(){
        List<String> lists = new ArrayList<>();
        for (String knowledge : this.knowledges.keySet()){
            lists.add(knowledge + ": " + this.knowledges.get(knowledge));
        }
        return String.join("; ",  lists);
    }

    @Override
    public String toString() {
        return "Kandidate{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", knowledges=" + this.getKnowledgeList() +
                '}';
    }
}

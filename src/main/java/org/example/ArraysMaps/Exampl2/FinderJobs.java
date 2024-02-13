package org.example.ArraysMaps.Exampl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinderJobs {

    private final String name;
    private final String lastname;

    final private Map<String, String> job;

    public FinderJobs(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.job = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getlastname() {
        return lastname;
    }

    public Map<String, String> getJob() {
        return job;
    }

    public FinderJobs setJob(String nameJobs, String faxName){
        this.job.put(nameJobs, faxName);
        return this;
    }

    public String searchJob(String faxName){
        if(this.job.containsKey(faxName)){
          return this.job.get(faxName);
        }
        return " Not found";
    }

    private String getKnowledgeList(){
        List<String> lists = new ArrayList<>();
        for (String faxName : this.job.keySet()){
            lists.add(faxName + ": " + this.job.get(faxName));
        }
        return String.join("; ",  lists);
    }

    @Override
    public String toString() {
        return "Kandidate{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", job=" + this.getKnowledgeList() +
                '}';
    }
}

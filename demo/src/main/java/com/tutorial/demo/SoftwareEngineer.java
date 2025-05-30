package com.tutorial.demo;

import java.util.Objects;
import java.util.List;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private List<String> techStack;

    /*Constructors*/
    public SoftwareEngineer(){
    }

    public SoftwareEngineer(Integer id, String name, List<String> techStack){
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }   

    /*Getters and Setters*/

    public Integer getId(){
        return id;
    }
    
    public void setInteger(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTechStack(){
        return techStack;
    }

    public void setTechStack(List<String> techStack){
        this.techStack = techStack;
    }

    /* equals() and hashes */

    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, techStack);
    }

}

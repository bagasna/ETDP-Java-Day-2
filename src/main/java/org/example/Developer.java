package org.example;

import java.util.Objects;

public class Developer extends Employee{
    public String gitHubLink;

    public void updateGitLink(){
//        Developer dev = new Developer();
        this.gitHubLink = "www.github.com/aaaa";
//        System.out.println(gitHubLink);
    }

}

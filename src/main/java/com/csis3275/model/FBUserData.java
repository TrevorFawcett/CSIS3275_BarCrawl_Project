package com.csis3275.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FBUserData {

    public FBUserData(String id, String username, String email, String dob, String firstName,
                          String lastName) {
        this.setDocument_id(id);
        this.setUsername(username);
        this.setEmail(email);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDob(dob);
    }

    public FBUserData() {}

    private String document_id;
    private String username;
    private String email;
    private String dob;
    private String firstName;
    private String lastName;
}

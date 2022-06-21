package com.julesn.uabrewgateaway.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document(collection = User.COLLECTION)
public class User {
    public static final String COLLECTION = "users";
    private String _id;
    @Indexed(unique = true)
    private String login;
    private String password;
    private String name;
    private Set<String> rights;
}

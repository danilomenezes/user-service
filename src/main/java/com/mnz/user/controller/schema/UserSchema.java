package com.mnz.user.controller.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@JsonRootName(value = "user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSchema {
    @JsonProperty("id")
    private String id;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("birth_date")
    private Date birthDate;
    @JsonProperty("create_date")
    private Date createdDate;
}

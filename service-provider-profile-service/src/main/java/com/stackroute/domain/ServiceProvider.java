package com.stackroute.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Document( collection = "ServiceProvider")
public class ServiceProvider {

    @Id
    private int id;
    private String name;
    private long mobileNo;
    private String email;
    private String domain;
    private List<Skills> skills;
    private String previousProjects;
    private String cost;
    private String currentLocation;
    private String preferredLocation;
    private String password;
    private Date timestamp;

}

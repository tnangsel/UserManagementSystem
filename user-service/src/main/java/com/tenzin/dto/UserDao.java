package com.tenzin.dto;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDao {
	private String id;
    private String firstName;
    private String lastName;
    private String profilePicture;
    private String street; 
	private String city; 
	private String zipCode;
	private String state;
	private String country;
    private String email;
    private boolean mfaEnabled;
    private boolean accountLocked;
    private boolean enabled;
    private String phoneNumber;
    private LocalDateTime createdDateTime;
    private Set<String> roles;
    private Set<String> permissions;
}

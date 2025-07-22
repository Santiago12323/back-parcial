package com.arsw.parcial.parcial2.infrastructure.restclient.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

/**
 * Data Transfer Object representing a User.
 *
 * <p>This DTO is used for transferring user data between services and layers,
 * typically during REST client calls.</p>
 *
 * <p>Ignores unknown JSON properties during deserialization.</p>
 */
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {

    private String id;

    private String name;

    private String lastName;

    private String email;

    private String identification;



    private String uriCvFile;
}

package com.codesoom.assignment.dto;

import com.github.dozermapper.core.Mapping;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDetail {

    @NotBlank
    @Mapping("name")
    private String email;

    @NotBlank
    @Size(min = 4, max = 1024)
    @Mapping("password")
    private String password;
}

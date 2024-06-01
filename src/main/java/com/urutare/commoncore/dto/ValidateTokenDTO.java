package com.urutare.commoncore.dto;

import com.urutare.commoncore.models.Role;
import lombok.Data;

import java.util.UUID;

@Data
public class ValidateTokenDTO {
    private UUID userId;
    private String username;
    private Role[] roles;
    private String deviceId;
}

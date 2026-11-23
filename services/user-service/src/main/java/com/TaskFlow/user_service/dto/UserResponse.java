
package com.TaskFlow.user_service.dto;

import com.TaskFlow.user_service.entity.UserStatus;
import java.time.LocalDateTime;

public record UserResponse(
    Long id,
    String firstName,
    String lastName,
    String email,
    UserStatus status,
    LocalDateTime createdAt
) {}

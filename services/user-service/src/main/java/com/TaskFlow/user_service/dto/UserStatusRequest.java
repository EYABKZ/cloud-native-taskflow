
package com.TaskFlow.user_service.dto;

import com.TaskFlow.user_service.entity.UserStatus;
import jakarta.validation.constraints.NotNull;

public record UserStatusRequest(
    @NotNull(message = "User status is required")
    UserStatus status
) {}

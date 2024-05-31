package com.urutare.commoncore.dto;

import com.urutare.commoncore.models.Action;
import com.urutare.commoncore.models.ActivityType;
import lombok.Data;

import java.util.UUID;

@Data
public class OfflineTransactionNotification {
    private UUID userId;
    private String deviceId;
    private UUID companyId;
    private UUID branchId;
    private String message;
    private ActivityType type;
    private Action action;
}

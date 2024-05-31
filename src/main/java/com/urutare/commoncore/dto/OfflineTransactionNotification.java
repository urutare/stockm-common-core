package com.urutare.commoncore.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class OfflineTransactionNotification {
    private UUID userId;
    private String deviceId;
    private UUID companyId;
    private UUID branchId;
    private String message;
}

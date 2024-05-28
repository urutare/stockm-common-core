package com.urutare.commoncore.dto;

import com.fasterxml.jackson.databind.JsonNode;
import com.urutare.commoncore.models.Action;
import com.urutare.commoncore.models.ActivityType;
import lombok.Data;

import java.util.UUID;

@Data
public class OfflineTransactionUpsertDTO {
    private UUID id;
    private UUID branchId;
    private UUID companyId;
    private ActivityType type;
    private Action action;
    private JsonNode activityData;
    private UUID userId;

    private String name;

    private Boolean protectedData;

    private String deviceId;
}
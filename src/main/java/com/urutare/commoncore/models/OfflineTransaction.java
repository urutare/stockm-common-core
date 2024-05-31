package com.urutare.commoncore.models;

import java.util.UUID;

public interface OfflineTransaction {
    UUID getId();

    UUID getUpdatedBy();

    String getDeviceId();
}

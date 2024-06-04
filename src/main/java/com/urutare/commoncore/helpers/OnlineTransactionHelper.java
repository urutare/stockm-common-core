package com.urutare.commoncore.helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.urutare.commoncore.constants.Topic;
import com.urutare.commoncore.dto.OfflineTransactionNotification;
import com.urutare.commoncore.dto.OfflineTransactionUpsertDTO;
import com.urutare.commoncore.models.Action;
import com.urutare.commoncore.models.ActivityType;
import com.urutare.commoncore.models.OfflineTransaction;

import java.util.UUID;


public class OnlineTransactionHelper {

    public static OfflineTransactionUpsertDTO toObject(OfflineTransaction offlineTransaction, Action action, ActivityType activityType) {
        ObjectMapper objectMapper = new ObjectMapper();

        OfflineTransactionUpsertDTO offlineTransactionUpsertDTO = new OfflineTransactionUpsertDTO();
        offlineTransactionUpsertDTO.setId(UUID.randomUUID());
        offlineTransactionUpsertDTO.setActivityData(objectMapper.valueToTree(offlineTransaction));
        offlineTransactionUpsertDTO.setAction(action);
        offlineTransactionUpsertDTO.setName(Topic.ONLINE_TRANSACTIONS);
        offlineTransactionUpsertDTO.setType(activityType);
        offlineTransactionUpsertDTO.setUserId(offlineTransaction.getUpdatedBy());
        offlineTransactionUpsertDTO.setDeviceId(offlineTransaction.getDeviceId());

        return offlineTransactionUpsertDTO;
    }

    public static OfflineTransactionNotification toNotification(OfflineTransaction offlineTransaction) {
        OfflineTransactionNotification offlineTransactionNotification = new OfflineTransactionNotification();
        offlineTransactionNotification.setUserId(offlineTransaction.getUpdatedBy());
        offlineTransactionNotification.setDeviceId(offlineTransaction.getDeviceId());
        offlineTransactionNotification.setMessage("Updated transaction is available for sync");

        return offlineTransactionNotification;
    }

}

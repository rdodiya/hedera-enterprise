package com.openelements.hedera.base.protocol;

import com.hedera.hashgraph.sdk.Status;
import com.hedera.hashgraph.sdk.TopicId;
import com.hedera.hashgraph.sdk.TransactionId;
import java.util.Objects;
import org.jspecify.annotations.NonNull;

public record TopicDeleteResult(@NonNull TransactionId transactionId, @NonNull Status status) implements TransactionResult{

    public TopicDeleteResult {
        Objects.requireNonNull(transactionId, "transactionId must not be null");
        Objects.requireNonNull(status, "status must not be null");
    }
}

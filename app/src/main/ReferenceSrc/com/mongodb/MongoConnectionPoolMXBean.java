package com.mongodb;

import com.mongodb.util.ConnectionPoolStatisticsBean;

@Deprecated
/* loaded from: classes.dex */
public interface MongoConnectionPoolMXBean {
    String getHost();

    int getMaxSize();

    String getName();

    int getPort();

    ConnectionPoolStatisticsBean getStatistics();
}

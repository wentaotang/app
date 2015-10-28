package com.hgcode.jedis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by wentao on 2015/10/28.
 */
public class JedisDirectPool extends JedisPool {
    public JedisDirectPool(String poolName, HostAndPort address, JedisPoolConfig config) {
        this(poolName, address, new ConnectionInfo(), config);
    }

    public JedisDirectPool(String poolName, HostAndPort address, ConnectionInfo connectionInfo, JedisPoolConfig config) {
        initInternalPool(address, connectionInfo, config);
        this.poolName = poolName;
    }
}

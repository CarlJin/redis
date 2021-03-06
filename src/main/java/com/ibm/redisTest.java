package com.ibm;

import redis.clients.jedis.Jedis;
/**
 * 运行redis要先开启redis服务
 * @author jh
 *
 */
public class redisTest {
	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		// 查看服务是否运行
		System.out.println("Server is running: " + jedis.ping());
		jedis.close();
	}
}

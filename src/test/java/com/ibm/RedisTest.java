package com.ibm;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(RedisTest.class.getName());

	@Test
	public void test1() {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		// 查看服务是否运行
		System.out.println("Server is running: " + jedis.ping());
		jedis.close();
	}

	@Test
	public void test2() {
		Jedis jedis = new Jedis();
		jedis.set("carl", "blackboard");
		LOGGER.info("====================>" + jedis.get("carl"));
		jedis.close();
	}

	@Test
	public void test3() {
		Jedis jedis = new Jedis();
		jedis.lpush("list1", "frist");
		jedis.lpush("list1", "second");
		jedis.lpush("list1", "three");
		List<String> list = jedis.lrange("list1", 0, 5);
		LOGGER.info(list.toString());
		jedis.close();
	}

	@Test
	public void test4() {
		Jedis jedis = new Jedis();
		jedis.close();
	}

	@Test
	public void test5() {
		Jedis jedis = new Jedis();

		jedis.close();
	}

	@Test
	public void test6() {
		Jedis jedis = new Jedis();

		jedis.close();
	}

	@Test
	public void test7() {
		Jedis jedis = new Jedis();

		jedis.close();
	}

	@Test
	public void test8() {
		Jedis jedis = new Jedis();

		jedis.close();
	}
}

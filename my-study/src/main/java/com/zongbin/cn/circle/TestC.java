package com.zongbin.cn.circle;

public class TestC {
	private TestA testA;

	public TestC() {
	}

	public TestC(TestA testA) {
		this.testA = testA;
	}

	public void c() {
		testA.a();
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}

package com.javalab.anonymous.pkg01;

public class HomeMain { // class s

	public static void main(String[] args) { // main s

		// Home 객체 생성
		Home home = new Home();

		// 익명 구현 객체가 대입된 필드 사용
		home.use1();

		// 익명 구현 객체가 대입된 로컬 변수 사용
		home.use2();

		// 익명 구현 객체가 대입된 매개 변수 사용
		home.use3(new RemoteControl() {		// RemoteControl은 인터페이스 이름

			// 익명 구현 객체 생성 후 인터페이스(부모)에 담음
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다.");
			}
			
		});
		
	} // main e

} // class e

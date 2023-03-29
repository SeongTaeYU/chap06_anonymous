package com.javalab.anonymous.pkg01;

public class Home { // class s

	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {	

		// 익명 구현 객체 생성 후 인터페이스(부모)에 담음
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	}; // end 익명 구현 객체

	// 메소드 ( 필드 이용 )
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}

	// 메소드 ( 로컬 변수 이용 )
	public void use2() {
		// 로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {

			// 익명 구현 객체 생성 후 인터페이스(부모)에 담음
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		}; // end 익명 구현 객체
		rc.turnOn();		// 인터페이스 껍데기 메소드를 통해서 자식 메소드가 호출됨
		rc.turnOff();		// 인터페이스 껍데기 메소드를 통해서 자식 메소드가 호출됨
	}

	// 메소드 ( 매개 변수 이용 )
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
} // class e

package com.javalab.anonymous.pkg00;

/**
 * 실행클래스
 */
public class CarMain { // class s

	public static void main(String[] args) { // main s

		// 1. 자동차 객체 생성
		Car car = new Car();

		// 익명 자식 객체가 저장된 필드 사용
		car.run1();

		// 익명 자식 객체가 저장된 로컬 변수 사용
		car.run2();

		// 익명 자식 객체가 저장된 매개 변수 사용
		car.run3(new Tire() {		// 익명 자식 객체 
			@Override
			public void roll() {
				System.out.println("익명 자식 타이어 객체 3이 굴러갑니다.");
			};
		});
	} // main e

} // class e

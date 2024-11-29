package com.airplaneService.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.airplaneService.model.FlightVO;

public class FlightRegisterManager {
	public static Scanner sc = new Scanner(System.in);

	public void selectManager() {
		FlightDAO fdao = new FlightDAO();
		ArrayList<FlightVO> flightList = new ArrayList<FlightVO>();

		flightList = fdao.selectDB();
		if (flightList == null) {
			System.out.println("데이터가 존재하지 않습니다.");
			return;
		}
		printFlightList(flightList);
	}
	
	public void searchManager() {
		FlightDAO fdao = new FlightDAO();
		ArrayList<FlightVO> flightList = new ArrayList<FlightVO>();
		
		flightList = fdao.searchDB();
		if (flightList == null) {
			System.out.println("데이터가 존재하지 않습니다.");
			return;
		}
		printFlightList(flightList);
	}
	

	public void insertManager() {
		FlightDAO fdao = new FlightDAO();
		FlightVO fvo = new FlightVO();
		
		System.out.println("항공편 명을 입력 해 주세요\n>>");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("비행기 명을 입력 해 주세요\n>>");
		String planeNo = sc.nextLine();
		System.out.println("도착 국가를 입력 해 주세요\n>>");
		String arrivalCountryNo = sc.nextLine();
		System.out.println("출발 시간을 입력 해 주세요\n>>");
		Double departureHour = Double.parseDouble(sc.nextLine());
		
		fvo = new FlightVO(no, planeNo, arrivalCountryNo, departureHour);
		boolean successFlag = fdao.insertDB(fvo);

		if (successFlag == true) {
			System.out.println("입력이 완료되었습니다.");
		} else {
			System.out.println("입력에 실패하였습니다. ");
		}
	}

	public void updateManager() {
		FlightDAO fdao = new FlightDAO();
		FlightVO fvo = new FlightVO();
		
		System.out.println("수정하고자 하는 항공편 번호를 입력 해 주세요\n>>");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("비행기 명을 입력 해 주세요\n>>");
		String planeNo = sc.nextLine();
		System.out.println("도착 국가를 입력 해 주세요\n>>");
		String arrivalCountryNo = sc.nextLine();
		System.out.println("출발 시간을 입력 해 주세요\n>>");
		Double departureHour = Double.parseDouble(sc.nextLine());
		
		fvo = new FlightVO(no, planeNo, arrivalCountryNo, departureHour);
		boolean successFlag = fdao.updateDB(fvo);

		if (successFlag == true) {
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("수정에 실패하였습니다. ");
		}
	}

	public void deleteManager() {
		FlightDAO fdao = new FlightDAO();
		FlightVO fvo = new FlightVO();
		
		System.out.println("삭제하고자 하는 항공편 번호를 입력 해 주세요\n>>");
		int no = Integer.parseInt(sc.nextLine());
		
		fvo = new FlightVO();
		fvo.setNo(no);
		
		boolean successFlag = fdao.deleteDB(fvo);

		if (successFlag == true) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("삭제 실패했습니다. ");
		}
	}

	private void printFlightList(ArrayList<FlightVO> flightList) {
		for (FlightVO fvo : flightList) {
			System.out.println(fvo.toString());
		}

	}
}


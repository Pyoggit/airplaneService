package com.airplaneService.util;

import java.sql.Connection;

public class Test {
	// 데이터베이스 DB 연결 접속 테스트
	public static void main(String[] args) {
		Connection con = DBUtility.dbCon();
		if (con != null) {
			System.out.println("데이타베이스 접속 성공");
		} else {
			System.out.println("데이타베이스 접속 실패");
		}
	}
}
package com.airplaneService.model;

public class FlightVO {
	private int no;
	private String planeNo;
	private String departureCountryNo;
	private String arrivalCountryNo;
	private int price;
	private Double departureHour;
	private Double arrivalHour;

	public FlightVO(int no, String planeNo, String departureCountryNo, String arrivalCountryNo, int price,
			Double departureHour, Double arrivalHour) {
		super();
		this.no = no;
		this.planeNo = planeNo;
		this.departureCountryNo = departureCountryNo;
		this.arrivalCountryNo = arrivalCountryNo;
		this.price = price;
		this.departureHour = departureHour;
		this.arrivalHour = arrivalHour;
	}

	public FlightVO(int no, String planeNo, String departureCountryNo, String arrivalCountryNo, int price,
			Double departureHour) {
		super();
		this.no = no;
		this.planeNo = planeNo;
		this.departureCountryNo = departureCountryNo;
		this.arrivalCountryNo = arrivalCountryNo;
		this.price = price;
		this.departureHour = departureHour;
	}

	public FlightVO(int no, String planeNo, String arrivalCountryNo, Double departureHour) {
		super();
		this.no = no;
		this.planeNo = planeNo;
		this.arrivalCountryNo = arrivalCountryNo;
		this.departureHour = departureHour;
	}

	public FlightVO() {
		super();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getPlaneNo() {
		return planeNo;
	}

	public void setPlaneNo(String planeNo) {
		this.planeNo = planeNo;
	}

	public String getDepartureCountryNo() {
		return departureCountryNo;
	}

	public void setDepartureCountryNo(String departureCountryNo) {
		this.departureCountryNo = departureCountryNo;
	}

	public String getArrivalCountryNo() {
		return arrivalCountryNo;
	}

	public void setArrivalCountryNo(String arrivalCountryNo) {
		this.arrivalCountryNo = arrivalCountryNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Double getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(Double departureHour) {
		this.departureHour = departureHour;
	}

	public Double getArrivalHour() {
		return arrivalHour;
	}

	public void setArrivalHour(Double arrivalHour) {
		this.arrivalHour = arrivalHour;
	}

	@Override
	public String toString() {
		return "flightVO [no=" + no + ", planeNo=" + planeNo + ", departureCountryNo=" + departureCountryNo
				+ ", arrivalCountryNo=" + arrivalCountryNo + ", price=" + price + ", departureHour=" + departureHour
				+ ", arrivalHour=" + arrivalHour + "]";
	}

}

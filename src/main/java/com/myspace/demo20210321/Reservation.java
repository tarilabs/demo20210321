package com.myspace.demo20210321;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Reservation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.time.LocalDate checkin;

	private java.time.LocalDate checkout;
	private java.util.List<java.lang.String> guests;

	public Reservation() {
	}

	public java.time.LocalDate getCheckin() {
		return this.checkin;
	}

	public void setCheckin(java.time.LocalDate checkin) {
		this.checkin = checkin;
	}

	public java.time.LocalDate getCheckout() {
		return this.checkout;
	}

	public void setCheckout(java.time.LocalDate checkout) {
		this.checkout = checkout;
	}

	public java.util.List<java.lang.String> getGuests() {
		return this.guests;
	}

	public void setGuests(java.util.List<java.lang.String> guests) {
		this.guests = guests;
	}

	public Reservation(java.time.LocalDate checkin,
			java.time.LocalDate checkout,
			java.util.List<java.lang.String> guests) {
		this.checkin = checkin;
		this.checkout = checkout;
		this.guests = guests;
	}

}
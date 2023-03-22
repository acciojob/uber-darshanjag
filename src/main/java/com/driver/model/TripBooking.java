package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "trip_booking")
public class TripBooking{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int TripBookingId;

    private String fromLocation;

    private String toLocation;

    private int distanceInKm;

    private TripStatus status;
    private int bill;
    public TripBooking() {
    }

    public TripBooking(int tripBookingId, String fromLocation, String toLocation, int distanceInKm, TripStatus tripStatus) {
        TripBookingId = tripBookingId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.status = tripStatus;
    }

    @ManyToOne
    @JoinColumn
    private Customer customer;

    @ManyToOne
    @JoinColumn
    private Driver driver;

    public int getTripBookingId() {
        return TripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        TripBookingId = tripBookingId;
    }
    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus tripStatus) {
        this.status = tripStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
package com.nineleaps.flightmanagementsystem.service.InterfaceService;
import com.nineleaps.flightmanagementsystem.entity.Payment;
import com.nineleaps.flightmanagementsystem.entity.Booking;
import java.util.List;
public interface InterfaceBooking {
    public Booking bookFlight(Booking newBooking);
    public List<Booking> viewAllBooking();
    public Booking modifyBooking(Booking modifyBooking,Long id);
    public Payment makePayment(Long bookingId);
    public Booking cancelBooking(Long bookingId);
}

package com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation;
import com.nineleaps.flightmanagementsystem.entity.Booking;
import com.nineleaps.flightmanagementsystem.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nineleaps.flightmanagementsystem.repository.BookingRepository;
import com.nineleaps.flightmanagementsystem.service.InterfaceService.InterfaceBooking;

import java.util.List;

@Service
public class InterfaceBookingImplementation implements InterfaceBooking {
    @Autowired
    private BookingRepository bookingRepo;

    @Override
    public Booking bookFlight(Booking newBooking) {
        return bookingRepo.save(newBooking);
    }

    @Override
    public List<Booking> viewAllBooking() {
        return bookingRepo.findAll();
    }

    @Override
    public Booking modifyBooking(Booking modifyBooking, Long id) {
        Booking res = bookingRepo.findById(id).get();
        if(res != null) {
            res.setBookingNumber(modifyBooking.getBookingNumber());
            res.setBookinDate(modifyBooking.getBookinDate());
            res.setTravelDate(modifyBooking.getTravelDate());
            res.setTotalCost(modifyBooking.getTotalCost());
        }
        bookingRepo.save(res);
        return res;
    }

    @Override
    public Payment makePayment(Long bookingId) {
        return null;
    }

    @Override
    public Booking cancelBooking(Long bookingId) {
        Booking res = bookingRepo.findById(bookingId).get();
        bookingRepo.deleteById(bookingId);
        return res;
    }
}

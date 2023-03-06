package com.example.mypackage.TicketRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mypackage.Ticket.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUserId(String userId);
    List<Ticket> findBySeatNumber(int seatNumber);
}

package com.example.mypackage.TicketService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mypackage.Ticket.Ticket;
import com.example.mypackage.TicketRepository.TicketRepository;



@Service
public class TicketService implements TicketServ {
	
	public enum Status {
	    AVAILABLE,
	    BOOKED,
	    RESERVED,
	    CANCELLED
	}
    @Autowired
    private TicketRepository ticketRepository;
    
    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public List<Ticket> getTicketsByUserId(String userId) {
        return ticketRepository.findByUserId(userId);
    }

    @Override
    public List<Ticket> getTicketsBySeatNumber(int seatNumber) {
        return ticketRepository.findBySeatNumber(seatNumber);
    }

    @Override
    public Ticket bookTicket(Ticket ticket) {
        if (!isSeatAvailable(ticket.getSeatNumber())) {
            throw new RuntimeException("Seat not available");
     }
        ticket.setStatus(Status.BOOKED);
        return ticketRepository.save(ticket);
        
    }
    @Override
    public Ticket updateTicketStatus(Long id, Status status) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        ticket.setStatus(status);
        return ticketRepository.save(ticket);
    }


    @Override
    public Ticket cancelTicket(Long id) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        ticket.setStatus(Status.CANCELLED);
        return ticketRepository.save(ticket);
    }

    private boolean isSeatAvailable(int seatNumber) {
        List<Ticket> tickets = ticketRepository.findBySeatNumber(seatNumber);
        for (Ticket ticket : tickets) {
            if (ticket.getStatus() == TicketService.Status.BOOKED) {
                return false;
            }
        }
        return true;
    }
}

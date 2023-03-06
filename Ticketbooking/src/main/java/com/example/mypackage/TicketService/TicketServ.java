package com.example.mypackage.TicketService;

import java.util.List;

import com.example.mypackage.Ticket.Ticket;
import com.example.mypackage.TicketService.TicketService.Status;

public interface TicketServ {
	    List<Ticket> getAllTickets();
	    List<Ticket> getTicketsByUserId(String userId);
	    List<Ticket> getTicketsBySeatNumber(int seatNumber);
	    Ticket bookTicket(Ticket ticket);
	    Ticket cancelTicket(Long id);
		Ticket updateTicketStatus(Long id, Status status);
}
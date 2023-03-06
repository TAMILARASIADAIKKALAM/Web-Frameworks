package com.example.mypackage.TicketController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mypackage.Ticket.Ticket;
import com.example.mypackage.TicketService.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = ticketService.getAllTickets();
        return ResponseEntity.ok(tickets);
    }

    @GetMapping(params = "userId")
    public ResponseEntity<List<Ticket>> getTicketsByUserId(@RequestParam String userId) {
        List<Ticket> tickets = ticketService.getTicketsByUserId(userId);
        return ResponseEntity.ok(tickets);
    }

    @GetMapping(params = "seatNumber")
    public ResponseEntity<List<Ticket>> getTicketsBySeatNumber(@RequestParam int seatNumber) {
        List<Ticket> tickets = ticketService.getTicketsBySeatNumber(seatNumber);
        return ResponseEntity.ok(tickets);
    }

    @PostMapping
    public ResponseEntity<Ticket> bookTicket(@RequestBody Ticket ticket) {
        Ticket bookedTicket = ticketService.bookTicket(ticket);
        return ResponseEntity.ok(bookedTicket);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ticket> updateTicketStatus(@PathVariable Long id, @RequestParam com.example.mypackage.TicketService.TicketService.Status status) {
        Ticket updatedTicket = ticketService.updateTicketStatus(id, status);
        return ResponseEntity.ok(updatedTicket);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> cancelTicket(@PathVariable Long id) {
        ticketService.cancelTicket(id);
        return ResponseEntity.noContent().build();
    }
}

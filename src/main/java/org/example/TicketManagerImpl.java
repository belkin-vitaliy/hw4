package org.example;

public class TicketManagerImpl implements TicketManager{

    private final Ticket[] tickets;

    public TicketManagerImpl(Ticket[] tickets) {
        this.tickets = tickets;
    }

    @Override
    public void add(Ticket ticket) {

    }

    @Override
    public Ticket next() {
        return null;
    }
}

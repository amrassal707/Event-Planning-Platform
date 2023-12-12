package PassBoard.Assessment.Services.Interfaces;

import PassBoard.Assessment.DTOs.EventDTO;
import PassBoard.Assessment.Models.Event;
import PassBoard.Assessment.Responses.EventCreationResponse;

import java.util.List;

public interface EventServiceInterface {
    List<EventDTO> getAll();
    EventDTO getEventByName(String name);

    EventCreationResponse createEvent(EventDTO eventDTO);
    Event updateEvent(EventDTO eventDTO);
}

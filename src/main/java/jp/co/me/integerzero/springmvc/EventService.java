package jp.co.me.integerzero.springmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {
    public List<Event> getEvents() {
        Event event1 = Event.builder()
                .name("스프링 웹1")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2018, 6, 16, 22, 0))
                .endDateTime(LocalDateTime.of(2018, 6, 16, 23, 0))
                .build();

        Event event2 = Event.builder()
                .name("스프링 웹2")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2018, 6, 16, 22, 0))
                .endDateTime(LocalDateTime.of(2018, 6, 16, 23, 0))
                .build();

        return List.of(event1, event2);
    }
}

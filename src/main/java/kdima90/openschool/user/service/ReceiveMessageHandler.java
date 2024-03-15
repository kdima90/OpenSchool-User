package kdima90.openschool.user.service;

import kdima90.openschool.user.dto.SchoolMessage;
import kdima90.openschool.user.entity.School;
import kdima90.openschool.user.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReceiveMessageHandler {
    private final SchoolServiceImpl schoolServiceImpl;

    @RabbitListener(queues = "openschool_school_openschool_user")
    public void processOrder(SchoolMessage schoolMessage) {
        schoolServiceImpl.saveSchool(schoolMessage);
    }
}

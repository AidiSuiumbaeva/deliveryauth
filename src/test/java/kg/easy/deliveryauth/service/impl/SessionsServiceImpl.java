package kg.easy.deliveryauth.service.impl;

import kg.easy.deliveryauth.mappers.SessionsMapper;
import kg.easy.deliveryauth.models.dto.SessionsDto;
import kg.easy.deliveryauth.models.entity.Sessions;
import kg.easy.deliveryauth.repository.SessionRep;
import kg.easy.deliveryauth.service.SessionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionsServiceImpl implements SessionsService {

    @Autowired
    private SessionRep sessionRep;
    @Override
    public SessionsDto save(SessionsDto sessionsDto) {
        Sessions sessions= SessionsMapper.SESSIONS_MAPPER.sessionsToSessionsDto(sessionsDto);
        sessions=sessionRep.save(sessions);
        sessionsDto=SessionsMapper.SESSIONS_MAPPER.sessionsDtoToSessions(sessions);
        return sessionsDto;
    }
}

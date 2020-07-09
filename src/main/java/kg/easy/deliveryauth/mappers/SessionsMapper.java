package kg.easy.deliveryauth.mappers;

import kg.easy.deliveryauth.models.dto.SessionsDto;
import kg.easy.deliveryauth.models.entity.Sessions;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionsMapper {
    SessionsMapper SESSIONS_MAPPER= Mappers.getMapper(SessionsMapper.class);
    Sessions sessionsToSessionsDto(SessionsDto sessionsDto);
    SessionsDto sessionsDtoToSessions(Sessions sessions);

}

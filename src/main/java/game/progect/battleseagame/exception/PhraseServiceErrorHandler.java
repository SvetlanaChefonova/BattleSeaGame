package game.progect.battleseagame.exception;

/*import game.progect.battleseagame.constant.Code;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;


@Slf4j
@ControllerAdvice
public class PhraseServiceErrorHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleUnexpectedErrorException(Exception ex) {
        log.error("Exception: {}", ex.toString());
        return new ResponseEntity<>(ErrorResponse.builder()
                .error(Error
                        .builder()
                        .code(Code.INTERNAL_SERVER_ERROR)
                        .userMessage("Внутренняя ошибка сервиса")
                        .build())
                .build(), INTERNAL_SERVER_ERROR);
    }
}*/

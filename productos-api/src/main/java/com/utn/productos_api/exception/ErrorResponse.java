package com.utn.productos_api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String mensaje;  // ← Cambié "error" por "mensaje"
    private String path;

    // Constructor que coincide con tu GlobalExceptionHandler
    public ErrorResponse(LocalDateTime timestamp, int status, String mensaje, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.mensaje = mensaje;
        this.path = path;
    }
}


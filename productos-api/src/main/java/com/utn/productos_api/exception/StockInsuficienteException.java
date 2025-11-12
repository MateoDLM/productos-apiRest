package com.utn.productos_api.exception;

public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException() {
        super("Stock insuficiente");
    }

    public StockInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

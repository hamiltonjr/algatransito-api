package com.algaworks.algatransito_api.domain.exception;

public class NegocioException extends RuntimeException {
    public NegocioException(String mensagem) {
        super(mensagem);
    }
}

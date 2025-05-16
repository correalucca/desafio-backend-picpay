package com.javanauta.transacoessimplificado.controller;

import java.math.BigDecimal;

public record TransferenciaDTO(BigDecimal valor, Long pagador, Long beneficiario) {
}

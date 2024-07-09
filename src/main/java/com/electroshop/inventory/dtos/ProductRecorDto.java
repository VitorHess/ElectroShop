package com.electroshop.inventory.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecorDto(@NotBlank String name, @NotNull BigDecimal value) {
}

package com.utn.productos_api.dto;

import com.utn.productos_api.model.Categoria;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductoDTO {
    @Schema(description = "Nombre del producto", example = "Notebook Lenovo ThinkPad", minLength = 3, maxLength = 100)
    @NotNull(message = "El nombre no puede ser nulo")
    @NotEmpty(message = "El nombre no puede estar vacio")
    @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
    private String nombre;

    @Schema(description = "Descripción del producto", example = "Notebook empresarial 14 pulgadas", maxLength = 500)
    @Size(max = 500, message = "La descripción no puede tener mas de 500 caracteres")
    private String descripcion;

    @Schema(description = "Precio del producto en dólares", example = "899.99", minimum = "0.01")
    @NotNull(message = "El precio no puede ser nulo")
    @DecimalMin(value = "0.01", message = "El precio debe ser mayor a 0")
    private Double precio;

    @Schema(description = "Cantidad disponible en stock", example = "15", minimum = "0")
    @NotNull(message = "El stock no puede estar vacio")
    @Min(value = 0, message = "El stock no puede ser negativo")
    private Integer stock;

    @Schema(description = "Categoría del producto", example = "ELECTRONICA")
    @NotNull(message = "La categoria no puede estar vacia")
    private Categoria categoria;
}

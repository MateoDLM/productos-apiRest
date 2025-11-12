package com.utn.productos_api.service;

import com.utn.productos_api.dto.ActualizarStockDTO;
import com.utn.productos_api.dto.ProductoDTO;
import com.utn.productos_api.dto.ProductoResponseDTO;
import com.utn.productos_api.exception.ProductoNotFoundException;
import com.utn.productos_api.exception.StockInsuficienteException;
import com.utn.productos_api.model.Categoria;
import com.utn.productos_api.model.Producto;
import com.utn.productos_api.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    public ProductoResponseDTO crearProducto(ProductoDTO productoDTO){
        Producto producto = convertirAEntidad(productoDTO);
        Producto productoGuardado= productoRepository.save(producto);
        return convertirAResponseDTO(productoGuardado);
    }

    public List<ProductoResponseDTO> obtenerTodos(){
        return productoRepository.findAll()
                .stream()
                .map(this::convertirAResponseDTO)
                .collect(Collectors.toList());
    }

    public ProductoResponseDTO obtenerPorId(Long id){
        return productoRepository.findById(id)
                .map(this::convertirAResponseDTO)
                .orElseThrow(() -> new ProductoNotFoundException(id));
    }

    public List<ProductoResponseDTO> obtenerPorCategoria(Categoria categoria){
        return productoRepository.findByCategoria(categoria)
                .stream()
                .map(this::convertirAResponseDTO)
                .collect(Collectors.toList());
    }

    public ProductoResponseDTO actualizarProducto(Long id, ProductoDTO productoDTO){

        return productoRepository.findById(id)
                .map(p -> {
                    p.setNombre(productoDTO.getNombre());
                    p.setDescripcion(productoDTO.getDescripcion());
                    p.setPrecio(productoDTO.getPrecio());
                    p.setStock(productoDTO.getStock());
                    p.setCategoria(productoDTO.getCategoria());
                    Producto productoActualizado = productoRepository.save(p);
                    return convertirAResponseDTO(productoActualizado);
                })
                .orElseThrow(() -> new ProductoNotFoundException(id));
    }

    public ProductoResponseDTO actualizarStock(Long id, ActualizarStockDTO actualizarStockDTO){
        return productoRepository.findById(id)
                .map(p -> {
                    if (actualizarStockDTO.getStock() < 0) {
                        throw new StockInsuficienteException("El stock no puede ser negativo");
                    }
                    p.setStock(actualizarStockDTO.getStock());
                    Producto productoActualizado = productoRepository.save(p);
                    return convertirAResponseDTO(productoActualizado);
                })
                .orElseThrow(() -> new ProductoNotFoundException(id));
    }

    public void eliminarProducto(Long id){
        if (!productoRepository.existsById(id)) {
            throw new ProductoNotFoundException(id);
        }
        productoRepository.deleteById(id);
    }

    private Producto convertirAEntidad(ProductoDTO dto) {
        Producto producto = new Producto();
        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setStock(dto.getStock());
        producto.setCategoria(dto.getCategoria());
        return producto;
    }

    private ProductoResponseDTO convertirAResponseDTO(Producto producto) {
        return new ProductoResponseDTO(
                producto.getId(),
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getCategoria()
        );
    }
}

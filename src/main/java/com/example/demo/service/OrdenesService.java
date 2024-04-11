package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ordenes;
import com.example.demo.entity.Productos;
import com.example.demo.entity.Sucursales;
import com.example.demo.pojo.OrdenDto;
import com.example.demo.pojo.OrdenRequest;
import com.example.demo.pojo.OrderResponse;
import com.example.demo.pojo.ProductoDto;
import com.example.demo.pojo.SucursalDto;
import com.example.demo.repository.OrdenesRepository;
import com.example.demo.repository.ProductosRepository;
import com.example.demo.repository.SucursalesRepository;

@Service
public class OrdenesService {
	
	@Autowired
	private OrdenesRepository ordenesRepository;
	@Autowired
	private ProductosRepository productosRepository;
	@Autowired
	private SucursalesRepository sucursalesRepository;
	
	public void guardarOrden( OrdenRequest orden) {
		
		Sucursales sucursal =new Sucursales();
		sucursal.setNombre(orden.getNombreSucursal());
		Sucursales sucursalesEntity =sucursalesRepository.save(sucursal);
		
		
		Productos producto = new Productos();
		producto.setCodigo(orden.getCodigoProducto());
		producto.setDescripcion(orden.getDescripcionProducto());
		producto.setPrecio(orden.getPrecioProducto());
		producto.setOrdenes(null);
		//Productos productoEntity =productosRepository.save(producto);
		
		
		Ordenes ordenDto = new Ordenes();
		ordenDto.setFecha(orden.getFechaOrden());
		ordenDto.setTotal(orden.getTotalOrden());
		ordenDto.setSucursal(sucursal);
		//ordenDto.setProductos(Arrays.asList(producto));
		
	//Productos productoEntity =productosRepository.save(producto);
	
		
		Ordenes ordenesEntity=ordenesRepository.save(ordenDto);
		producto.setOrdenes(ordenesEntity);
		
		Productos productoEntity =productosRepository.save(producto);
		
	}
	
	public OrderResponse getOrdenes(Long id) {
	Optional<Ordenes> orden =ordenesRepository.findById(id);
	if(orden.isPresent()) {
		OrderResponse response =new OrderResponse();
		 OrdenDto ordendto= new OrdenDto();
		 ordendto.setFecha(orden.get().getFecha());
		 ordendto.setTotal(orden.get().getTotal());
		 
		 
         List<ProductoDto> productos= new ArrayList();
         
         orden.get().getProductos().forEach(i->{
        	 ProductoDto productoDto= new ProductoDto();
    		 productoDto.setCodigo(i.getCodigo());
    		 productoDto.setDescripcion(i.getDescripcion());
    		 productoDto.setPrecio(i.getPrecio());
    		 productos.add(productoDto);
         });
		
		 SucursalDto sucursalDto= new SucursalDto();
		 sucursalDto.setNombre(orden.get().getSucursal().getNombre());
		 response.setOrden(ordendto);
		 response.setProductos(productos);
		 response.setSucursales(sucursalDto);
	return response;
	}
	else {
		return null;
	}
	}
	
	public Ordenes updatePrecio( OrdenRequest orden) {
		Optional<Ordenes> orderEntity=ordenesRepository.findById(orden.getOrderId());
		if(orderEntity.isPresent()) {
			orderEntity.get().getProductos().forEach(i->i.setPrecio(orden.getPrecioProducto()));
			
			
		return ordenesRepository.save(orderEntity.get());
		}else {
			return null;
		}
	}

}

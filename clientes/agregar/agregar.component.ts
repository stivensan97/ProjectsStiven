import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service'
import { Cliente } from 'src/app/Modelo/cliente';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }

cliente:Cliente = new Cliente();

Guardar(){
  this.service.createCliente(this.cliente).subscribe(data=>{
    alert("Se ha agregado con exito a "+this.cliente.cus_dsnombres+" "+this.cliente.cus_dsapellidos);
    this.router.navigate(["listar"])
  })
}

}

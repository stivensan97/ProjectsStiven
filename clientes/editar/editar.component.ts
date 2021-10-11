import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from 'src/app/Modelo/cliente';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  constructor(private router: Router, private service:ServiceService) { }

  ngOnInit(): void {
    this.Editar();
  }
  
cliente:Cliente = new Cliente();

Actualizar(cliente:Cliente){
  this.service.updateCliente(cliente).subscribe(data =>{
    this.cliente=data;
    alert("Se actualizo correctamente");
    this.router.navigate(["listar"])
  })

}

Editar(){

  let nmid=localStorage.getItem("nmid");
  this.service.getClienteId(+nmid!)
  .subscribe(data=>{
    this.cliente=data;
  })
}

}



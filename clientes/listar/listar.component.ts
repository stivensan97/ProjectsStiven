import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Cliente } from 'src/app/Modelo/cliente';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  Clientes:Cliente[]|undefined;

  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit(): void {
    this.service.getClientes()
    .subscribe(data => {
      this.Clientes=data;
    
    })
  }

  Editar(cliente:Cliente):void{
    localStorage.setItem("nmid",cliente.nmid!.toString());
    this.router.navigate(["editar"]);
  }
  
  Eliminar(cliente:Cliente):void{
    this.service.deleteCliente(cliente)
    .subscribe(data =>{
      this.Clientes=this.Clientes!.filter(c=>c!==cliente);
      alert("Cliente eliminado")
    })
  }
}

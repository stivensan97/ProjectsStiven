import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Cliente} from '../Modelo/cliente';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }


  Url = 'http://localhost:8080/pruebaSpringBootJava/clientes';
 

  getClientes(){

    return this.http.get<Cliente[]>(this.Url);
  }

  createCliente(cliente:Cliente) {
    return this.http.post<Cliente>(this.Url, cliente);
  }

  getClienteId(nmId:number){
    return this.http.get<Cliente>(this.Url+"/"+nmId);
  }

  updateCliente(cliente:Cliente){
    return this.http.put<Cliente>(this.Url+"/"+cliente.nmid,cliente);
  }

  deleteCliente(cliente:Cliente){
    return this.http.delete<Cliente>(this.Url+"/"+cliente.nmid)
  }

}

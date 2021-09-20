import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgregarComponent } from './clientes/agregar/agregar.component';
import { EditarComponent } from './clientes/editar/editar.component';
import { ListarComponent } from './clientes/listar/listar.component';

const routes: Routes = [
{path: 'listar',component: ListarComponent},
{path: 'agregar',component: AgregarComponent},
{path: 'editar', component: EditarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

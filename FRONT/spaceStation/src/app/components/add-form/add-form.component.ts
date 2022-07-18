import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ApiUseService } from 'src/app/services/api-use.service';
import { Router } from '@angular/router';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-add-form',
  templateUrl: './add-form.component.html',
  styleUrls: ['./add-form.component.scss'],
  providers: [MessageService],
})
export class AddFormComponent implements OnInit {
  // Variables
  buttonDisabled: boolean = false;
  form = this.fb.group({
    nombre: ['', Validators.required],
    pais: ['', Validators.required],
    potencia: ['', Validators.required],
    altura: ['', Validators.required],
    peso: ['', Validators.required],
    idCategoria: ['', Validators.required],
  });

  // Opciones dropdowns
  categories: any[] = [
    {
      label: 'Vehiculos lanzadera',
    },
    {
      label: 'Naves espaciales no tripuladas',
    },
    {
      label: 'Naves espaciales tripuladas',
    },
  ];
  countries: any[] = [
    { label: 'Estados Unidos' },
    { label: 'Japon' },
    { label: 'Alemania' },
    { label: 'Rusia' },
    { label: 'China' },
  ];

  constructor(
    private fb: FormBuilder,
    private api: ApiUseService,
    private messageService: MessageService,
    private router: Router
  ) {}

  ngOnInit(): void {}

  onSubmit() {
    // Cambiar el dato de texto a un numero para que se pueda guardar en la base de datos ya que usamos una foranea tipo int
    if (this.form.value.idCategoria === 'Vehiculos lanzadera') {
      this.form.value.idCategoria = '1';
    } else if (
      this.form.value.idCategoria === 'Naves espaciales no tripuladas'
    ) {
      this.form.value.idCategoria = '2';
    } else {
      this.form.value.idCategoria = '3';
    }

    this.api.postNave(this.form.value).subscribe(() => {
      this.showSuccess();

      this.buttonDisabled = true;
      // Redirigir a home
      setTimeout(() => {
        this.router.navigate(['']);
      }, 1500);
    });

  }
  // Mensaje de exito
  showSuccess() {
    this.messageService.add({
      severity: 'success',
      summary: 'Success',
      detail: 'Nave agregada correctamente',
    });
  }
}

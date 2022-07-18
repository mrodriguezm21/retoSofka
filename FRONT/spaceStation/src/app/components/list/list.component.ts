import { Component, OnInit } from '@angular/core';
import { ApiUseService } from 'src/app/services/api-use.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss'],
})
export class ListComponent implements OnInit {
  constructor(private apiUse: ApiUseService) {}
  naves: any[] = [];

  ngOnInit(): void {
    this.apiUse.getNaves().subscribe((data) => {
      this.naves = data;
    });
  }
}

import { Component, NgModule, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HotelService } from '../app.service';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

@NgModule({
  imports: [
    FormsModule,
    BrowserModule
  ]
})

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.css']
})
export class HotelComponent implements OnInit {

  rooms:Array<any>=[]

  constructor(private router:Router, private hotelService:HotelService) { }

  hotel!: String;
  type!: String;

  roomDetails(event:any){
    event.preventDefault();
    this.hotelService.avlRooms(this.hotel, this.type).subscribe({
      next:(response:any)=>{
        this.rooms=response;
      }
    })
    this.router.navigateByUrl("/room");
  }
  
  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HotelComponent } from '../hotel/hotel.component';


@Component({
  selector: 'app-room-details',
  templateUrl: './room-details.component.html',
  styleUrls: ['./room-details.component.css']
})
export class RoomDetailsComponent implements OnInit {

  rooms!:Array<any>;
  room!: String;

  constructor(private hotelComponent:HotelComponent, private router:Router) { 
    this.rooms=hotelComponent.rooms;
  }

  bookRoom(){
    this.router.navigateByUrl("/booking");
  }


  ngOnInit(): void {
  }

}

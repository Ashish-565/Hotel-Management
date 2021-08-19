import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HotelService } from '../app.service';
import { HotelComponent } from '../hotel/hotel.component';


@Component({
  selector: 'app-room-details',
  templateUrl: './room-details.component.html',
  styleUrls: ['./room-details.component.css'],
  providers: [HotelService]
})
export class RoomDetailsComponent implements OnInit {

  rooms?:Array<any>;
  room!: String;

  constructor(private router:Router, private hotelService:HotelService) { 
  
  }
  
  bookRoom(){
    this.router.navigateByUrl("/booking");
  }



  ngOnInit(): void {
    // this.rooms=this.hotelComponent.rooms;
     this.rooms=this.hotelService.retriveRoomsObject();
    // this.rooms=this.hotelComponent.rooms;
    console.log(this.rooms)
  }

}

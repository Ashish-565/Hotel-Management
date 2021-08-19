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

  constructor(private router:Router) { 
  
  }
  
  bookRoom(){
    this.router.navigateByUrl("/booking");
  }

  avlRoomDetails(rooms:any){
    this.rooms=rooms;
  }

  ngOnInit(): void {
    // this.rooms=this.hotelComponent.rooms;
    
    // console.log(this.hotelComponent.rooms)
  }

}

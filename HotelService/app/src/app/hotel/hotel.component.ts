
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HotelService } from '../app.service';
import { RoomDetailsComponent } from '../room-details/room-details.component';

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.css']
})
export class HotelComponent implements OnInit {

  

  constructor(private router:Router, private hotelService:HotelService, private roomDetailsComponent:RoomDetailsComponent) { }

  public rooms!:Array<any>;
  hotel!: String;
  type!: String;

  roomDetails(){
    this.hotelService.avlRooms(this.hotel, this.type).subscribe({
      next:(response:any)=>{
        this.rooms=response;
        // console.log(this.rooms);
      }
    })
    // console.log(this.rooms);
    this.roomDetailsComponent.avlRoomDetails(this.rooms);
    this.router.navigate(['/room']);
  }
  
  
  ngOnInit(): void {
  }

}

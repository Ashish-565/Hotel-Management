import { Component, OnInit } from '@angular/core';
import { HotelService } from '../app.service';
import {HttpClient} from "@angular/common/http";
import { Router,ActivatedRoute } from '@angular/router';
import { __param } from 'tslib';


@Component({
  selector: 'app-booking-status',
  templateUrl: './booking-status.component.html',
  styleUrls: ['./booking-status.component.css'],
  providers: [HotelService]
})
export class BookingStatusComponent implements OnInit {

  message!: String;
  from_date!: Date;
  to_date!: Date;
  room!: String;

  constructor(private router:Router, private hotelService:HotelService,private  activatedRoute :ActivatedRoute,private httpClient:HttpClient) { 
  }

  book(){
   
  }

  ngOnInit(): void {
    

  }

}

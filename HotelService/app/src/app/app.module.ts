import { NgModule } from '@angular/core';
import { RouterModule,Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HotelComponent } from './hotel/hotel.component';
import { RoomDetailsComponent } from './room-details/room-details.component';
import { BookingStatusComponent } from './booking-status/booking-status.component';

const routes:Routes=[
  {path:'hotel',component:HotelComponent},
  {path:'room',component:RoomDetailsComponent},
  {path:'booking',component:BookingStatusComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HotelComponent,
    RoomDetailsComponent,
    BookingStatusComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

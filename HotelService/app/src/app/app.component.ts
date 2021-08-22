import { Component } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(){}
    email:string;
    password:string;
    form-group:FormGroup;
  ngOnInit(){}
  logInUser() {
    
    if(this.email==="abc@gmail.com" && this.password==="1234"){
      console.log("login successfull");
    }else {
      console.log("login unsuccessfull");
    }
  }
}

  
  
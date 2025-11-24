import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  ngOnInit(): void {
    
  }

gmail = '';
password = '';

createPopupVisible = false;
loginPopupVisible = false;

loginEmail = '';
loginPassword = '';

openCreatePopup(form: any) {
  if (!form.valid) {
    form.controls['username'].markAsTouched();
    return;
  }

  this.createPopupVisible = true;
}

showLoginPopup() {
  this.loginPopupVisible = true;
}

submit() {
  console.log("New account:", this.gmail, this.password);
}

login() {
  console.log("Login with:", this.loginEmail, this.loginPassword);
}

 

}

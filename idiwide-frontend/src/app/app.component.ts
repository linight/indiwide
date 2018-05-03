import {Component, Injectable, NgModule} from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import { BrowserModule }    from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import {HttpModule} from "@angular/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private http: HttpClient){};

  title = 'IndiWide';
  value = '';

  ngOnInit() {
    this.getConfig()
      .subscribe(data => this.value = data['value']);
  }

  getConfig() {
    return this.http.get("http://localhost:8080");
  }


}

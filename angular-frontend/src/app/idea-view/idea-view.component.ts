import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-idea-view',
  templateUrl: './idea-view.component.html',
  styleUrls: ['./idea-view.component.css']
})
export class IdeaViewComponent implements OnInit {

  isLoaded: boolean = true ;

  constructor() { }

  ngOnInit() {
  }

  removeTab() {
    this.isLoaded = false;
  }

}

import { Component, OnInit } from '@angular/core';
import {FormControl, Validators } from '@angular/forms';
import { Observable } from 'rxjs';
import {map, startWith} from 'rxjs/operators';
import { IdeaHamsterService } from '../ideahamster.service';
import { IDomain } from '../domain';
// import { Domain } from 'domain';

// export interface User {
//   name: string;
// }
export interface ISubDomain {
  name: string;
}

@Component({
  selector: 'app-idea-hamster-posting-idea',
  templateUrl: './idea-hamster-posting-idea.component.html',
  styleUrls: ['./idea-hamster-posting-idea.component.css']
})
export class IdeaHamsterPostingIdeaComponent implements OnInit {
  selected='';
  private fieldArray: Array<any> = [];
  private newAttribute: any = {};

  myControl = new FormControl();

  filteredOptions: Observable<IDomain[]>;

  public domains:IDomain[]=[];


 
  constructor(private _ideahamsterservice:IdeaHamsterService) { }

  ngOnInit() {
    this._ideahamsterservice.getDomains()
        .subscribe(data => {
          this.domains = data
          console.log(this.domains);
        });

        this.filteredOptions = this.myControl.valueChanges
        .pipe(
          startWith(''),
          map(value => typeof value === 'string' ? value : value.name),
          map(name => name ? this._filter(name) : this.domains.slice())
        );
      }

      displayFn(domain?: IDomain): string | undefined {
        return domain ? domain.name : undefined;
      }
    

      private _filter(name: string): IDomain[] {
        const filterValue = name.toLowerCase();    
        return this.domains.filter(option => option.name.toLowerCase().indexOf(filterValue) === 0);
      }
  

      addFieldValue() {
        this.fieldArray.push(this.newAttribute)
        this.newAttribute = {};
    }

    deleteFieldValue(index) {
        this.fieldArray.splice(index, 1);
    }

}

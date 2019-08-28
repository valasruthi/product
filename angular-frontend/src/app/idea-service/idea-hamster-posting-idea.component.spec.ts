import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IdeaHamsterPostingIdeaComponent } from './idea-hamster-posting-idea.component';

describe('IdeaHamsterPostingIdeaComponent', () => {
  let component: IdeaHamsterPostingIdeaComponent;
  let fixture: ComponentFixture<IdeaHamsterPostingIdeaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IdeaHamsterPostingIdeaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IdeaHamsterPostingIdeaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

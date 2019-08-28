import { MatFormFieldDefaultOptions } from '@angular/material/form-field';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { HomepageComponent } from './homepage/homepage.component';
import {SocialLoginModule,AuthServiceConfig, GoogleLoginProvider} from "angularx-social-login";
import { SignupComponent } from './signup/signup.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ServiceProviderProfileComponent } from './service-provider-profile/service-provider-profile.component';
import {MatCardModule} from '@angular/material';
import {MatOptionModule} from '@angular/material';
import {MatDialogModule} from '@angular/material/dialog';
import { IdeaHamsterPostingIdeaComponent } from './idea-service/idea-hamster-posting-idea.component';
import {MatFormFieldModule,MatInputModule,MatAutocompleteModule,MatSelectModule} from '@angular/material';
import { IdeaHamsterService } from './ideahamster.service';

const config = new AuthServiceConfig([


  {
    id: GoogleLoginProvider.PROVIDER_ID,
    provider: new GoogleLoginProvider(
      '1078204311210-1h012vmgmrncursd4tk1jtsgcn7u7s7m.apps.googleusercontent.com'
    )
  }
]);

export function provideConfig() {
  return config;
}

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomepageComponent,
    SignupComponent,
    ServiceProviderProfileComponent,
    IdeaHamsterPostingIdeaComponent,
    // IdeaHamsterService
   

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    SocialLoginModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatCardModule,
    ReactiveFormsModule,
    MatOptionModule,
    MatSelectModule,
    MatDialogModule,
    MatInputModule,
    MatAutocompleteModule,
    ReactiveFormsModule,
    MatSelectModule,
    HttpClientModule
     ],

  providers: [
    {
      provide: AuthServiceConfig,
      useFactory: provideConfig
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}

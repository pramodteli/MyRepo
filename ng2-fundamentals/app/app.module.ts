import { NgModule} 
from '@angular/core'

import { BrowserModule } 
from '@angular/platform-browser'

import {EventsAppComponent} 
from './events-app-component'

import {ProductListComponent}
from './product/product-list.component'
import { ProductService } from './product/product.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
imports: [BrowserModule, HttpClientModule],
declarations: [EventsAppComponent, ProductListComponent],
bootstrap: [EventsAppComponent, ProductListComponent],
providers: [ProductService]
})

export class AppModule{
}
import {Component, OnInit} from '@angular/core';
import {IProduct} from './product';
import { ProductService } from './product.service';

@Component({
    moduleId: module.id,
    selector: 'pm-products',
    templateUrl: './product-list.component.html'
})

export class ProductListComponent implements OnInit{
    errorMessage: any;
    filteredProducts: IProduct[];

    pageTitle: string = 'Product List';

    products: IProduct[];

    constructor(private _productService:ProductService){};

    ngOnInit(){

        this._productService.getProducts().subscribe(

            products => {
                this.products = products;
                this.filteredProducts = this.products;
            },
            error => this.errorMessage = <any>error);
    }
}
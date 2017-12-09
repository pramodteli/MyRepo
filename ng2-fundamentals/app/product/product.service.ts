import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';
import {IProduct} from './product';

@Injectable()
export class ProductService{

    private _productUrl = 'http://localhost:8080/api/v1/productList';

    constructor(private _http:HttpClient){};
    
    getProducts(): Observable<IProduct[]>{
        return this._http.get<IProduct[]>(this._productUrl)
        .do(data => console.log('All : ' + JSON.stringify(data)))
        .catch(this.handleError);
    }

    private handleError(err: HttpErrorResponse){
        console.error(err.message);
        return Observable.throw(err.message);
    }
}
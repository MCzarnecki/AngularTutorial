import { Component } from '@angular/core';
import { Product } from "app/product/product";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {

  name: string;
  desc: string;
  products: Product[] = new Array();

  add = (): void => {
    this.products.push(new Product(this.name, this.desc));
    this.name = "";
    this.desc = "";
  }

  remove = (index) : void => {
    this.products.splice(index, 1);
  }

}

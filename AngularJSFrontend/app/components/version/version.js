'use strict';

var productService = angular.module('myApp.version', ['ngResource']);

productService.factory('Products', function ($resource) {
    return $resource('http://localhost:8080/PetSupplies2-1.0-SNAPSHOT/rs/products', {}, {
        findAll: {method: 'GET', isArray: true}
    });
});

productService.factory('Product', function ($resource) {
    return{
        getProduct: function (id) {
            return $resource('http://localhost:8080/PetSupplies2-1.0-SNAPSHOT/rs/products/:productno').get(
                    {
                        productno: id
                    }
            );
        }
    };
});
//productService.factory('Categories', function ($resource) {
//    return{
//        getCat: function (id) {
//            return $resource('http://localhost:8080/PetSupplies2-1.0-SNAPSHOT/rs/productcategories/:catno').get(
//                    {
//                        catno: id
//                    }
//            );
//        }
//    };
//});
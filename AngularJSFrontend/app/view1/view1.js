'use strict';

angular.module('myApp.view1', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/view1', {
                    templateUrl: 'view1/view1.html',
                    controller: 'View1Ctrl'
                });
            }])

        .controller('View1Ctrl', function ($scope, Products/*, Categories*/) {
            $scope.allProducts = Products.findAll();
            $scope.showDetails = function (product) {
                $scope.selectedProduct = product;
//        $scope.selectedCategory = Categories.getCat(product.catno);
            }
        });
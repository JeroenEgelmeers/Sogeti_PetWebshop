'use strict';

angular.module('myApp.assortiment', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/assortiment', {
                    templateUrl: 'assortiment/assortiment.html',
                    controller: 'AssortimentController'
                });
            }])

        .controller('AssortimentController', function ($scope, Products/*, Categories*/) {
            $scope.allProducts = Products.findAll();
            $scope.showDetails = function (product) {
                $scope.selectedProduct = product;
//        $scope.selectedCategory = Categories.getCat(product.catno);
            }
            $scope.gotoProduct = function(product){
                $scope.selectedProduct = product;
            }
        });
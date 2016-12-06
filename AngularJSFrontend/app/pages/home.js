'use strict';

angular.module('myApp.home', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/home', {
                    templateUrl: 'pages/home.html',
                    controller: 'HomeController'
                });
            }])

        .controller('HomeController', function ($scope, Products/*, Categories*/) {
            $scope.allProducts = Products.findAll();
            $scope.showDetails = function (product) {
                $scope.selectedProduct = product;
            }
        });
'use strict';
angular.module('myApp.product', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider
//                        .when('/product', {
//                            templateUrl: 'pages/product.html',
//                            controller: 'ProductController'
//                        })
                        .when('/product/:Id', {
                            templateUrl: 'pages/product.html',
                            controller: 'ProductController'
                        });
            }])

        .controller('ProductController', ['$scope', '$routeParams', 'Product',
            function ($scope, $routeParams, Product) {
                var currentId = $routeParams.Id;
                $scope.product = Product.getProduct(currentId);
            }]);
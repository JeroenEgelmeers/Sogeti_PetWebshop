'use strict';

// Declare app level module which depends on views, and components
var webshopApp = angular.module('myApp', [
  'ngRoute',
  'myApp.assortiment',
  'myApp.view2',
  'myApp.version',
  'myApp.contact',
  'myApp.home',
  'myApp.cart',
  'myApp.product'
]).
config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix('!');

  $routeProvider.otherwise({redirectTo: '/assortiment'});
}]);

//controllers
webshopApp
    .controller('MainController', ['$scope', '$location', function($scope) {
        this.pageTitle = "PetSupplies";
        this.pageDescription = "Alle benodigheden rondom uw huisdier.";
    }])
    .controller('MenuController', ['$scope', '$location', function($scope, $location) {
        this.location = $location;
    }])
    .controller('CartController', ['$scope', function($scope) {
        this.items = [{name: "Food1"}, {name:"Food2"}];
    }]);

//directives
webshopApp
    .directive("headerSliderDirective", function() {
        return {
            scope: {},
            link: function(scope) {
                scope.title = "Verras uw huisdier!";
            },
            templateUrl: 'directives/header/slider.html',
        };
    })
    .directive("headerGaranteesDirective", function() {
        return {
            scope: {},
        };
    })
    .directive("cartIconDirective", function() {
        return {
            scope: {},
            templateUrl: 'directives/cart/icon.html',
        };
    })
//    .directive("productBoxDirective", function() {
//        return {
//            scope: {},
//            templateUrl: 'directives/products/product_box.html',
//        };
//    })
    ;

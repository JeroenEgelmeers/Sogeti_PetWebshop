'use strict';

angular.module('myApp.cart', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/cart', {
    templateUrl: 'pages/cart.html',
    controller: 'CartController'
  });
}])

.controller('CartController', [function() {

}]);
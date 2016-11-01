/**
 * Created by jegelmee on 27-10-2016.
 */
var webshopApp = angular.module('webshopApp',  ["ngRoute"]);

// Controllers
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

// Directives
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
    .directive("productBoxDirective", function() {
        return {
            scope: {},
            templateUrl: 'directives/products/product_box.html',
        };
    });
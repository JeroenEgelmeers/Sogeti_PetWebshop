/**
 * Created by jegelmee on 27-10-2016.
 */

var webshopApp = angular.module('webshopApp', []);

// Add controllers
webshopApp
    .controller('mainController', ['$scope', function($scope) {
        $scope.pageTitle = "PetSupplies";
    }])
    .controller('cartController', ['$scope', function($scope) {
        $scope.items = [{name: "Food1"}, {name:"Food2"}];
    }])
    .directive("headerTopDirective", function() {
        return {
            scope: {},
            templateUrl: 'directives/header/top.html',
        };
    })
    .directive("headerSliderDirective", function() {
        return {
            scope: {},
            templateUrl: 'directives/header/slider.html',
        };
    })
    .directive("headerGaranteesDirective", function() {
        return {
            scope: {},
        };
    })
    .directive("contentDirective", function() {
        return {
            scope: {},
            templateUrl: 'directives/pages/home.html',
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
    })
    .directive("footerDirective", function() {
        return {
            link: function(scope) { scope.companyName = "PetSupplies" },
            scope: {},
            templateUrl: 'directives/footer/footer.html',
        };
    })
;
/**
 * Created by JEGELMEE on 31-10-2016.
 */
// Router
angular.module('webshopApp')
    .config(function($routeProvider) {
        $routeProvider
            .when("/", {
                redirectTo: '/home'
            })
            .when("/home", {
                templateUrl : "pages/home.html",
                controller: "MainController",
            })
            .when("/assortiment", {
                templateUrl : "pages/assortiment.html",
                controller: "MainController",
            })
            .when("/contact", {
                templateUrl : "pages/contact.html",
                controller: "MainController",
            })
            .when("/cart", {
                templateUrl : "pages/cart.html",
                controller: "MainController",
            });
    });
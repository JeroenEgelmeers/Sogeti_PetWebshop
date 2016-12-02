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
            })
            .when("/assortiment", {
                templateUrl : "pages/assortiment.html",
            })
            .when("/contact", {
                templateUrl : "pages/contact.html",
            })
            .when("/cart", {
                templateUrl : "pages/cart.html",
                controller: "MainController",
            });
    });
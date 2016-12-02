/**
 * Created by JEGELMEE on 3-11-2016.
 */

angular.module('webshopApp').directive("productBoxDirective", function() {
    return {
        scope: {
            productTitle: '@'
        },
        templateUrl: 'directives/products/product_box.html',
    };
});
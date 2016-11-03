/**
 * Created by JEGELMEE on 3-11-2016.
 */

angular.module('webshopApp').controller('CartController', CartController);

function CartController($scope, $location) {
    var vm = this;
    vm.items = [{name: "Food1"}, {name:"Food2"}];
}
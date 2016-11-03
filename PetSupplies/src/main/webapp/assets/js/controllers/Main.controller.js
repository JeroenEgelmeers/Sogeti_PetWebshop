/**
 * Created by JEGELMEE on 3-11-2016.
 */

angular.module('webshopApp').controller('MainController', MainController);

function MainController($scope, $location) {
    var vm = this;
    vm.pageTitle = "PetSupplies";
    vm.pageDescription = "Alle benodigheden rondom uw huisdier.";
}
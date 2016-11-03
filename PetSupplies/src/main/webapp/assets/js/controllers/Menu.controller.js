/**
 * Created by JEGELMEE on 3-11-2016.
 */

angular.module('webshopApp').controller('MenuController', MenuController);

function MenuController($scope, $location) {
    var vm = this;
    vm.location = $location;
}
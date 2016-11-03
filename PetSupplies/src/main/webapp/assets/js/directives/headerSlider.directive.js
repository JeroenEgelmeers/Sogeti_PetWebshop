/**
 * Created by JEGELMEE on 3-11-2016.
 */

angular.module('webshopApp').directive("headerSliderDirective", function() {
    return {
        scope: {},
        link: function(scope) {
            scope.title = "Verras uw huisdier!";
        },
        templateUrl: 'directives/header/slider.html',
    };
});

/**
 * Created by JEGELMEE on 3-11-2016.
 */

angular.module('webshopApp').directive("headerSliderDirective", function() {
    return {
        scope: { sliderTitle: '@' },
        templateUrl: 'directives/header/slider.html',
    };
});

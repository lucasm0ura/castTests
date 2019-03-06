(function () {
    'use strict';

	 var myApp = angular.module('myApp', []);
      myApp.controller('PessoaCtrl', function($scope, $http){


      	$scope.onLoad = function(){
		    $http.get('http://localhost:8080/api/pessoas')
		        .then(function successCallback(response) {
		            $scope.pessoas = response.data;
		        }, function errorCallback(response) {
		        	alert("Não existem dados cadastrados");
		            console.log(response);
	        });

      	}

      	$scope.onLoad();

	        $scope.delete = function(id) {

	            $http.delete('http://localhost:8080/api/pessoa/'+id)
	                .then(function successCallback(response) {
	                    
	                }, function errorCallback(response) {
	                	if(response.data.success){
	                		alert('Deletado com sucesso');
	                		$scope.onLoad();
	                	}else{
	                		alert('Não foi possível deletar');	
	                	}
	                   	
	                });
	        };


      });

      myApp.directive('ngConfirmClick', [
        function(){
            return {
                link: function (scope, element, attr) {
                    var msg = "Are you sure?";
                    var clickAction = attr.confirmedClick;
                    element.bind('click',function (event) {
                        if ( window.confirm(msg) ) {
                            scope.$eval(clickAction)
                        }
                    });
                }
            };
    }])

})();
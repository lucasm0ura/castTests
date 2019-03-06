(function () {
    'use strict';

	 var myAppForm = angular.module('myAppForm', []);

      myAppForm.controller('PessoaFormCtrl', function($scope, $http){

      	$scope.pessoa = {};
      	$scope.disabled = false;
      	$scope.id = "";

      	if(window.location.search){
      		$scope.id = window.location.search.substring(4);
		    $http.get('http://localhost:8080/api/pessoa/'+"" +$scope.id)
		        .then(function successCallback(response) {
		            $scope.pessoa = response.data;
		        }, function errorCallback(response) {
		        	alert("Houve um problema ao carregar os dados");
	        });      		
      	}

      	$scope.save = function(){

      		if(window.location.search){

			    $http.put('http://localhost:8080/api/pessoa/', $scope.pessoa)
			        .then(function successCallback(response) {
			        	alert('Atualizado com sucesso!');
			        	$scope.disabled = true;
			        }, function errorCallback(response) {
			        	alert("Não foi possível cadastrar.");
		        }); 

      		}else{
			    $http.post('http://localhost:8080/api/pessoa/', $scope.pessoa)
			        .then(function successCallback(response) {
			        	alert('Cadastro efetuado com sucesso!');
			        	$scope.disabled = true;
			        }, function errorCallback(response) {
			        	alert("Não foi possível cadastrar.");
		        });         			
      		}

   		
      	}

      });

})();
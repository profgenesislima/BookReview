/**
 * Category Controller
 */
angular.module('bookreview').controller('CategoryController', function($scope, $http){
	
	$scope.category = {}
	$scope.mensagem = ''
	$scope.categories = [];

 	

	$http.get('/api/v1/categories').success(function(categories){
		$scope.categories = categories;
		console.log("CATEGORIES "+JSON.stringify($scope.categories));
		
	}).error(function(erro){
		console.log(erro)
	}) 	

	

	
	

	

	
});


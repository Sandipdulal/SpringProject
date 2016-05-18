(function() {
	var app = angular.module('dormApp', []);
	app.controller('DormController', ['$http',function($http) {
		var self = this; // store the reference
		//get all maintenances
		this.getAll = function(){
			$http.get(
			'http://localhost:8080/dormmanagement/api/maintenance/all')
				.success(function(data) {
					self.maintenances = data;
			});
		};this.getAll(); // Need this on body load
		
		this.getRooms = function() {
			$http.get('http://localhost:8080/dormmanagement/api/room/all').success(function(data) {
				self.rooms = data;
			});
		};this.getRooms();
		
		this.getBuildings = function() {
			$http.get('http://localhost:8080/dormmanagement/api/building/all').success(function(data) {
				self.buildings = data;
			});
		};this.getBuildings();
		
		this.remove = function(id){
			$http.delete(
				'http://localhost:8080/dormmanagement/api/maintenance/delete/'+id)
			.success(function(){
				self.getAll();
			});				
		};
		
		this.removeBuilding = function(id){
			$http.delete(
				'http://localhost:8080/dormmanagement/api/building/delete/'+id)
			.success(function(){
				self.getBuildings();
			});				
		};
		
		this.removeRoom = function(id){
			$http.delete(
				'http://localhost:8080/dormmanagement/api/room/delete/'+id)
			.success(function(){
				self.getRooms();
			});				
		};
		
		//Get Check In Items by Student Id
		
		this.getCheckInItems = function(id){
			$http.get(
			'http://localhost:8080/dormmanagement/api/form/'+id)
				.success(function(data) {
					self.checkInItems = data;
			});
		};this.getCheckInItems(1);
		
		
		
	}]);

})();
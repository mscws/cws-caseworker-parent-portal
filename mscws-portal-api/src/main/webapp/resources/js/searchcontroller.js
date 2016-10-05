/**
 * 
 */
var app = angular.module('SearchModule', [ 'ui.bootstrap' ]);
app.service('DataService', function() {
	var _dataObj = {
		searchCriteria : {},
		provider : []
	};
	return {
		setCriteria : function(criteria) {
			_dataObj.searchCriteria = criteria;
		},
		getCriteria : function() {
			return _dataObj.searchCriteria;
		},

		setProviders : function(providers) {
			_dataObj.provider = providers;
		},
		getProviders : function() {
			return _dataObj.provider;
		}
	};
});
app
		.controller(
				'SearchController',
				[
						'$scope',
						'$http',
						'$location',
						'DataService',
						function($scope, $http, $location, DataService) {
							$scope.criteria = DataService.getCriteria();
							$scope.providers = DataService.getProviders();
							if ($location.path() == "/"
									|| $location.path() == "/providerSearch"
									|| $location.path() == "/search") {
								var baseUrl = '../api/rest/metadata/';
								$http.get(baseUrl + 'county').success(
										function(data) {
											$scope.countys = data;
										});
								$http.get(baseUrl + 'providertypes').success(
										function(data) {
											$scope.providerTypes = data;
										});
								$http.get(baseUrl + 'cities').success(
										function(data) {
											$scope.cities = data;
										});

								$http
										.get(
												'../api/rest/metadata/qualityratings')
										.success(function(data) {
											$scope.qualityRatings = data;
										});
							}

							$scope.reset = function() {
								$scope.criteria = {};
								$scope.error = false;
							}

							$scope.search1 = function(searchCriteria) {
								var datas = {
									'ratingId' : !angular
											.isUndefined(searchCriteria.ratingId) ? searchCriteria.ratingId.qualityRating
											: "",
									'cityId' : !angular
											.isUndefined(searchCriteria.cityId) ? searchCriteria.cityId.id
											: "",
									'providerName' : !angular
											.isUndefined(searchCriteria.providerName) ? searchCriteria.providerName
											: "",
									'providerTypeId' : !angular
											.isUndefined(searchCriteria.providerTypeId) ? searchCriteria.providerTypeId.providerType
											: "",
									'countyId' : !angular
											.isUndefined(searchCriteria.countyId) ? searchCriteria.countyId.countyNumber
											: ""
								};
								var url = "../api/rest/providers/search";
								var params = "";
								if (!angular
										.isUndefined(searchCriteria.countyId)) {
									if (params == "")
										params = params
												+ "county="
												+ searchCriteria.countyId.countyNumber;
									else
										params = params
												+ "&county="
												+ searchCriteria.countyId.countyNumber;
								}
								if (!angular.isUndefined(searchCriteria.cityId)) {
									if (params == "")
										params = params + "city="
												+ searchCriteria.cityId.id;
									else
										params = params + "&city="
												+ searchCriteria.cityId.id;
								}
								if (!angular
										.isUndefined(searchCriteria.providerName)) {
									if (params == "")
										params = params + "providerName="
												+ searchCriteria.providerName;
									else
										params = params + "&providerName="
												+ searchCriteria.providerName;

								}
								if (!angular
										.isUndefined(searchCriteria.ratingId)) {
									if (params == "")
										params = params
												+ "rating="
												+ searchCriteria.ratingId.qualityRating;
									else
										params = params
												+ "&rating="
												+ searchCriteria.ratingId.qualityRating;
								}
								if (!angular
										.isUndefined(searchCriteria.providerTypeId)) {
									if (params == "")
										params = params
												+ "providerType="
												+ searchCriteria.providerTypeId.providerType;
									else
										params = params
												+ "&providerType="
												+ searchCriteria.providerTypeId.providerType;
								}

								if (params != "") {

								} else {
									$scope.error = "true";
									return;
								}
								$http
										.post(url, datas)
										.success(
												function(data, status) {
													$scope.providers = data;
													DataService
															.setProviders($scope.providers);
													$location
															.path("/providerSearch");
												});
							}

						} ]);

app
		.controller(
				'ResultsController',
				[
						'$scope',
						'$http',
						'$location',
						'$filter',
						'$modal',
						'DataService',
						function($scope, $http, $location, $filter, $modal,
								DataService) {
							$scope.providers = DataService.getProviders();
							$scope.searchCriteria = DataService.getCriteria();
							$scope.tableVisible = true;
							$scope.availableResults = false;
							$scope.filteredProviders = [],
									$scope.currentPage = 1,
									$scope.numPerPage = 10, $scope.maxSize = 5;
							$scope.error = false;
							$scope.mapToggle = true;
							$scope.listToggle = false;
							if ($location.path() == "/"
									|| $location.path() == "/providerSearch"
									|| $location.path() == "/search") {
								var baseUrl = '../api/rest/metadata/';
								$http.get(baseUrl + 'county').success(
										function(data) {
											$scope.countys = data;
										});
								$http.get(baseUrl + 'providertypes').success(
										function(data) {
											$scope.providerTypes = data;
										});
								$http.get(baseUrl + 'cities').success(
										function(data) {
											$scope.cities = data;
										});

								$http
										.get(
												'../api/rest/metadata/qualityratings')
										.success(function(data) {
											$scope.qualityRatings = data;
										});
							}
							if ($scope.searchCriteria.viewMode == 'Map') {
								$scope.mapToggle = false;
								$scope.listToggle = true;
							}
							if ($scope.providers.length > 0) {
								$scope.availableResults = true;
								$scope
										.$watch(
												'currentPage + numPerPage',
												function() {
													var begin = (($scope.currentPage - 1) * $scope.numPerPage), end = begin
															+ $scope.numPerPage;
													$scope.filteredProviders = $scope.providers
															.slice(begin, end);
												});
							}
							$scope.search = function() {
								if ($scope.providers.length > 0) {
									$scope.providers = [];
									$scope.filteredProviders = [];
								}
								var datas = $scope.searchCriteria;
								var url = "../api/rest/providers/find";
								var params = "";
								if (!angular
										.isUndefined($scope.searchCriteria.countyId)) {
									if (params == "")
										params = params
												+ "county="
												+ $scope.searchCriteria.countyId.countyNumber;
									else
										params = params
												+ "&county="
												+ $scope.searchCriteria.countyId.countyNumber;
								}
								if (!angular
										.isUndefined($scope.searchCriteria.cityId)) {
									if (params == "")
										params = params
												+ "city="
												+ $scope.searchCriteria.cityId.id;
									else
										params = params
												+ "&city="
												+ $scope.searchCriteria.cityId.id;
								}
								if (!angular
										.isUndefined($scope.searchCriteria.providerName)) {
									if (params == "")
										params = params
												+ "providerName="
												+ $scope.searchCriteria.providerName;
									else
										params = params
												+ "&providerName="
												+ $scope.searchCriteria.providerName;

								}
								if (!angular
										.isUndefined($scope.searchCriteria.ratingId)) {
									if (params == "")
										params = params
												+ "rating="
												+ $scope.searchCriteria.ratingId.qualityRating;
									else
										params = params
												+ "&rating="
												+ $scope.searchCriteria.ratingId.qualityRating;
								}
								if (!angular
										.isUndefined($scope.searchCriteria.providerTypeId)) {
									if (params == "")
										params = params
												+ "providerType="
												+ $scope.searchCriteria.providerTypeId.providerType;
									else
										params = params
												+ "&providerType="
												+ $scope.searchCriteria.providerTypeId.providerType;
								}

								if (params != "") {
									url = url + "?" + params;
								} else {
									$scope.error = "true";
									return;
								}
								$http
										.get(url, datas)
										.success(
												function(data, status) {
													$scope.providers = data;
													$scope.tableVisible = true;
													if ($scope.providers.length > 0) {

														$scope
																.$watch(
																		'currentPage + numPerPage',
																		function() {
																			var begin = (($scope.currentPage - 1) * $scope.numPerPage), end = begin
																					+ $scope.numPerPage;
																			$scope.filteredProviders = $scope.providers
																					.slice(
																							begin,
																							end);
																		});
													}

												});
							}

							$scope.reset = function() {
								$scope.searchCriteria = {};
								$scope.tableVisible = false;
								$scope.providers = [];
								$scope.filteredProviders = [];
								$scope.error = false;
								$scope.license = "";
								$scope.providerType = "";
								$scope.rating = "";
							}
							$scope.showTable = function() {
								return tableVisible;
							}

							$scope.mapViewFunc = function() {
								$scope.mapToggle = !$scope.mapToggle;
								$scope.listToggle = !$scope.listToggle;
							}
							$scope.listViewFunc = function() {
								$scope.listToggle = !$scope.listToggle;
								$scope.mapToggle = !$scope.mapToggle;
							}
							$scope.clearFilters = function() {
								$scope.license = "";
								$scope.providerType = "";
								$scope.rating = "";						
							}
							angular.module('ngMap').run(
									function($rootScope) {
										$rootScope.$on('mapInitialized',
												function(evt, map) {
													$rootScope.mymap = map;
													$rootScope.$apply();
												});

									});

							$scope.open = function(provider) {
								var modalInstance = $modal.open({
									templateUrl : 'providerDetails.html',
									controller : ModalInstanceCtrl,
									resolve : {
										provider : function() {
											return provider;
										}
									}
								});
							}

							var ModalInstanceCtrl = function($scope,
									$modalInstance, provider) {
								$scope.provider = provider;
								$scope.cancel = function() {
									$modalInstance.dismiss('cancel');
								};
							};

						} ]);

app.filter('licenseFilter', [ function() {
	return function(data, license, status) {
		var output = []; // store result in this
		if (!angular.isUndefined(license) && license != "") {
			for (var i = 0; i < data.length; i++) {
				if (angular.equals(data[i].licenseType, license)) {
					output.push(data[i]);
				}
			}
		} else {
			output = data;
		}
		return output; // finally return the result
	}
} ]);

app.filter('ptFilter', [ function() {
	return function(data, providerType, status) {
		var output = []; // store result in this
			if (!angular.isUndefined(providerType) && providerType != "") {
			for (var i = 0; i < data.length; i++) {
				if (angular.equals(data[i].providerType, providerType)) {
					output.push(data[i]);
				}
			}
		} else {
			output = data;
		}
		return output; // finally return the result
	}
} ]);

app.filter('ratingFilter', [ function() {
	return function(data, rating, status) {
		var output = []; // store result in this
		if (!angular.isUndefined(rating) && rating != "") {
			for (var i = 0; i < data.length; i++) {
				if (angular.equals(data[i].qualityRating, rating)) {
					output.push(data[i]);
				}
			}
		} else {
			output = data;
		}
		return output; // finally return the result
	}
} ]);
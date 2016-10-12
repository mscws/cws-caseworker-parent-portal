/** 
 * <p>Title: SearchController </p>
 * <p>Description: This class exposes methods for basic and advance search rest services which 
 *  can be consumed by the front end</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Unisys</p>
 *
 * @author Kulkarnk
 */
package com.unisys.cws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unisys.cws.dao.ISearchDAO;
import com.unisys.cws.domain.Providers;
import com.unisys.cws.util.SearchCriteria;

@RestController
@RequestMapping(path = "/api/rest/providers")
public class SearchController {

	@Autowired
	ISearchDAO searchDao;

	/**
	 * @param providerName Variable of type String
	 * @param county  Variable of type Long
	 * @param providertype  Variable of type Long
	 * @param city  Variable of type Long
	 * @param rating Variable of type Long
	 * @return List of providers which full fill the search parameters,otherwise
	 *         return empty list
	 */
	@RequestMapping(path = "/find", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<Providers> findProvidersByCriteria(
			@RequestParam(value = "providerName", required = false) String providerName,
			@RequestParam(value = "county", required = false) Long county,
			@RequestParam(value = "providerType", required = false) Long providertype,
			@RequestParam(value = "city", required = false) Long city,
			@RequestParam(value = "rating", required = false) Long rating) {
		SearchCriteria searchCriteria = new SearchCriteria(providerName, county, providertype, city, rating);
		return searchDao.findProvidersByCriteria(searchCriteria);
	}

	/**
	 * @param searchCriteria contains user search values
	 * @return  List of providers which full fill the search criteria,otherwise
	 *         return empty list
	 */
	@RequestMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Providers> findProvidersByCriteria(@RequestBody SearchCriteria searchCriteria) {
		return searchDao.findProvidersByCriteria(searchCriteria);
	}
}

/** 
 * <p>Title: MetadataController </p>
 * <p>Description: This class provides meta data methods for front ends to consume using
 * rest services   </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Unisys</p>
 *
 * @author Kulkarnk
 */

package com.unisys.cws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unisys.cws.dao.IMetadataDAO;
import com.unisys.cws.domain.City;
import com.unisys.cws.domain.County;
import com.unisys.cws.domain.ProviderType;
import com.unisys.cws.domain.QualityRating;

@RestController
@RequestMapping(path = "/api/rest/metadata")
public class MetadataController {

	@Autowired
	private IMetadataDAO metadataDao; 
	
	/** 
	 * @return List of counties
	 */
	@RequestMapping(path = "/county",produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<County> getCountys(){
		return metadataDao.getAllCountys();
	}
	
	/**
	 * @return List of all the available provider types  
	 */
	@RequestMapping(path = "/providertypes",produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<ProviderType> getProviderTypes(){
		return metadataDao.getAllProviderTypes();
	}
	
	/**
	 * @return List of all the available Quality Star Ratings
	 *
	 */
	@RequestMapping(path = "/qualityratings",produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<QualityRating> getQualityRatings(){
		return metadataDao.getAllRatings();
	}
	
	 
	/**
	 * @param id contains selected county id
	 * @return List of all the available Cities for a county , otherwise a empty list
	 */
	@RequestMapping(path = "/city/{countyId}",produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<City> getCitiesByCountyId(Long id){
		return metadataDao.getCitiesByCountyId(id);
	}
	
	/**
	 * @return List of all the available Cities
	 */
	@RequestMapping(path = "/cities",produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<City> getCities(){
		return metadataDao.getCities();
	}
}

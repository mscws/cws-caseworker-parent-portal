/** 
 * <p>Title: IMetadataDAO </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Unisys</p>
 *
 * @author Kulkarnk
 */

package com.unisys.cws.dao;

import java.util.List;

import com.unisys.cws.domain.City;
import com.unisys.cws.domain.County;
import com.unisys.cws.domain.ProviderType;
import com.unisys.cws.domain.QualityRating;

public interface IMetadataDAO {
	
	public List<County> getAllCountys();

	public List<ProviderType> getAllProviderTypes();

	public List<QualityRating> getAllRatings();
	
	public List<City> getCitiesByCountyId(Long id);

	public List<City> getCities();
}

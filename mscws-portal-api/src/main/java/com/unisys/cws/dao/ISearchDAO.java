/** 
 * <p>Title: ISearchDAO </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Unisys</p>
 *
 * @author Kulkarnk
 */
package com.unisys.cws.dao;

import java.util.List;

import com.unisys.cws.domain.Providers;
import com.unisys.cws.util.SearchCriteria;

public interface ISearchDAO {
	public List<Providers> findProvidersByCriteria(SearchCriteria searchCriteria);
}

/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.meera.jersey.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.meera.jersey.services.model.Person;

/**
 * The persistence interface for the person service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link PersonUtil} to access the person persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author meera
 * @see PersonPersistenceImpl
 * @see PersonUtil
 * @generated
 */
public interface PersonPersistence extends BasePersistence<Person> {
	/**
	* Caches the person in the entity cache if it is enabled.
	*
	* @param person the person to cache
	*/
	public void cacheResult(com.meera.jersey.services.model.Person person);

	/**
	* Caches the persons in the entity cache if it is enabled.
	*
	* @param persons the persons to cache
	*/
	public void cacheResult(
		java.util.List<com.meera.jersey.services.model.Person> persons);

	/**
	* Creates a new person with the primary key. Does not add the person to the database.
	*
	* @param personId the primary key for the new person
	* @return the new person
	*/
	public com.meera.jersey.services.model.Person create(long personId);

	/**
	* Removes the person with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param personId the primary key of the person to remove
	* @return the person that was removed
	* @throws com.meera.jersey.services.NoSuchPersonException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.jersey.services.model.Person remove(long personId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.jersey.services.NoSuchPersonException;

	public com.meera.jersey.services.model.Person updateImpl(
		com.meera.jersey.services.model.Person person, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the person with the primary key or throws a {@link com.meera.jersey.services.NoSuchPersonException} if it could not be found.
	*
	* @param personId the primary key of the person to find
	* @return the person
	* @throws com.meera.jersey.services.NoSuchPersonException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.jersey.services.model.Person findByPrimaryKey(
		long personId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.jersey.services.NoSuchPersonException;

	/**
	* Finds the person with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param personId the primary key of the person to find
	* @return the person, or <code>null</code> if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.jersey.services.model.Person fetchByPrimaryKey(
		long personId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the persons.
	*
	* @return the persons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.jersey.services.model.Person> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the persons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of persons to return
	* @param end the upper bound of the range of persons to return (not inclusive)
	* @return the range of persons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.jersey.services.model.Person> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the persons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of persons to return
	* @param end the upper bound of the range of persons to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of persons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.jersey.services.model.Person> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the persons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the persons.
	*
	* @return the number of persons
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
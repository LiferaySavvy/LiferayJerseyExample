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

package com.meera.jersey.services.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Person service. Represents a row in the &quot;meera_Person&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.meera.jersey.services.model.impl.PersonModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.meera.jersey.services.model.impl.PersonImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a person model instance should use the {@link Person} interface instead.
 * </p>
 *
 * @author meera
 * @see Person
 * @see com.meera.jersey.services.model.impl.PersonImpl
 * @see com.meera.jersey.services.model.impl.PersonModelImpl
 * @generated
 */
public interface PersonModel extends BaseModel<Person> {
	/**
	 * Gets the primary key of this person.
	 *
	 * @return the primary key of this person
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this person
	 *
	 * @param pk the primary key of this person
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the person id of this person.
	 *
	 * @return the person id of this person
	 */
	public long getPersonId();

	/**
	 * Sets the person id of this person.
	 *
	 * @param personId the person id of this person
	 */
	public void setPersonId(long personId);

	/**
	 * Gets the person name of this person.
	 *
	 * @return the person name of this person
	 */
	@AutoEscape
	public String getPersonName();

	/**
	 * Sets the person name of this person.
	 *
	 * @param personName the person name of this person
	 */
	public void setPersonName(String personName);

	/**
	 * Gets the person address of this person.
	 *
	 * @return the person address of this person
	 */
	@AutoEscape
	public String getPersonAddress();

	/**
	 * Sets the person address of this person.
	 *
	 * @param personAddress the person address of this person
	 */
	public void setPersonAddress(String personAddress);

	/**
	 * Gets a copy of this person as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public Person toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Person person);

	public int hashCode();

	public String toString();

	public String toXmlString();
}
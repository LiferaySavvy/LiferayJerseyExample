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

package com.meera.jersey.services.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.meera.jersey.services.model.Person;
import com.meera.jersey.services.model.PersonModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the Person service. Represents a row in the &quot;meera_Person&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.meera.jersey.services.model.PersonModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PersonImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a person model instance should use the {@link com.meera.jersey.services.model.Person} interface instead.
 * </p>
 *
 * @author meera
 * @see PersonImpl
 * @see com.meera.jersey.services.model.Person
 * @see com.meera.jersey.services.model.PersonModel
 * @generated
 */
public class PersonModelImpl extends BaseModelImpl<Person>
	implements PersonModel {
	public static final String TABLE_NAME = "meera_Person";
	public static final Object[][] TABLE_COLUMNS = {
			{ "personId", new Integer(Types.BIGINT) },
			{ "personName", new Integer(Types.VARCHAR) },
			{ "personAddress", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table meera_Person (personId LONG not null primary key,personName VARCHAR(75) null,personAddress VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table meera_Person";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.meera.jersey.services.model.Person"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.meera.jersey.services.model.Person"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.meera.jersey.services.model.Person"));

	public PersonModelImpl() {
	}

	public long getPrimaryKey() {
		return _personId;
	}

	public void setPrimaryKey(long pk) {
		setPersonId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_personId);
	}

	public long getPersonId() {
		return _personId;
	}

	public void setPersonId(long personId) {
		_personId = personId;
	}

	public String getPersonName() {
		if (_personName == null) {
			return StringPool.BLANK;
		}
		else {
			return _personName;
		}
	}

	public void setPersonName(String personName) {
		_personName = personName;
	}

	public String getPersonAddress() {
		if (_personAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _personAddress;
		}
	}

	public void setPersonAddress(String personAddress) {
		_personAddress = personAddress;
	}

	public Person toEscapedModel() {
		if (isEscapedModel()) {
			return (Person)this;
		}
		else {
			return (Person)Proxy.newProxyInstance(Person.class.getClassLoader(),
				new Class[] { Person.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					Person.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		PersonImpl personImpl = new PersonImpl();

		personImpl.setPersonId(getPersonId());

		personImpl.setPersonName(getPersonName());

		personImpl.setPersonAddress(getPersonAddress());

		return personImpl;
	}

	public int compareTo(Person person) {
		long pk = person.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Person person = null;

		try {
			person = (Person)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = person.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{personId=");
		sb.append(getPersonId());
		sb.append(", personName=");
		sb.append(getPersonName());
		sb.append(", personAddress=");
		sb.append(getPersonAddress());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.meera.jersey.services.model.Person");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>personId</column-name><column-value><![CDATA[");
		sb.append(getPersonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personName</column-name><column-value><![CDATA[");
		sb.append(getPersonName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personAddress</column-name><column-value><![CDATA[");
		sb.append(getPersonAddress());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _personId;
	private String _personName;
	private String _personAddress;
	private transient ExpandoBridge _expandoBridge;
}
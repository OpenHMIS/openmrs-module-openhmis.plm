/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.openhmis.plm.test;

import org.openmrs.module.openhmis.plm.PersistentListServiceProvider;
import org.openmrs.module.openhmis.plm.model.PersistentListModel;

public class TestPersistentServiceProvider implements PersistentListServiceProvider {
	@Override
	public PersistentListModel[] getLists() {
		return new PersistentListModel[0];
	}

	@Override
	public Integer addList(PersistentListModel list) {
		return 1;
	}

	@Override
	public void removeList(String key) {

	}
}

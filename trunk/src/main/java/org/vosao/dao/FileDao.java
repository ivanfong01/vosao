/**
 * Vosao CMS. Simple CMS for Google App Engine.
 * Copyright (C) 2009 Vosao development team
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * email: vosao.dev@gmail.com
 */

package org.vosao.dao;

import java.util.List;

import org.vosao.entity.FileChunkEntity;
import org.vosao.entity.FileEntity;

public interface FileDao extends AbstractDao {

	void save(final FileEntity page);
	
	FileEntity getById(final String id);

	List<FileEntity> getByFolder(final String folderId);

	FileEntity getByName(final String folderId, final String name);

	void remove(final String id);
	
	void remove(final List<String> ids);
	
	void saveFileContent(final FileEntity file, byte[] content);
	
	byte[] getFileContent(final FileEntity file);
	
	List<FileChunkEntity> createChunks(FileEntity file,	byte[] content);

	void removeByFolder(final String folderId);

}

// Copyright (c) 2014, Facebook, Inc.  All rights reserved.
// This source code is licensed under the BSD-style license found in the
// LICENSE file in the root directory of this source tree. An additional grant
// of patent rights can be found in the PATENTS file in the same directory.

package org.rocksdb;

import java.util.List;

public class LiveFiles {
	private final List<String> table_files_;
	private final String current_file_;
	private final String manifest_file_;
	private final long manifest_file_size_;

	public LiveFiles(List<String> table_files, String current_file, String manifest_file, long manifest_file_size) {
		table_files_ = table_files;
		current_file_ = current_file;
		manifest_file_ = manifest_file;
		manifest_file_size_ = manifest_file_size;
	}

	public List<String> table_files() {
		return table_files_;
	}

	public String current_file() {
		return current_file_;
	}

	public String manifest_file() {
		return manifest_file_;
	}

	public long manifest_file_size() {
		return manifest_file_size_;
	}
}

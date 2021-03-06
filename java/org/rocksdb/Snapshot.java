// Copyright (c) 2014, Facebook, Inc.  All rights reserved.
// This source code is licensed under the BSD-style license found in the
// LICENSE file in the root directory of this source tree. An additional grant
// of patent rights can be found in the PATENTS file in the same directory.

package org.rocksdb;

/**
 * Snapshot of database
 */
public class Snapshot extends RocksObject {
  Snapshot(long nativeHandle) {
    super();
    nativeHandle_ = nativeHandle;
  }

  /**
   * Dont release C++ Snapshot pointer. The pointer
   * to the snapshot is released by the database
   * instance.
   */
  @Override protected void disposeInternal() {
  }
}

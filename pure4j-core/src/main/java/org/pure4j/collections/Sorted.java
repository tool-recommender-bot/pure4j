/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *   which can be found in the file epl-v10.html at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

/* rich Apr 15, 2008 */

package org.pure4j.collections;

import java.util.Comparator;

public interface Sorted<K, E> {
	
	Comparator<K> comparator();

	K entryKey(E entry);

	ISeq<E> seq(boolean ascending);

	ISeq<E> seqFrom(K key, boolean ascending);
}
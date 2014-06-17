/*
 * Copyright (c) 2014, Yetaai
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.boldust.utils.RedBlackIndex;

import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.*;

/**
 *
 * @author Yetaai
 */
public class ObjectsIndex {
    private RedBlackBST bst = new RedBlackBST();
    Logger logger = Logger.getLogger("org.boldust");
    public <T extends Comparable> ObjectsIndex(ArrayList<T> al) {
        try {
            for (int i = 0; i < al.size(); i++){
                bst.put(al.get(i), i);
            }
        } catch (Exception e) {
            logger.log(Level.ERROR, this.getClass().getName() + "Exception in contsruction");
        }
    }
    public <T extends Comparable> int getArrayIndex(T t) {
        Integer i = (Integer) bst.get(t);
        if (i == null) i = -1;
        return i;
    }
}

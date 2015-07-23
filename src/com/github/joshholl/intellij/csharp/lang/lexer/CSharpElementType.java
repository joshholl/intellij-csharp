package com.github.joshholl.intellij.csharp.lang.lexer;

import com.github.joshholl.intellij.csharp.CSharpLanguage;
import com.intellij.psi.tree.IElementType;

/**
 * Created by josh on 7/22/15.
 */
public class CSharpElementType extends IElementType {
    public CSharpElementType(String debugName) {
        super(debugName, CSharpLanguage.INSTANCE);
    }
}

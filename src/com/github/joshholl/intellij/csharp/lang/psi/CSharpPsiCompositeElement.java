package com.github.joshholl.intellij.csharp.lang.psi;

import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.tree.IElementType;

/**
 * Created by josh on 7/22/15.
 */
public interface CSharpPsiCompositeElement extends NavigatablePsiElement{
    IElementType getTokenType();

}

// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpBinaryOperatorDeclarator extends PsiElement {

  @NotNull
  CSharpOverloadableBinaryOperator getOverloadableBinaryOperator();

  @NotNull
  List<CSharpType> getTypeList();

}

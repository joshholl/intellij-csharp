// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpArrayCreationExpression extends PsiElement {

  @Nullable
  CSharpArrayInitializer getArrayInitializer();

  @Nullable
  CSharpArrayType getArrayType();

  @Nullable
  CSharpExpressionList getExpressionList();

  @Nullable
  CSharpNonArrayType getNonArrayType();

  @Nullable
  CSharpRankSpecifier getRankSpecifier();

  @Nullable
  CSharpRankSpecifiers getRankSpecifiers();

}

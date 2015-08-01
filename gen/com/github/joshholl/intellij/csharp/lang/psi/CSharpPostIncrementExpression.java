// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpPostIncrementExpression extends PsiElement {

  @Nullable
  CSharpAnonymousMethodExpression getAnonymousMethodExpression();

  @Nullable
  CSharpAnonymousObjectCreationExpression getAnonymousObjectCreationExpression();

  @NotNull
  List<CSharpArgumentList> getArgumentListList();

  @Nullable
  CSharpArrayCreationExpression getArrayCreationExpression();

  @Nullable
  CSharpBaseAccess getBaseAccess();

  @Nullable
  CSharpCheckedExpression getCheckedExpression();

  @Nullable
  CSharpDefaultValueExpression getDefaultValueExpression();

  @Nullable
  CSharpDelegateCreationExpression getDelegateCreationExpression();

  @NotNull
  List<CSharpExpression> getExpressionList();

  @NotNull
  List<CSharpExpressionList> getExpressionListList();

  @Nullable
  CSharpObjectCreationExpression getObjectCreationExpression();

  @Nullable
  CSharpParenthesizedExpression getParenthesizedExpression();

  @Nullable
  CSharpPredefinedType getPredefinedType();

  @Nullable
  CSharpQualifiedAliasMember getQualifiedAliasMember();

  @Nullable
  CSharpSimpleName getSimpleName();

  @Nullable
  CSharpThisAccess getThisAccess();

  @NotNull
  List<CSharpTypeArgumentList> getTypeArgumentListList();

  @Nullable
  CSharpTypeofExpression getTypeofExpression();

  @Nullable
  CSharpUncheckedExpression getUncheckedExpression();

}

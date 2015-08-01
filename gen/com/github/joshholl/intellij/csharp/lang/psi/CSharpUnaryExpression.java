// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpUnaryExpression extends PsiElement {

  @Nullable
  CSharpCastExpression getCastExpression();

  @Nullable
  CSharpPreDecrementExpression getPreDecrementExpression();

  @Nullable
  CSharpPreIncrementExpression getPreIncrementExpression();

  @Nullable
  CSharpPrimaryExpression getPrimaryExpression();

  @Nullable
  CSharpUnaryExpression getUnaryExpression();

}

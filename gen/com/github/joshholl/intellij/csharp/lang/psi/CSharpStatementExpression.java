// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpStatementExpression extends PsiElement {

  @Nullable
  CSharpAssignment getAssignment();

  @Nullable
  CSharpInvocationExpression getInvocationExpression();

  @Nullable
  CSharpObjectCreationExpression getObjectCreationExpression();

  @Nullable
  CSharpPostDecrementExpression getPostDecrementExpression();

  @Nullable
  CSharpPostIncrementExpression getPostIncrementExpression();

  @Nullable
  CSharpPreDecrementExpression getPreDecrementExpression();

  @Nullable
  CSharpPreIncrementExpression getPreIncrementExpression();

}

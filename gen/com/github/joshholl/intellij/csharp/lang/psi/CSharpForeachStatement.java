// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpForeachStatement extends PsiElement {

  @NotNull
  CSharpEmbeddedStatement getEmbeddedStatement();

  @NotNull
  CSharpExpression getExpression();

  @NotNull
  CSharpLocalVariableType getLocalVariableType();

}

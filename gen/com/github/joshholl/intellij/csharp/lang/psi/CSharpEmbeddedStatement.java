// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpEmbeddedStatement extends PsiElement {

  @Nullable
  CSharpBlock getBlock();

  @Nullable
  CSharpCheckedStatement getCheckedStatement();

  @Nullable
  CSharpEmptyStatement getEmptyStatement();

  @Nullable
  CSharpExpressionStatement getExpressionStatement();

  @Nullable
  CSharpIterationStatement getIterationStatement();

  @Nullable
  CSharpJumpStatement getJumpStatement();

  @Nullable
  CSharpLockStatement getLockStatement();

  @Nullable
  CSharpSelectionStatement getSelectionStatement();

  @Nullable
  CSharpTryStatement getTryStatement();

  @Nullable
  CSharpUncheckedStatement getUncheckedStatement();

  @Nullable
  CSharpUsingStatement getUsingStatement();

  @Nullable
  CSharpYieldStatement getYieldStatement();

}

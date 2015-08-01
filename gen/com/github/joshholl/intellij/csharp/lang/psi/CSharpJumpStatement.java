// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpJumpStatement extends PsiElement {

  @Nullable
  CSharpBreakStatement getBreakStatement();

  @Nullable
  CSharpContinueStatement getContinueStatement();

  @Nullable
  CSharpGotoStatement getGotoStatement();

  @Nullable
  CSharpReturnStatement getReturnStatement();

  @Nullable
  CSharpThrowStatement getThrowStatement();

}

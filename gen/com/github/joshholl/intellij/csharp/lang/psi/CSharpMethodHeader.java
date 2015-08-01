// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpMethodHeader extends PsiElement {

  @Nullable
  CSharpAttributes getAttributes();

  @Nullable
  CSharpFormalParameterList getFormalParameterList();

  @NotNull
  CSharpMemberName getMemberName();

  @Nullable
  CSharpMethodModifiers getMethodModifiers();

  @NotNull
  CSharpReturnType getReturnType();

  @Nullable
  CSharpTypeParameterConstraintsClauses getTypeParameterConstraintsClauses();

  @Nullable
  CSharpTypeParameterList getTypeParameterList();

}

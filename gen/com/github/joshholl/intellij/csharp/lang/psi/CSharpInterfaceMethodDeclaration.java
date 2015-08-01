// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpInterfaceMethodDeclaration extends PsiElement {

  @Nullable
  CSharpAttributes getAttributes();

  @Nullable
  CSharpFormalParameterList getFormalParameterList();

  @NotNull
  CSharpReturnType getReturnType();

  @Nullable
  CSharpTypeParameterConstraintsClauses getTypeParameterConstraintsClauses();

  @NotNull
  CSharpTypeParameterList getTypeParameterList();

}

// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpStructDeclaration extends PsiElement {

  @Nullable
  CSharpAttributes getAttributes();

  @NotNull
  CSharpStructBody getStructBody();

  @Nullable
  CSharpStructInterfaces getStructInterfaces();

  @Nullable
  CSharpStructModifiers getStructModifiers();

  @Nullable
  CSharpTypeParameterConstraintsClauses getTypeParameterConstraintsClauses();

  @Nullable
  CSharpTypeParameterList getTypeParameterList();

}

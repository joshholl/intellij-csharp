// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpInterfaceDeclaration extends PsiElement {

  @Nullable
  CSharpAttributes getAttributes();

  @Nullable
  CSharpInterfaceBase getInterfaceBase();

  @NotNull
  CSharpInterfaceBody getInterfaceBody();

  @Nullable
  CSharpInterfaceModifiers getInterfaceModifiers();

  @Nullable
  CSharpTypeParameterConstraintsClauses getTypeParameterConstraintsClauses();

  @Nullable
  CSharpVariantTypeParameterList getVariantTypeParameterList();

}

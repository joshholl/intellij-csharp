// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpEventDeclaration extends PsiElement {

  @Nullable
  CSharpAttributes getAttributes();

  @Nullable
  CSharpEventAccessorDeclarations getEventAccessorDeclarations();

  @Nullable
  CSharpEventModifiers getEventModifiers();

  @Nullable
  CSharpMemberName getMemberName();

  @NotNull
  CSharpType getType();

  @Nullable
  CSharpVariableDeclarators getVariableDeclarators();

}

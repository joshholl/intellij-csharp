// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpIndexerDeclaration extends PsiElement {

  @NotNull
  CSharpAccessorDeclarations getAccessorDeclarations();

  @Nullable
  CSharpAttributes getAttributes();

  @NotNull
  CSharpIndexerDeclarator getIndexerDeclarator();

  @Nullable
  CSharpIndexerModifiers getIndexerModifiers();

}

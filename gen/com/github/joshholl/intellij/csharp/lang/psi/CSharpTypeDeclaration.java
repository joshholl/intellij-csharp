// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpTypeDeclaration extends PsiElement {

  @Nullable
  CSharpClassDeclaration getClassDeclaration();

  @Nullable
  CSharpDelegateDeclaration getDelegateDeclaration();

  @Nullable
  CSharpEnumDeclaration getEnumDeclaration();

  @Nullable
  CSharpInterfaceDeclaration getInterfaceDeclaration();

  @Nullable
  CSharpStructDeclaration getStructDeclaration();

}

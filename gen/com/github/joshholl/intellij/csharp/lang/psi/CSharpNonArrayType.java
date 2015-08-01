// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpNonArrayType extends PsiElement {

  @Nullable
  CSharpClassType getClassType();

  @Nullable
  CSharpDelegateType getDelegateType();

  @Nullable
  CSharpEnumType getEnumType();

  @Nullable
  CSharpInterfaceType getInterfaceType();

  @Nullable
  CSharpSimpleType getSimpleType();

  @Nullable
  CSharpTypeName getTypeName();

  @Nullable
  CSharpTypeParameter getTypeParameter();

}

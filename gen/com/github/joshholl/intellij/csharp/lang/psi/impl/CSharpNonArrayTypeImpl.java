// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.joshholl.intellij.csharp.lang.lexer.CSharpTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.joshholl.intellij.csharp.lang.psi.*;

public class CSharpNonArrayTypeImpl extends ASTWrapperPsiElement implements CSharpNonArrayType {

  public CSharpNonArrayTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitNonArrayType(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpClassType getClassType() {
    return findChildByClass(CSharpClassType.class);
  }

  @Override
  @Nullable
  public CSharpDelegateType getDelegateType() {
    return findChildByClass(CSharpDelegateType.class);
  }

  @Override
  @Nullable
  public CSharpEnumType getEnumType() {
    return findChildByClass(CSharpEnumType.class);
  }

  @Override
  @Nullable
  public CSharpInterfaceType getInterfaceType() {
    return findChildByClass(CSharpInterfaceType.class);
  }

  @Override
  @Nullable
  public CSharpSimpleType getSimpleType() {
    return findChildByClass(CSharpSimpleType.class);
  }

  @Override
  @Nullable
  public CSharpTypeName getTypeName() {
    return findChildByClass(CSharpTypeName.class);
  }

  @Override
  @Nullable
  public CSharpTypeParameter getTypeParameter() {
    return findChildByClass(CSharpTypeParameter.class);
  }

}

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

public class CSharpInterfaceDeclarationImpl extends ASTWrapperPsiElement implements CSharpInterfaceDeclaration {

  public CSharpInterfaceDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitInterfaceDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpAttributes getAttributes() {
    return findChildByClass(CSharpAttributes.class);
  }

  @Override
  @Nullable
  public CSharpInterfaceBase getInterfaceBase() {
    return findChildByClass(CSharpInterfaceBase.class);
  }

  @Override
  @NotNull
  public CSharpInterfaceBody getInterfaceBody() {
    return findNotNullChildByClass(CSharpInterfaceBody.class);
  }

  @Override
  @Nullable
  public CSharpInterfaceModifiers getInterfaceModifiers() {
    return findChildByClass(CSharpInterfaceModifiers.class);
  }

  @Override
  @Nullable
  public CSharpTypeParameterConstraintsClauses getTypeParameterConstraintsClauses() {
    return findChildByClass(CSharpTypeParameterConstraintsClauses.class);
  }

  @Override
  @Nullable
  public CSharpVariantTypeParameterList getVariantTypeParameterList() {
    return findChildByClass(CSharpVariantTypeParameterList.class);
  }

}

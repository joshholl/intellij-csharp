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

public class CSharpStructDeclarationImpl extends ASTWrapperPsiElement implements CSharpStructDeclaration {

  public CSharpStructDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitStructDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpAttributes getAttributes() {
    return findChildByClass(CSharpAttributes.class);
  }

  @Override
  @NotNull
  public CSharpStructBody getStructBody() {
    return findNotNullChildByClass(CSharpStructBody.class);
  }

  @Override
  @Nullable
  public CSharpStructInterfaces getStructInterfaces() {
    return findChildByClass(CSharpStructInterfaces.class);
  }

  @Override
  @Nullable
  public CSharpStructModifiers getStructModifiers() {
    return findChildByClass(CSharpStructModifiers.class);
  }

  @Override
  @Nullable
  public CSharpTypeParameterConstraintsClauses getTypeParameterConstraintsClauses() {
    return findChildByClass(CSharpTypeParameterConstraintsClauses.class);
  }

  @Override
  @Nullable
  public CSharpTypeParameterList getTypeParameterList() {
    return findChildByClass(CSharpTypeParameterList.class);
  }

}

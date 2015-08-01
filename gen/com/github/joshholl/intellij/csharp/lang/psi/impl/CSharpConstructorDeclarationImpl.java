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

public class CSharpConstructorDeclarationImpl extends ASTWrapperPsiElement implements CSharpConstructorDeclaration {

  public CSharpConstructorDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitConstructorDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpAttributes getAttributes() {
    return findChildByClass(CSharpAttributes.class);
  }

  @Override
  @NotNull
  public CSharpConstructorBody getConstructorBody() {
    return findNotNullChildByClass(CSharpConstructorBody.class);
  }

  @Override
  @NotNull
  public CSharpConstructorDeclarator getConstructorDeclarator() {
    return findNotNullChildByClass(CSharpConstructorDeclarator.class);
  }

  @Override
  @Nullable
  public CSharpConstructorModifiers getConstructorModifiers() {
    return findChildByClass(CSharpConstructorModifiers.class);
  }

}

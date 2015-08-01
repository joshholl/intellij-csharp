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

public class CSharpStructMemberDeclarationImpl extends ASTWrapperPsiElement implements CSharpStructMemberDeclaration {

  public CSharpStructMemberDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitStructMemberDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpConstantDeclaration getConstantDeclaration() {
    return findChildByClass(CSharpConstantDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpConstructorDeclaration getConstructorDeclaration() {
    return findChildByClass(CSharpConstructorDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpEventDeclaration getEventDeclaration() {
    return findChildByClass(CSharpEventDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpFieldDeclaration getFieldDeclaration() {
    return findChildByClass(CSharpFieldDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpIndexerDeclaration getIndexerDeclaration() {
    return findChildByClass(CSharpIndexerDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpMethodDeclaration getMethodDeclaration() {
    return findChildByClass(CSharpMethodDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpOperatorDeclaration getOperatorDeclaration() {
    return findChildByClass(CSharpOperatorDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpPropertyDeclaration getPropertyDeclaration() {
    return findChildByClass(CSharpPropertyDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpStaticConstructorDeclaration getStaticConstructorDeclaration() {
    return findChildByClass(CSharpStaticConstructorDeclaration.class);
  }

  @Override
  @Nullable
  public CSharpTypeDeclaration getTypeDeclaration() {
    return findChildByClass(CSharpTypeDeclaration.class);
  }

}

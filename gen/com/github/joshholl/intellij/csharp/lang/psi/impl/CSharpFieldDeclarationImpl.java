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

public class CSharpFieldDeclarationImpl extends ASTWrapperPsiElement implements CSharpFieldDeclaration {

  public CSharpFieldDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitFieldDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpAttributes getAttributes() {
    return findChildByClass(CSharpAttributes.class);
  }

  @Override
  @Nullable
  public CSharpFieldModifiers getFieldModifiers() {
    return findChildByClass(CSharpFieldModifiers.class);
  }

  @Override
  @NotNull
  public CSharpType getType() {
    return findNotNullChildByClass(CSharpType.class);
  }

  @Override
  @NotNull
  public CSharpVariableDeclarators getVariableDeclarators() {
    return findNotNullChildByClass(CSharpVariableDeclarators.class);
  }

}

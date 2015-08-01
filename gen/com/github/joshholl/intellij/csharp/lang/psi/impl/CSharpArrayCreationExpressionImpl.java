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

public class CSharpArrayCreationExpressionImpl extends ASTWrapperPsiElement implements CSharpArrayCreationExpression {

  public CSharpArrayCreationExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitArrayCreationExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpArrayInitializer getArrayInitializer() {
    return findChildByClass(CSharpArrayInitializer.class);
  }

  @Override
  @Nullable
  public CSharpArrayType getArrayType() {
    return findChildByClass(CSharpArrayType.class);
  }

  @Override
  @Nullable
  public CSharpExpressionList getExpressionList() {
    return findChildByClass(CSharpExpressionList.class);
  }

  @Override
  @Nullable
  public CSharpNonArrayType getNonArrayType() {
    return findChildByClass(CSharpNonArrayType.class);
  }

  @Override
  @Nullable
  public CSharpRankSpecifier getRankSpecifier() {
    return findChildByClass(CSharpRankSpecifier.class);
  }

  @Override
  @Nullable
  public CSharpRankSpecifiers getRankSpecifiers() {
    return findChildByClass(CSharpRankSpecifiers.class);
  }

}

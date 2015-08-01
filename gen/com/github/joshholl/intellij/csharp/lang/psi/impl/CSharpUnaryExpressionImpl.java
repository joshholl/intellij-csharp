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

public class CSharpUnaryExpressionImpl extends ASTWrapperPsiElement implements CSharpUnaryExpression {

  public CSharpUnaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitUnaryExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpCastExpression getCastExpression() {
    return findChildByClass(CSharpCastExpression.class);
  }

  @Override
  @Nullable
  public CSharpPreDecrementExpression getPreDecrementExpression() {
    return findChildByClass(CSharpPreDecrementExpression.class);
  }

  @Override
  @Nullable
  public CSharpPreIncrementExpression getPreIncrementExpression() {
    return findChildByClass(CSharpPreIncrementExpression.class);
  }

  @Override
  @Nullable
  public CSharpPrimaryExpression getPrimaryExpression() {
    return findChildByClass(CSharpPrimaryExpression.class);
  }

  @Override
  @Nullable
  public CSharpUnaryExpression getUnaryExpression() {
    return findChildByClass(CSharpUnaryExpression.class);
  }

}

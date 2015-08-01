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

public class CSharpStatementExpressionImpl extends ASTWrapperPsiElement implements CSharpStatementExpression {

  public CSharpStatementExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitStatementExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpAssignment getAssignment() {
    return findChildByClass(CSharpAssignment.class);
  }

  @Override
  @Nullable
  public CSharpInvocationExpression getInvocationExpression() {
    return findChildByClass(CSharpInvocationExpression.class);
  }

  @Override
  @Nullable
  public CSharpObjectCreationExpression getObjectCreationExpression() {
    return findChildByClass(CSharpObjectCreationExpression.class);
  }

  @Override
  @Nullable
  public CSharpPostDecrementExpression getPostDecrementExpression() {
    return findChildByClass(CSharpPostDecrementExpression.class);
  }

  @Override
  @Nullable
  public CSharpPostIncrementExpression getPostIncrementExpression() {
    return findChildByClass(CSharpPostIncrementExpression.class);
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

}

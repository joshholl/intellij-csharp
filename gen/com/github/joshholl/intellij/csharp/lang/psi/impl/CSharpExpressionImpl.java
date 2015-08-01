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

public class CSharpExpressionImpl extends ASTWrapperPsiElement implements CSharpExpression {

  public CSharpExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpAssignmentOperator getAssignmentOperator() {
    return findChildByClass(CSharpAssignmentOperator.class);
  }

  @Override
  @Nullable
  public CSharpExpression getExpression() {
    return findChildByClass(CSharpExpression.class);
  }

  @Override
  @Nullable
  public CSharpNonAssignmentExpression getNonAssignmentExpression() {
    return findChildByClass(CSharpNonAssignmentExpression.class);
  }

  @Override
  @Nullable
  public CSharpUnaryExpression getUnaryExpression() {
    return findChildByClass(CSharpUnaryExpression.class);
  }

}

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

public class CSharpPrimaryExpressionImpl extends ASTWrapperPsiElement implements CSharpPrimaryExpression {

  public CSharpPrimaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitPrimaryExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpAnonymousMethodExpression getAnonymousMethodExpression() {
    return findChildByClass(CSharpAnonymousMethodExpression.class);
  }

  @Override
  @Nullable
  public CSharpAnonymousObjectCreationExpression getAnonymousObjectCreationExpression() {
    return findChildByClass(CSharpAnonymousObjectCreationExpression.class);
  }

  @Override
  @NotNull
  public List<CSharpArgumentList> getArgumentListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CSharpArgumentList.class);
  }

  @Override
  @Nullable
  public CSharpArrayCreationExpression getArrayCreationExpression() {
    return findChildByClass(CSharpArrayCreationExpression.class);
  }

  @Override
  @Nullable
  public CSharpBaseAccess getBaseAccess() {
    return findChildByClass(CSharpBaseAccess.class);
  }

  @Override
  @Nullable
  public CSharpCheckedExpression getCheckedExpression() {
    return findChildByClass(CSharpCheckedExpression.class);
  }

  @Override
  @Nullable
  public CSharpDefaultValueExpression getDefaultValueExpression() {
    return findChildByClass(CSharpDefaultValueExpression.class);
  }

  @Override
  @Nullable
  public CSharpDelegateCreationExpression getDelegateCreationExpression() {
    return findChildByClass(CSharpDelegateCreationExpression.class);
  }

  @Override
  @NotNull
  public List<CSharpExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CSharpExpression.class);
  }

  @Override
  @NotNull
  public List<CSharpExpressionList> getExpressionListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CSharpExpressionList.class);
  }

  @Override
  @Nullable
  public CSharpObjectCreationExpression getObjectCreationExpression() {
    return findChildByClass(CSharpObjectCreationExpression.class);
  }

  @Override
  @Nullable
  public CSharpParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(CSharpParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public CSharpPredefinedType getPredefinedType() {
    return findChildByClass(CSharpPredefinedType.class);
  }

  @Override
  @Nullable
  public CSharpQualifiedAliasMember getQualifiedAliasMember() {
    return findChildByClass(CSharpQualifiedAliasMember.class);
  }

  @Override
  @Nullable
  public CSharpSimpleName getSimpleName() {
    return findChildByClass(CSharpSimpleName.class);
  }

  @Override
  @Nullable
  public CSharpThisAccess getThisAccess() {
    return findChildByClass(CSharpThisAccess.class);
  }

  @Override
  @NotNull
  public List<CSharpTypeArgumentList> getTypeArgumentListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CSharpTypeArgumentList.class);
  }

  @Override
  @Nullable
  public CSharpTypeofExpression getTypeofExpression() {
    return findChildByClass(CSharpTypeofExpression.class);
  }

  @Override
  @Nullable
  public CSharpUncheckedExpression getUncheckedExpression() {
    return findChildByClass(CSharpUncheckedExpression.class);
  }

}

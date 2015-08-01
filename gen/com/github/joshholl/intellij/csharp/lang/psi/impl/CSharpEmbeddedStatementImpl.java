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

public class CSharpEmbeddedStatementImpl extends ASTWrapperPsiElement implements CSharpEmbeddedStatement {

  public CSharpEmbeddedStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitEmbeddedStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpBlock getBlock() {
    return findChildByClass(CSharpBlock.class);
  }

  @Override
  @Nullable
  public CSharpCheckedStatement getCheckedStatement() {
    return findChildByClass(CSharpCheckedStatement.class);
  }

  @Override
  @Nullable
  public CSharpEmptyStatement getEmptyStatement() {
    return findChildByClass(CSharpEmptyStatement.class);
  }

  @Override
  @Nullable
  public CSharpExpressionStatement getExpressionStatement() {
    return findChildByClass(CSharpExpressionStatement.class);
  }

  @Override
  @Nullable
  public CSharpIterationStatement getIterationStatement() {
    return findChildByClass(CSharpIterationStatement.class);
  }

  @Override
  @Nullable
  public CSharpJumpStatement getJumpStatement() {
    return findChildByClass(CSharpJumpStatement.class);
  }

  @Override
  @Nullable
  public CSharpLockStatement getLockStatement() {
    return findChildByClass(CSharpLockStatement.class);
  }

  @Override
  @Nullable
  public CSharpSelectionStatement getSelectionStatement() {
    return findChildByClass(CSharpSelectionStatement.class);
  }

  @Override
  @Nullable
  public CSharpTryStatement getTryStatement() {
    return findChildByClass(CSharpTryStatement.class);
  }

  @Override
  @Nullable
  public CSharpUncheckedStatement getUncheckedStatement() {
    return findChildByClass(CSharpUncheckedStatement.class);
  }

  @Override
  @Nullable
  public CSharpUsingStatement getUsingStatement() {
    return findChildByClass(CSharpUsingStatement.class);
  }

  @Override
  @Nullable
  public CSharpYieldStatement getYieldStatement() {
    return findChildByClass(CSharpYieldStatement.class);
  }

}

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

public class CSharpJumpStatementImpl extends ASTWrapperPsiElement implements CSharpJumpStatement {

  public CSharpJumpStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitJumpStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpBreakStatement getBreakStatement() {
    return findChildByClass(CSharpBreakStatement.class);
  }

  @Override
  @Nullable
  public CSharpContinueStatement getContinueStatement() {
    return findChildByClass(CSharpContinueStatement.class);
  }

  @Override
  @Nullable
  public CSharpGotoStatement getGotoStatement() {
    return findChildByClass(CSharpGotoStatement.class);
  }

  @Override
  @Nullable
  public CSharpReturnStatement getReturnStatement() {
    return findChildByClass(CSharpReturnStatement.class);
  }

  @Override
  @Nullable
  public CSharpThrowStatement getThrowStatement() {
    return findChildByClass(CSharpThrowStatement.class);
  }

}

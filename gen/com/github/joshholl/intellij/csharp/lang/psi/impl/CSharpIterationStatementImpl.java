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

public class CSharpIterationStatementImpl extends ASTWrapperPsiElement implements CSharpIterationStatement {

  public CSharpIterationStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitIterationStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpDoStatement getDoStatement() {
    return findChildByClass(CSharpDoStatement.class);
  }

  @Override
  @Nullable
  public CSharpForStatement getForStatement() {
    return findChildByClass(CSharpForStatement.class);
  }

  @Override
  @Nullable
  public CSharpForeachStatement getForeachStatement() {
    return findChildByClass(CSharpForeachStatement.class);
  }

  @Override
  @Nullable
  public CSharpWhileStatement getWhileStatement() {
    return findChildByClass(CSharpWhileStatement.class);
  }

}

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

public class CSharpQueryBodyClauseImpl extends ASTWrapperPsiElement implements CSharpQueryBodyClause {

  public CSharpQueryBodyClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitQueryBodyClause(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpFromClause getFromClause() {
    return findChildByClass(CSharpFromClause.class);
  }

  @Override
  @Nullable
  public CSharpJoinClause getJoinClause() {
    return findChildByClass(CSharpJoinClause.class);
  }

  @Override
  @Nullable
  public CSharpJoinIntoClause getJoinIntoClause() {
    return findChildByClass(CSharpJoinIntoClause.class);
  }

  @Override
  @Nullable
  public CSharpLetClause getLetClause() {
    return findChildByClass(CSharpLetClause.class);
  }

  @Override
  @Nullable
  public CSharpOrderbyClause getOrderbyClause() {
    return findChildByClass(CSharpOrderbyClause.class);
  }

  @Override
  @Nullable
  public CSharpWhereClause getWhereClause() {
    return findChildByClass(CSharpWhereClause.class);
  }

}

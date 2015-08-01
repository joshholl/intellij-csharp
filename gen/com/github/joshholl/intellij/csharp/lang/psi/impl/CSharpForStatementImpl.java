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

public class CSharpForStatementImpl extends ASTWrapperPsiElement implements CSharpForStatement {

  public CSharpForStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitForStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CSharpEmbeddedStatement getEmbeddedStatement() {
    return findNotNullChildByClass(CSharpEmbeddedStatement.class);
  }

  @Override
  @Nullable
  public CSharpForCondition getForCondition() {
    return findChildByClass(CSharpForCondition.class);
  }

  @Override
  @Nullable
  public CSharpForInitializer getForInitializer() {
    return findChildByClass(CSharpForInitializer.class);
  }

  @Override
  @Nullable
  public CSharpForIterator getForIterator() {
    return findChildByClass(CSharpForIterator.class);
  }

}

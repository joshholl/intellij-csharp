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

public class CSharpUsingStatementImpl extends ASTWrapperPsiElement implements CSharpUsingStatement {

  public CSharpUsingStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitUsingStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CSharpEmbeddedStatement getEmbeddedStatement() {
    return findNotNullChildByClass(CSharpEmbeddedStatement.class);
  }

  @Override
  @NotNull
  public CSharpResourceAcquisition getResourceAcquisition() {
    return findNotNullChildByClass(CSharpResourceAcquisition.class);
  }

}

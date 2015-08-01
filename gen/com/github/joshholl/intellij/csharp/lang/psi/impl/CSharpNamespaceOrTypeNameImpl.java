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

public class CSharpNamespaceOrTypeNameImpl extends ASTWrapperPsiElement implements CSharpNamespaceOrTypeName {

  public CSharpNamespaceOrTypeNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitNamespaceOrTypeName(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSharpQualifiedAliasMember getQualifiedAliasMember() {
    return findChildByClass(CSharpQualifiedAliasMember.class);
  }

  @Override
  @NotNull
  public List<CSharpTypeArgumentList> getTypeArgumentListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CSharpTypeArgumentList.class);
  }

}

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

public class CSharpGetAccessorDeclarationImpl extends ASTWrapperPsiElement implements CSharpGetAccessorDeclaration {

  public CSharpGetAccessorDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CSharpVisitor) ((CSharpVisitor)visitor).visitGetAccessorDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CSharpAccessorBody getAccessorBody() {
    return findNotNullChildByClass(CSharpAccessorBody.class);
  }

  @Override
  @Nullable
  public CSharpAccessorModifier getAccessorModifier() {
    return findChildByClass(CSharpAccessorModifier.class);
  }

  @Override
  @Nullable
  public CSharpAttributes getAttributes() {
    return findChildByClass(CSharpAttributes.class);
  }

}

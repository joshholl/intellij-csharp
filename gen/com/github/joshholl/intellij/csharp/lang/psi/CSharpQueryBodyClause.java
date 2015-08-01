// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CSharpQueryBodyClause extends PsiElement {

  @Nullable
  CSharpFromClause getFromClause();

  @Nullable
  CSharpJoinClause getJoinClause();

  @Nullable
  CSharpJoinIntoClause getJoinIntoClause();

  @Nullable
  CSharpLetClause getLetClause();

  @Nullable
  CSharpOrderbyClause getOrderbyClause();

  @Nullable
  CSharpWhereClause getWhereClause();

}

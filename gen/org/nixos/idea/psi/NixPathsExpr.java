// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NixPathsExpr extends PsiElement {

  @NotNull
  List<NixPathStmt> getPathStmtList();

  @NotNull
  PsiElement getLbrac();

  @NotNull
  PsiElement getRbrac();

}

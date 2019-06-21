package com.google.android.flexbox;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  int apt;
  int bti;
  int btj;
  int btk;
  int btl;
  float btm;
  float btn;
  int bto;
  int btp;
  List<Integer> btq;
  int btr;
  int bts;
  int xJ;
  int xL;
  int xM;
  int xN;

  b()
  {
    AppMethodBeat.i(54677);
    this.xJ = 2147483647;
    this.xL = 2147483647;
    this.xM = -2147483648;
    this.xN = -2147483648;
    this.btq = new ArrayList();
    AppMethodBeat.o(54677);
  }

  final void m(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(54678);
    FlexItem localFlexItem = (FlexItem)paramView.getLayoutParams();
    this.xJ = Math.min(this.xJ, paramView.getLeft() - localFlexItem.ug() - paramInt1);
    this.xL = Math.min(this.xL, paramView.getTop() - localFlexItem.uh() - paramInt2);
    this.xM = Math.max(this.xM, paramView.getRight() + localFlexItem.ui() + paramInt3);
    paramInt2 = this.xN;
    paramInt1 = paramView.getBottom();
    this.xN = Math.max(paramInt2, localFlexItem.uj() + paramInt1 + paramInt4);
    AppMethodBeat.o(54678);
  }

  public final int uk()
  {
    return this.apt - this.btl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.b
 * JD-Core Version:    0.6.2
 */
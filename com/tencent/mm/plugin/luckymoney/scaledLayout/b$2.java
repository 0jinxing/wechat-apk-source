package com.tencent.mm.plugin.luckymoney.scaledLayout;

import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.i;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2 extends b
{
  b$2(RecyclerView.i parami)
  {
    super(parami, (byte)0);
  }

  public final int bLR()
  {
    AppMethodBeat.i(42478);
    int i = this.amP.mWidth;
    int j = this.amP.getPaddingLeft();
    int k = this.amP.getPaddingRight();
    AppMethodBeat.o(42478);
    return i - j - k;
  }

  public final int bj(View paramView)
  {
    AppMethodBeat.i(42475);
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bw(paramView);
    int j = localLayoutParams.topMargin;
    int k = localLayoutParams.bottomMargin;
    AppMethodBeat.o(42475);
    return k + (i + j);
  }

  public final int bk(View paramView)
  {
    AppMethodBeat.i(42476);
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = RecyclerView.i.bv(paramView);
    int j = localLayoutParams.leftMargin;
    int k = localLayoutParams.rightMargin;
    AppMethodBeat.o(42476);
    return k + (i + j);
  }

  public final int je()
  {
    AppMethodBeat.i(42474);
    int i = this.amP.getPaddingTop();
    AppMethodBeat.o(42474);
    return i;
  }

  public final int jg()
  {
    AppMethodBeat.i(42477);
    int i = this.amP.mHeight;
    int j = this.amP.getPaddingTop();
    int k = this.amP.getPaddingBottom();
    AppMethodBeat.o(42477);
    return i - j - k;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.scaledLayout.b.2
 * JD-Core Version:    0.6.2
 */
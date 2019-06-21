package com.tencent.mm.plugin.luckymoney.scaledLayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.r.a;
import android.support.v7.widget.ah;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1 extends ah
{
  a$1(a parama, Context paramContext, RecyclerView.i parami)
  {
    super(paramContext);
  }

  public final void a(View paramView, RecyclerView.r.a parama)
  {
    AppMethodBeat.i(42463);
    paramView = this.oaX.a(this.oaW, paramView);
    int i = paramView[0];
    int j = paramView[1];
    int k = ca(Math.max(Math.abs(i), Math.abs(j)));
    if (k > 0)
      parama.a(i, j, k, this.Sf);
    AppMethodBeat.o(42463);
  }

  public final float c(DisplayMetrics paramDisplayMetrics)
  {
    return 50.0F / paramDisplayMetrics.densityDpi;
  }

  public final int cb(int paramInt)
  {
    AppMethodBeat.i(42464);
    paramInt = Math.min(50, super.cb(paramInt));
    AppMethodBeat.o(42464);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.scaledLayout.a.1
 * JD-Core Version:    0.6.2
 */
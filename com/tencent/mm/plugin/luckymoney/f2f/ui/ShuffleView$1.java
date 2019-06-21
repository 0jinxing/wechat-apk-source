package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ShuffleView$1
  implements View.OnLayoutChangeListener
{
  ShuffleView$1(ShuffleView paramShuffleView)
  {
  }

  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    AppMethodBeat.i(42224);
    ShuffleView.a(this.nWl);
    paramView = this.nWl;
    for (paramInt1 = 0; paramInt1 < paramView.nWc; paramInt1++)
      paramView.W((View)paramView.nVP.get(paramInt1), paramInt1);
    this.nWl.removeOnLayoutChangeListener(this);
    AppMethodBeat.o(42224);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.1
 * JD-Core Version:    0.6.2
 */
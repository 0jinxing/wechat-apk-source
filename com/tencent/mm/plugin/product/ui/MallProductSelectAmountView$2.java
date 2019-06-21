package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductSelectAmountView$2
  implements View.OnClickListener
{
  MallProductSelectAmountView$2(MallProductSelectAmountView paramMallProductSelectAmountView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44096);
    if (MallProductSelectAmountView.a(this.pjl) - 1 < MallProductSelectAmountView.h(this.pjl))
    {
      if (MallProductSelectAmountView.c(this.pjl) != null)
        MallProductSelectAmountView.c(this.pjl).eZ(MallProductSelectAmountView.a(this.pjl), 2);
      AppMethodBeat.o(44096);
    }
    while (true)
    {
      return;
      MallProductSelectAmountView.i(this.pjl);
      if (MallProductSelectAmountView.f(this.pjl))
        MallProductSelectAmountView.g(this.pjl).setText(MallProductSelectAmountView.a(this.pjl));
      MallProductSelectAmountView.f(this.pjl);
      if (MallProductSelectAmountView.c(this.pjl) != null)
        MallProductSelectAmountView.c(this.pjl).gF(MallProductSelectAmountView.a(this.pjl));
      AppMethodBeat.o(44096);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectAmountView.2
 * JD-Core Version:    0.6.2
 */
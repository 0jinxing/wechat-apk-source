package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductSelectAmountView$1
  implements View.OnClickListener
{
  MallProductSelectAmountView$1(MallProductSelectAmountView paramMallProductSelectAmountView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44095);
    if (MallProductSelectAmountView.a(this.pjl) + 1 > MallProductSelectAmountView.b(this.pjl))
    {
      if (MallProductSelectAmountView.c(this.pjl) != null)
        MallProductSelectAmountView.c(this.pjl).eZ(MallProductSelectAmountView.a(this.pjl), MallProductSelectAmountView.d(this.pjl));
      AppMethodBeat.o(44095);
    }
    while (true)
    {
      return;
      MallProductSelectAmountView.e(this.pjl);
      if (MallProductSelectAmountView.f(this.pjl))
        MallProductSelectAmountView.g(this.pjl).setText(MallProductSelectAmountView.a(this.pjl));
      if (MallProductSelectAmountView.c(this.pjl) != null)
        MallProductSelectAmountView.c(this.pjl).gF(MallProductSelectAmountView.a(this.pjl));
      AppMethodBeat.o(44095);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectAmountView.1
 * JD-Core Version:    0.6.2
 */
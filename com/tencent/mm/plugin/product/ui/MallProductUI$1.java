package com.tencent.mm.plugin.product.ui;

import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductUI$1
  implements f.a
{
  MallProductUI$1(MallProductUI paramMallProductUI)
  {
  }

  public final void t(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(44157);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.pke.cu();
      if (MallProductUI.a(this.pke) == null)
        break label118;
      MallProductUI.a(this.pke).postDelayed(new MallProductUI.1.1(this), 200L);
      AppMethodBeat.o(44157);
    }
    while (true)
    {
      return;
      if (paramInt2 == -10010003)
      {
        this.pke.AM(0);
        MallProductUI.b(this.pke).setVisibility(8);
        MallProductUI.c(this.pke).setVisibility(0);
        MallProductUI.d(this.pke);
        AppMethodBeat.o(44157);
      }
      else
      {
        this.pke.UJ(paramString);
        label118: AppMethodBeat.o(44157);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.1
 * JD-Core Version:    0.6.2
 */
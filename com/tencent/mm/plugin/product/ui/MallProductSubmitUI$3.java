package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.k;
import com.tencent.mm.plugin.product.b.l;

final class MallProductSubmitUI$3
  implements View.OnClickListener
{
  MallProductSubmitUI$3(MallProductSubmitUI paramMallProductSubmitUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44141);
    paramView = MallProductSubmitUI.d(this.pjU);
    int i;
    if (paramView.piK.bZR())
      if (paramView.piK.bZI() == 0)
      {
        i = 1;
        if (i == 0)
          break label79;
        g.RQ();
        g.RO().eJo.a(new k(paramView.piK.bZT()), 0);
        AppMethodBeat.o(44141);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      label79: g.RQ();
      g.RO().eJo.a(new l(paramView.piK.bZT(), paramView.piK.getAppId()), 0);
      AppMethodBeat.o(44141);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSubmitUI.3
 * JD-Core Version:    0.6.2
 */
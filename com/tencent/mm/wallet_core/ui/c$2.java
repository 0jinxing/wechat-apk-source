package com.tencent.mm.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2
  implements View.OnClickListener
{
  c$2(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49228);
    ab.d("MicroMsg.OfflinePopupWindow", "on click know");
    this.Ahp.Ahn.setVisibility(8);
    paramView = new cm();
    paramView.cvK.cvL = 1;
    a.xxA.m(paramView);
    AppMethodBeat.o(49228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.c.2
 * JD-Core Version:    0.6.2
 */
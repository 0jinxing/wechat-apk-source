package com.tencent.mm.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.o;

final class c$3
  implements View.OnClickListener
{
  c$3(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49229);
    ab.d("MicroMsg.OfflinePopupWindow", "root on click");
    if ((this.Ahp.gKG != null) && (this.Ahp.gKG.isShowing()))
      this.Ahp.gKG.dismiss();
    AppMethodBeat.o(49229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.c.3
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.scanner.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.scanner.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;

final class p$2
  implements View.OnClickListener
{
  p$2(p paramp)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81201);
    if (this.qfp.qet == null)
    {
      ab.e("MicroMsg.scanner.ScanModeQRCode", "toMyQRCodeOnclickListener scanUICallback == null");
      AppMethodBeat.o(81201);
    }
    while (true)
    {
      return;
      h.pYm.e(11264, new Object[] { Integer.valueOf(3) });
      c.gkE.bi(this.qfp.qet.getContext());
      AppMethodBeat.o(81201);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.p.2
 * JD-Core Version:    0.6.2
 */
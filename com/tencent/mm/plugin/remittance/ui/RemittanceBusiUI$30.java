package com.tencent.mm.plugin.remittance.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.BusiRemittanceResp;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class RemittanceBusiUI$30
  implements Runnable
{
  RemittanceBusiUI$30(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44929);
    RemittanceBusiUI.u(this.pUd).setText(RemittanceBusiUI.t(this.pUd));
    String str1 = e.eK(e.mJ(RemittanceBusiUI.v(this.pUd)), 10);
    String str2 = str1;
    if (!bo.isNullOrNil(RemittanceBusiUI.w(this.pUd)))
      str2 = this.pUd.getString(2131302377, new Object[] { str1, RemittanceBusiUI.w(this.pUd) });
    RemittanceBusiUI.x(this.pUd).setText(j.b(this.pUd, str2, RemittanceBusiUI.x(this.pUd).getTextSize()));
    if (RemittanceBusiUI.i(this.pUd) != null)
      if (RemittanceBusiUI.i(this.pUd).pOx == 1)
        if (!bo.isNullOrNil(RemittanceBusiUI.i(this.pUd).pOy))
          if (RemittanceBusiUI.i(this.pUd).pOG == 1)
          {
            RemittanceBusiUI.y(this.pUd).setRoundCorner(true);
            int i = BackwardSupportUtil.b.b(this.pUd, 36.0F);
            RemittanceBusiUI.y(this.pUd).n(RemittanceBusiUI.i(this.pUd).pOy, i, i, -1);
            AppMethodBeat.o(44929);
          }
    while (true)
    {
      return;
      RemittanceBusiUI.y(this.pUd).setRoundCorner(false);
      break;
      if (!bo.isNullOrNil(RemittanceBusiUI.v(this.pUd)))
      {
        if (RemittanceBusiUI.i(this.pUd).pOG == 1)
        {
          a.b.r(RemittanceBusiUI.y(this.pUd), RemittanceBusiUI.v(this.pUd));
          AppMethodBeat.o(44929);
        }
        else
        {
          a.b.b(RemittanceBusiUI.y(this.pUd), RemittanceBusiUI.v(this.pUd));
          AppMethodBeat.o(44929);
          continue;
          RemittanceBusiUI.y(this.pUd).setVisibility(8);
          AppMethodBeat.o(44929);
        }
      }
      else
      {
        RemittanceBusiUI.y(this.pUd).setVisibility(8);
        AppMethodBeat.o(44929);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.30
 * JD-Core Version:    0.6.2
 */
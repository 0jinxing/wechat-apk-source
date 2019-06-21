package com.tencent.mm.plugin.remittance.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.model.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.s;

final class RemittanceBusiUI$27 extends s
{
  RemittanceBusiUI$27(RemittanceBusiUI paramRemittanceBusiUI)
  {
  }

  public final void bgW()
  {
    AppMethodBeat.i(44926);
    h.pYm.e(15235, new Object[] { Integer.valueOf(5) });
    if (!RemittanceBusiUI.k(this.pUd))
      RemittanceBusiUI.a(this.pUd, RemittanceBusiUI.n(this.pUd));
    if (RemittanceBusiUI.o(this.pUd) <= 0.0D)
    {
      t.makeText(this.pUd.mController.ylL, 2131304579, 0).show();
      AppMethodBeat.o(44926);
    }
    while (true)
    {
      return;
      g localg = this.pUd.pTP;
      if (this.pUd.pTP == null);
      for (String str = ""; ; str = this.pUd.pTP.pOO)
      {
        ab.i("MicroMsg.RemittanceBusiUI", "mPayBtn onClick %s  isFinish:%s getFavorFlag: %s", new Object[] { localg, str, Boolean.valueOf(this.pUd.pTM) });
        if (RemittanceBusiUI.h(this.pUd) != 32)
          break label322;
        if (!this.pUd.pTM)
          break label307;
        if ((this.pUd.pTP == null) || (this.pUd.pTP.pOR != (int)(RemittanceBusiUI.o(this.pUd) * 100.0D)))
          break label283;
        if ((this.pUd.pTP != null) && (this.pUd.pTP.pOO))
          break label322;
        if (this.pUd.pTP == null)
          break label329;
        this.pUd.pTP.pOM = new RemittanceBusiUI.27.1(this);
        AppMethodBeat.o(44926);
        break;
      }
      label283: RemittanceBusiUI.a(this.pUd, new RemittanceBusiUI.27.2(this), 0);
      AppMethodBeat.o(44926);
      continue;
      label307: RemittanceBusiUI.p(this.pUd);
      AppMethodBeat.o(44926);
      continue;
      label322: RemittanceBusiUI.p(this.pUd);
      label329: AppMethodBeat.o(44926);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.27
 * JD-Core Version:    0.6.2
 */
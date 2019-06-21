package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.collect.model.m;
import com.tencent.mm.plugin.collect.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class CollectCreateQRCodeUI$3
  implements View.OnClickListener
{
  CollectCreateQRCodeUI$3(CollectCreateQRCodeUI paramCollectCreateQRCodeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41232);
    double d = bo.getDouble(CollectCreateQRCodeUI.a(this.kGc).getText(), 0.0D);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
    ab.i("MicroMsg.CollectCreateQRCodeUI", "wallet region: %s", new Object[] { Integer.valueOf(i) });
    if (!CollectCreateQRCodeUI.a(this.kGc).asa())
    {
      t.makeText(this.kGc.mController.ylL, 2131304579, 0).show();
      AppMethodBeat.o(41232);
    }
    while (true)
    {
      return;
      if (d < 0.01D)
      {
        t.makeText(this.kGc.mController.ylL, 2131302360, 0).show();
        AppMethodBeat.o(41232);
      }
      else if (i == 8)
      {
        this.kGc.a(new m(Math.round(d * 100.0D), CollectCreateQRCodeUI.b(this.kGc), r.YG()), true, false);
        AppMethodBeat.o(41232);
      }
      else
      {
        this.kGc.a(new s(d, "1", CollectCreateQRCodeUI.b(this.kGc)), true, true);
        AppMethodBeat.o(41232);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeUI.3
 * JD-Core Version:    0.6.2
 */
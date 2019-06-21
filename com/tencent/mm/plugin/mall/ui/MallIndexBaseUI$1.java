package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;

final class MallIndexBaseUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MallIndexBaseUI$1(MallIndexBaseUI paramMallIndexBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(43165);
    paramMenuItem = new Intent();
    paramMenuItem.addFlags(67108864);
    paramMenuItem.putExtra("preferred_tab", 3);
    d.f(this.omG, "com.tencent.mm.ui.LauncherUI", paramMenuItem);
    this.omG.finish();
    if (!f.dlH())
    {
      h.pYm.e(14954, new Object[] { f.dlI(), "open_wcpay_specific_view:ok" });
      f.dlJ();
    }
    h.pYm.e(14419, new Object[] { this.omG.eCq, Integer.valueOf(6) });
    ab.i("MicroMsg.MallIndexBaseUI", "set BackBtn");
    AppMethodBeat.o(43165);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexBaseUI.1
 * JD-Core Version:    0.6.2
 */
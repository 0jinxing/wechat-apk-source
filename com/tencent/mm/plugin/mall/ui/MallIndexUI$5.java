package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.uq.b;
import com.tencent.mm.plugin.report.service.h;

final class MallIndexUI$5
  implements MenuItem.OnMenuItemClickListener
{
  MallIndexUI$5(MallIndexUI paramMallIndexUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(43209);
    h.pYm.e(14872, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "", "", Integer.valueOf(0) });
    h.pYm.e(16500, new Object[] { Integer.valueOf(3) });
    paramMenuItem = this.onu;
    boolean bool = MallIndexUI.e(this.onu).cRa;
    Intent localIntent = new Intent();
    localIntent.putExtra("key_default_show_currency", bool);
    d.b(paramMenuItem, "wallet", ".pwd.ui.WalletPasswordSettingUI", localIntent);
    AppMethodBeat.o(43209);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.5
 * JD-Core Version:    0.6.2
 */
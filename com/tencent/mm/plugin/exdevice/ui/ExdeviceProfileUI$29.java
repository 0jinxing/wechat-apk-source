package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.b.c;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class ExdeviceProfileUI$29
  implements n.d
{
  ExdeviceProfileUI$29(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(20057);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 0:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(20057);
      while (true)
      {
        return;
        com.tencent.mm.plugin.sport.a.d.kT(27);
        ExdeviceProfileUI.r(this.lCu);
        AppMethodBeat.o(20057);
        continue;
        com.tencent.mm.plugin.sport.a.d.kT(26);
        ExdeviceProfileUI.s(this.lCu);
        AppMethodBeat.o(20057);
        continue;
        ExdeviceProfileUI.t(this.lCu);
        AppMethodBeat.o(20057);
        continue;
        h.a(this.lCu.mController.ylL, this.lCu.getString(2131299398), null, true, new ExdeviceProfileUI.29.1(this), null);
        AppMethodBeat.o(20057);
        continue;
        ExdeviceProfileUI.b(this.lCu, true);
        com.tencent.mm.plugin.sport.a.d.kT(10);
        ad.bpe();
        c.d("", ExdeviceProfileUI.w(this.lCu), ExdeviceProfileUI.u(this.lCu), 3);
        AppMethodBeat.o(20057);
      }
      com.tencent.mm.plugin.sport.a.d.kT(41);
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("rawUrl", ExdeviceProfileUI.o(this.lCu));
      com.tencent.mm.bp.d.b(this.lCu, "webview", ".ui.tools.WebViewUI", paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.29
 * JD-Core Version:    0.6.2
 */
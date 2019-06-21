package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.e;
import com.tencent.mm.bp.d;
import com.tencent.mm.r.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class SelfQRCodeUI$9
  implements n.d
{
  SelfQRCodeUI$9(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(127021);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(127021);
      while (true)
      {
        return;
        SelfQRCodeUI.e(this.qly);
        AppMethodBeat.o(127021);
        continue;
        SelfQRCodeUI.a(this.qly, 0);
        AppMethodBeat.o(127021);
        continue;
        if ((a.bI(this.qly.mController.ylL)) || (e.akI()))
          break;
        d.H(this.qly.mController.ylL, "scanner", ".ui.BaseScanUI");
        AppMethodBeat.o(127021);
      }
      SelfQRCodeUI.f(this.qly);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.9
 * JD-Core Version:    0.6.2
 */
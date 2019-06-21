package com.tencent.mm.plugin.aa.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.v;
import com.tencent.mm.ui.widget.a.d;

final class PaylistAAUI$13
  implements MenuItem.OnMenuItemClickListener
{
  PaylistAAUI$13(PaylistAAUI paramPaylistAAUI, v paramv)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(40881);
    paramMenuItem = new d(this.gpC, 1, false);
    paramMenuItem.rBl = new PaylistAAUI.13.1(this);
    paramMenuItem.rBm = new PaylistAAUI.13.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(40881);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI.13
 * JD-Core Version:    0.6.2
 */
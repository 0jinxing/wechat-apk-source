package com.tencent.mm.plugin.account.security.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.security.a.b;

final class MySafeDeviceListUI$2
  implements DialogInterface.OnCancelListener
{
  MySafeDeviceListUI$2(MySafeDeviceListUI paramMySafeDeviceListUI, b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(69873);
    g.Rg().c(this.gzD);
    AppMethodBeat.o(69873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI.2
 * JD-Core Version:    0.6.2
 */
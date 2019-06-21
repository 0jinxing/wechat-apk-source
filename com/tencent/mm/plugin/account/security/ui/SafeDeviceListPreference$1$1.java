package com.tencent.mm.plugin.account.security.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.security.a.a;

final class SafeDeviceListPreference$1$1
  implements DialogInterface.OnCancelListener
{
  SafeDeviceListPreference$1$1(SafeDeviceListPreference.1 param1, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(69892);
    g.Rg().c(this.gzM);
    SafeDeviceListPreference.c(this.gzN.gzL);
    AppMethodBeat.o(69892);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference.1.1
 * JD-Core Version:    0.6.2
 */
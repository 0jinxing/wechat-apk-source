package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandProcessProxyUI$2
  implements Runnable
{
  AppBrandProcessProxyUI$2(Class paramClass, Context paramContext, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73125);
    if ((AppBrandProcessProxyUI.class != this.hvb) && ((this.hvc instanceof Activity)))
    {
      ((Activity)this.hvc).startActivityForResult(this.hvd, 0);
      AppMethodBeat.o(73125);
    }
    while (true)
    {
      return;
      this.hvc.startActivity(this.hvd);
      AppMethodBeat.o(73125);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.2
 * JD-Core Version:    0.6.2
 */
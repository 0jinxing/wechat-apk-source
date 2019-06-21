package com.tencent.mm.plugin.appbrand.ui;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;

final class AppBrandProfileUI$4$1
  implements Runnable
{
  AppBrandProfileUI$4$1(AppBrandProfileUI.4 param4, u paramu, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133028);
    AppBrandProfileUI.a(this.iIj.iIf, this.iIh, this.iIi);
    if ((this.iIj.iIg) && (!this.iIj.iIf.isFinishing()) && (!this.iIj.iIf.uiu))
      p.ayH().a(this.iIj.iIf, e.aNS().oAl.getLooper());
    AppMethodBeat.o(133028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.4.1
 * JD-Core Version:    0.6.2
 */
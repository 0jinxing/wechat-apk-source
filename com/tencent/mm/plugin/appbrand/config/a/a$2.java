package com.tencent.mm.plugin.appbrand.config.a;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements b.a
{
  a$2(a parama, a.d paramd, Activity paramActivity)
  {
  }

  public final void ayR()
  {
    AppMethodBeat.i(86905);
    ab.e("MicroMsg.AppBrandDeviceOrientationHandler", "hy: activity not turn to correct orientation for long time");
    if (this.hiJ.hiS != null)
      this.hiJ.hiS.a(this.hiJ.hiT, false);
    AppMethodBeat.o(86905);
  }

  public final void ayS()
  {
    AppMethodBeat.i(86906);
    ab.d("MicroMsg.AppBrandDeviceOrientationHandler", "hy: trigger retry");
    if (!this.val$activity.isDestroyed())
      a.b(this.val$activity, this.hiJ.hiT.hiQ);
    AppMethodBeat.o(86906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.a.2
 * JD-Core Version:    0.6.2
 */
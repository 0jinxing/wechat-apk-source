package com.tencent.mm.plugin.appbrand;

import android.widget.FrameLayout;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.LinkedList;

final class k$7
  implements Runnable
{
  k$7(k paramk, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86716);
    d.i("MicroMsg.AppBrandRuntimeContainer", "dl: removeImpl, cleanupOut.run(), appId[%s]", new Object[] { this.gON.mAppId });
    this.gON.cleanup();
    this.gOH.gOA.removeView(this.gON.gNE);
    this.gOH.gOC.remove(this.gON.mAppId);
    this.gOH.gOB.remove(this.gON);
    AppMethodBeat.o(86716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k.7
 * JD-Core Version:    0.6.2
 */
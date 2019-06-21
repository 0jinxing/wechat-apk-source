package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;

final class g$30
  implements Runnable
{
  g$30(g paramg, int paramInt1, double paramDouble1, double paramDouble2, String paramString, int paramInt2)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(9080);
    int j = i;
    j localj;
    Context localContext;
    int k;
    double d1;
    double d2;
    Object localObject;
    int m;
    g.30.1 local1;
    if (g.i(this.uHd) != null)
    {
      j = i;
      if ((g.i(this.uHd) instanceof Activity))
      {
        j = i;
        if (!((Activity)g.i(this.uHd)).isFinishing())
        {
          localj = g.J(this.uHd);
          localContext = g.i(this.uHd);
          k = this.uHB;
          d1 = this.fBX;
          d2 = this.fBY;
          localObject = this.uHC;
          m = this.uHD;
          local1 = new g.30.1(this);
          j = i;
          if (localContext != null)
          {
            j = i;
            if ((localContext instanceof MMActivity))
            {
              if (!((MMActivity)localContext).isFinishing())
                break label199;
              j = i;
            }
          }
        }
      }
    }
    if (j == 0)
    {
      localObject = g.b(this.uHd, this.uHD);
      if ((((g.c)localObject).umI != null) && (((g.c)localObject).uGd != null))
        g.a(this.uHd, ((g.c)localObject).umI, ((g.c)localObject).uGd, "openMapNavigateMenu:fail");
    }
    AppMethodBeat.o(9080);
    return;
    label199: localj.unO = m;
    localj.uIK = true;
    localj.uIL = k;
    localj.uIN = new j.e(d1, d2, (byte)0);
    localj.uIO = ((String)localObject);
    localj.aIq = new WeakReference(localContext);
    localj.uIP = local1;
    localj.fwu = null;
    if (localj.fwu == null)
      localj.dcP();
    while (true)
    {
      j = 1;
      break;
      localj.uIS = new j.2(localj);
      if (localj.nOO != null)
      {
        localj.uIR = new j.3(localj);
        localj.nOO.a(localj.uIN.latitude, localj.uIN.longitude, localj.uIR);
      }
      al.d(new j.4(localj));
      localj.fwu.b(localj.uIS);
      al.n(localj.uIT, 4000L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.30
 * JD-Core Version:    0.6.2
 */
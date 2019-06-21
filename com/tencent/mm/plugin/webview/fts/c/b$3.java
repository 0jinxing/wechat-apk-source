package com.tencent.mm.plugin.webview.fts.c;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar;
import com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.lang.ref.WeakReference;

final class b$3
  implements b.a
{
  b$3(b paramb, FtsWebVideoView paramFtsWebVideoView)
  {
  }

  public final void aDI()
  {
    AppMethodBeat.i(5936);
    com.tencent.mm.plugin.webview.fts.ui.b localb = this.uhD.uhA;
    Object localObject1 = localb.IC(localb.iuy);
    float[] arrayOfFloat = localb.iuv;
    if ((localObject1 == null) || (((com.tencent.mm.plugin.webview.fts.ui.b.a)localObject1).iuM == null) || (arrayOfFloat == null))
      AppMethodBeat.o(5936);
    while (true)
    {
      return;
      localObject1 = (View)((com.tencent.mm.plugin.webview.fts.ui.b.a)localObject1).iuM.get();
      if (localObject1 != null)
      {
        if (localb.iuy != localb.iuu)
        {
          Object localObject2 = localb.IC(localb.iuu);
          if ((localObject2 != null) && (((com.tencent.mm.plugin.webview.fts.ui.b.a)localObject2).iuM != null))
          {
            localObject2 = (View)((com.tencent.mm.plugin.webview.fts.ui.b.a)localObject2).iuM.get();
            if (localObject2 != null)
              localb.a(localb.iuu, arrayOfFloat, ((View)localObject2).getVisibility());
          }
        }
        int i = localb.iuy;
        localb.iuu = -1;
        localb.iuy = -1;
        if (localb.uhu != null)
        {
          localb.uhu.aDI();
          localb.uhu = null;
        }
        localb.a(i, arrayOfFloat, ((View)localObject1).getVisibility());
      }
      AppMethodBeat.o(5936);
    }
  }

  public final void cWy()
  {
    AppMethodBeat.i(5938);
    FtsWebVideoView localFtsWebVideoView = this.uhC;
    if ((!localFtsWebVideoView.eif) && (localFtsWebVideoView.getSystemVolume() == 0))
      localFtsWebVideoView.setMute(true);
    AppMethodBeat.o(5938);
  }

  public final void cWz()
  {
    AppMethodBeat.i(5939);
    FtsWebVideoView localFtsWebVideoView = this.uhC;
    if ((localFtsWebVideoView.eif) && (localFtsWebVideoView.getSystemVolume() > 0))
      localFtsWebVideoView.setMute(false);
    AppMethodBeat.o(5939);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(5935);
    FtsWebVideoView localFtsWebVideoView = this.uhC;
    ab.i("MicroMsg.FtsWebVideoView", "onUIDestroy");
    ab.i("MicroMsg.FtsWebVideoView", "clean");
    localFtsWebVideoView.stop();
    localFtsWebVideoView.ugP.aEX();
    WebSearchWebVideoViewControlBar localWebSearchWebVideoViewControlBar = localFtsWebVideoView.ugQ;
    if (localWebSearchWebVideoViewControlBar.hZL != null)
      localWebSearchWebVideoViewControlBar.hZL.stopTimer();
    if (localWebSearchWebVideoViewControlBar.hZK != null)
      localWebSearchWebVideoViewControlBar.hZK.stopTimer();
    try
    {
      localFtsWebVideoView.getContext().unregisterReceiver(localFtsWebVideoView.uhk);
      AppMethodBeat.o(5935);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(5935);
    }
  }

  public final void wU()
  {
    AppMethodBeat.i(5933);
    FtsWebVideoView localFtsWebVideoView = this.uhC;
    ab.i("MicroMsg.FtsWebVideoView", "onUIResume");
    localFtsWebVideoView.ugP.akW();
    AppMethodBeat.o(5933);
  }

  public final void wW()
  {
    AppMethodBeat.i(5934);
    FtsWebVideoView localFtsWebVideoView = this.uhC;
    ab.i("MicroMsg.FtsWebVideoView", "onUIPause");
    localFtsWebVideoView.ugP.akV();
    AppMethodBeat.o(5934);
  }

  public final boolean wY()
  {
    boolean bool = false;
    AppMethodBeat.i(5937);
    if (this.uhC.aFb())
    {
      this.uhC.nH(false);
      bool = true;
      AppMethodBeat.o(5937);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(5937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.c.b.3
 * JD-Core Version:    0.6.2
 */
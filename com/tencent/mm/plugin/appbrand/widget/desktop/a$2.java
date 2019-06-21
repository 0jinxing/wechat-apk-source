package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.b.c;
import com.tencent.mm.plugin.appbrand.widget.desktop.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133666);
    Object localObject1;
    Object localObject2;
    double d;
    if (c.jbx.eCM)
    {
      ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo doStop performanceMonitor");
      localObject1 = c.jbx;
      ((c)localObject1).frameStartTime = 0L;
      ((c)localObject1).eCJ = 0;
      ((c)localObject1).eCM = false;
      ab.i("MicroMsg.Metronome", "[stop] stack:%s", new Object[] { bo.dpG() });
      ((c)localObject1).bsZ.removeFrameCallback((Choreographer.FrameCallback)localObject1);
      d.jbz.Pz();
      localObject1 = (com.tencent.mm.plugin.appbrand.widget.desktop.b.b)d.jbz.eCQ.get(Integer.valueOf(1));
      if (!(localObject1 instanceof com.tencent.mm.plugin.appbrand.widget.desktop.b.a))
        break label347;
      ((com.tencent.mm.plugin.appbrand.widget.desktop.b.b)localObject1).Pw();
      localObject1 = (com.tencent.mm.plugin.appbrand.widget.desktop.b.a)localObject1;
      if (localObject1 != null)
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo doStop performanceMonitor dump fps, max: %f, min: %f, average: %f", new Object[] { Double.valueOf(((com.tencent.mm.plugin.appbrand.widget.desktop.b.a)localObject1).jbw), Double.valueOf(((com.tencent.mm.plugin.appbrand.widget.desktop.b.a)localObject1).jbv), Double.valueOf(((com.tencent.mm.plugin.appbrand.widget.desktop.b.a)localObject1).jbu) });
        localObject2 = com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZg;
        d = ((com.tencent.mm.plugin.appbrand.widget.desktop.b.a)localObject1).jbu;
        ab.i("MicroMsg.DynamicBackgroundConfig", "alvinluo adjustDynamicBackgroundDrawFps currentDrawFps: %d, appFps: %f", new Object[] { Integer.valueOf(com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZd), Double.valueOf(d) });
        if (d < 45.0D)
          break label383;
        b.eT(true);
        if (d < 55.0D)
          break label352;
        com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZd = 20;
      }
    }
    while (true)
    {
      com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZf = (int)d;
      localObject1 = ah.doB();
      if (localObject1 != null)
      {
        localObject2 = ((SharedPreferences)localObject1).edit();
        if (localObject2 != null)
        {
          localObject2 = ((SharedPreferences.Editor)localObject2).putInt("current_draw_fps", com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZd);
          if (localObject2 != null)
            ((SharedPreferences.Editor)localObject2).apply();
        }
      }
      if (localObject1 != null)
      {
        localObject1 = ((SharedPreferences)localObject1).edit();
        if (localObject1 != null)
        {
          localObject1 = ((SharedPreferences.Editor)localObject1).putInt("current_app_fps", (int)d);
          if (localObject1 != null)
            ((SharedPreferences.Editor)localObject1).apply();
        }
      }
      ab.i("MicroMsg.DynamicBackgroundConfig", "alvinluo adjustDynamicBackgroundDrawFps appFps: %f, FRAME_PER_SECOND: %d", new Object[] { Double.valueOf(d), Integer.valueOf(com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZd) });
      com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.aPB();
      d.jbz.release();
      al.d(new a.2.1(this));
      AppMethodBeat.o(133666);
      return;
      label347: localObject1 = null;
      break;
      label352: if (d >= 50.0D)
      {
        com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZd = 15;
      }
      else if (d >= 45.0D)
      {
        com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZd = 5;
        continue;
        label383: if (com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZd == 2)
        {
          ab.i("MicroMsg.DynamicBackgroundConfig", "alvinluo adjustDynamicBackgroundDrawFps disable DynamicBackground");
          b.eT(false);
        }
        else
        {
          com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZd = 2;
          b.eT(true);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.2
 * JD-Core Version:    0.6.2
 */
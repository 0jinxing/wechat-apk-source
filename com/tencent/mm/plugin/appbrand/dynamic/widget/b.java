package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MDrawableView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MHardwareAccelerateDrawableView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MSurfaceView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MTextureView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.c;
import java.util.Map;

public final class b
{
  private static volatile boolean eIC = false;
  private static volatile int hpA = 0;

  public static int aAl()
  {
    return hpA;
  }

  public static String aAm()
  {
    String str;
    switch (hpA)
    {
    default:
      str = "MHADrawableView";
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return str;
      str = "MTextureView";
      continue;
      str = "MSurfaceView";
      continue;
      str = "MCanvasView";
      continue;
      str = "MDrawableView";
    }
  }

  public static View bS(Context paramContext)
  {
    AppMethodBeat.i(11120);
    if (!eIC)
      initialize();
    ab.d("MicroMsg.WidgetDrawableViewFactory", "inflate(mode : %d)", new Object[] { Integer.valueOf(hpA) });
    switch (hpA)
    {
    default:
      paramContext = new MHardwareAccelerateDrawableView(paramContext);
      paramContext.getDrawContext().hcK = com.tencent.mm.plugin.appbrand.dynamic.b.b.azO();
      paramContext.setDrawActionReportable(new b.6(paramContext));
      AppMethodBeat.o(11120);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramContext;
      paramContext = new MTextureView(paramContext);
      paramContext.getDrawContext().hcK = com.tencent.mm.plugin.appbrand.dynamic.b.b.azO();
      paramContext.setDrawActionReportable(new b.2(paramContext));
      AppMethodBeat.o(11120);
      continue;
      paramContext = new MSurfaceView(paramContext);
      paramContext.getDrawContext().hcK = com.tencent.mm.plugin.appbrand.dynamic.b.b.azO();
      paramContext.setDrawActionReportable(new b.3(paramContext));
      AppMethodBeat.o(11120);
      continue;
      paramContext = new MCanvasView(paramContext);
      paramContext.getDrawContext().hcK = com.tencent.mm.plugin.appbrand.dynamic.b.b.azO();
      paramContext.setDrawActionReportable(new b.4(paramContext));
      AppMethodBeat.o(11120);
      continue;
      paramContext = new MDrawableView(paramContext);
      paramContext.getDrawContext().hcK = com.tencent.mm.plugin.appbrand.dynamic.b.b.azO();
      paramContext.setDrawActionReportable(new b.5(paramContext));
      AppMethodBeat.o(11120);
    }
  }

  public static void initialize()
  {
    AppMethodBeat.i(11119);
    com.tencent.mm.ce.a.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(11088);
        Object localObject = a.b.eGM;
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.ll("100284");
        if (localObject == null)
        {
          ab.i("MicroMsg.WidgetDrawableViewFactory", "widget canvas mode ABTest item is null.");
          AppMethodBeat.o(11088);
        }
        while (true)
        {
          return;
          if (!((c)localObject).isValid())
          {
            b.nR(0);
            AppMethodBeat.o(11088);
          }
          else
          {
            try
            {
              b.nR(bo.getInt((String)((c)localObject).dru().get("mode"), 0));
              ab.i("MicroMsg.WidgetDrawableViewFactory", "current canvas mode is : %d", new Object[] { Integer.valueOf(b.hpA) });
              AppMethodBeat.o(11088);
            }
            catch (Exception localException)
            {
              ab.w("MicroMsg.WidgetDrawableViewFactory", "parse widget canvas mode error : %s", new Object[] { Log.getStackTraceString(localException) });
              AppMethodBeat.o(11088);
            }
          }
        }
      }
    });
    AppMethodBeat.o(11119);
  }

  public static void nR(int paramInt)
  {
    hpA = paramInt;
    eIC = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.b
 * JD-Core Version:    0.6.2
 */
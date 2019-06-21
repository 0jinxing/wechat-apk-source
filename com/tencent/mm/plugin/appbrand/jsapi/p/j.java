package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.permission.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView.d;

public final class j
  implements a
{
  private static boolean aER()
  {
    boolean bool = true;
    AppMethodBeat.i(131436);
    if (MMWebView.getUsingTbsCoreVersion(com.tencent.mm.sdk.platformtools.ah.getContext()) >= 36867)
      AppMethodBeat.o(131436);
    while (true)
    {
      return bool;
      if (MMWebView.getCurWebType() == WebView.d.ANb)
      {
        AppMethodBeat.o(131436);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(131436);
      }
    }
  }

  public final boolean a(c paramc, com.tencent.mm.plugin.appbrand.jsapi.ah paramah)
  {
    AppMethodBeat.i(131435);
    boolean bool;
    if (!paramc.isRunning())
    {
      bool = false;
      if (!bool)
        break label101;
      bool = true;
      AppMethodBeat.o(131435);
    }
    while (true)
    {
      return bool;
      if (!(paramc instanceof h))
      {
        ab.e("MicroMsg.SensorJsEventControllerWx", "hasPermission AppBrandComponentWithExtra");
        bool = false;
        break;
      }
      h localh = (h)paramc;
      if (!(localh.getRuntime() instanceof o))
      {
        ab.e("MicroMsg.SensorJsEventControllerWx", "hasPermission not AppBrandRuntimeWC");
        bool = false;
        break;
      }
      bool = ((o)localh.getRuntime()).xY().a(paramc, paramah);
      break;
      label101: AppMethodBeat.o(131435);
      bool = false;
    }
  }

  public final int aEN()
  {
    AppMethodBeat.i(131433);
    int i;
    if (aER())
    {
      i = 5;
      AppMethodBeat.o(131433);
    }
    while (true)
    {
      return i;
      i = 20;
      AppMethodBeat.o(131433);
    }
  }

  public final int aEO()
  {
    AppMethodBeat.i(131434);
    int i;
    if (aER())
    {
      i = 20;
      AppMethodBeat.o(131434);
    }
    while (true)
    {
      return i;
      i = 200;
      AppMethodBeat.o(131434);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.j
 * JD-Core Version:    0.6.2
 */
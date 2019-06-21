package com.tencent.mm.plugin.appbrand.widget.i;

import a.f.b.j;
import a.k.m;
import a.l;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/tabbar/IconLoaderManager;", "", "()V", "iconLoaderMap", "Ljava/util/HashMap;", "", "Lcom/tencent/mm/plugin/appbrand/widget/tabbar/IconLoader;", "Lkotlin/collections/HashMap;", "getIconLoaderInner", "iconPath", "", "errorHandler", "Lcom/tencent/mm/plugin/appbrand/widget/tabbar/IconLoadErrorHandler;", "service", "Lcom/tencent/mm/plugin/appbrand/AppBrandService;", "getSpecificLoader", "index", "isPackageIcon", "", "luggage-wxa-app_release"})
public final class f
{
  final HashMap<Integer, d> jpy;

  public f()
  {
    AppMethodBeat.i(87611);
    this.jpy = new HashMap();
    AppMethodBeat.o(87611);
  }

  private static boolean EW(String paramString)
  {
    AppMethodBeat.i(87610);
    boolean bool;
    if ((m.jc(paramString, ".png")) || (m.jc(paramString, ".jpg")) || (m.jc(paramString, ".bmp")) || (m.jc(paramString, ".gif")))
    {
      bool = true;
      AppMethodBeat.o(87610);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87610);
    }
  }

  private static d a(String paramString, c paramc, q paramq)
  {
    AppMethodBeat.i(87609);
    int i;
    if ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString)))
    {
      i = 1;
      if (1 != i)
        break label52;
      paramString = (d)new g(paramString, paramc, paramq);
      AppMethodBeat.o(87609);
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label52: if (true == m.jb(paramString, "wxfile://"))
      {
        paramString = (d)new i(paramString, paramc, paramq);
        AppMethodBeat.o(87609);
      }
      else if (true == EW(paramString))
      {
        paramString = (d)new h(paramString, paramc, paramq);
        AppMethodBeat.o(87609);
      }
      else
      {
        paramString = (d)new b(paramString, paramc);
        AppMethodBeat.o(87609);
      }
    }
  }

  public final d a(String paramString, c paramc, q paramq, int paramInt)
  {
    AppMethodBeat.i(87608);
    j.p(paramString, "iconPath");
    j.p(paramc, "errorHandler");
    j.p(paramq, "service");
    paramString = a(paramString, paramc, paramq);
    paramString.setIndex(paramInt);
    paramString.a((d.a)new f.a(this));
    paramc = (d)this.jpy.get(Integer.valueOf(paramInt));
    if (paramc != null)
      paramc.cancel();
    ((Map)this.jpy).put(Integer.valueOf(paramInt), paramString);
    AppMethodBeat.o(87608);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.f
 * JD-Core Version:    0.6.2
 */
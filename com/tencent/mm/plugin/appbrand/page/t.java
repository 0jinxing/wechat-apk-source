package com.tencent.mm.plugin.appbrand.page;

import a.f.b.j;
import a.l;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.k;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageTrimLogic;", "", "()V", "TAG", "", "mCanTrim", "", "canTrimThisPage", "page", "Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;", "canTrimThisPageWrapped", "getTrimPages", "Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageTrimLogic$RuntimeTrimmedPages;", "runtime", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "onPageReload", "", "setCanTrim", "can", "RuntimeTrimmedPages", "luggage-wechat-full-sdk_release"})
public final class t
{
  private static boolean isA;
  public static final t isB;

  static
  {
    AppMethodBeat.i(102480);
    isB = new t();
    isA = true;
    AppMethodBeat.o(102480);
  }

  private static t.a B(i parami)
  {
    AppMethodBeat.i(102479);
    t.a locala = (t.a)parami.ab(t.a.class);
    if (locala == null)
    {
      locala = new t.a();
      parami.a((k)locala);
    }
    for (parami = locala; ; parami = locala)
    {
      AppMethodBeat.o(102479);
      return parami;
    }
  }

  public static final void d(u paramu)
  {
    AppMethodBeat.i(102477);
    j.p(paramu, "page");
    if (paramu.getRuntime() == null)
      AppMethodBeat.o(102477);
    while (true)
    {
      return;
      try
      {
        i locali = paramu.getRuntime();
        j.o(locali, "page.runtime");
        B(locali).remove(paramu);
        AppMethodBeat.o(102477);
      }
      catch (Exception paramu)
      {
        d.w("Luggage.AppBrandPageTrimLogic[wxa_reload]", "onPageReload ".concat(String.valueOf(paramu)));
        AppMethodBeat.o(102477);
      }
    }
  }

  public static final boolean e(u paramu)
  {
    boolean bool1 = false;
    AppMethodBeat.i(102478);
    j.p(paramu, "page");
    try
    {
      bool2 = isA;
      if (!bool2)
        bool2 = bool1;
      while (true)
      {
        AppMethodBeat.o(102478);
        return bool2;
        bool2 = bool1;
        if (!paramu.atU())
        {
          localObject = paramu.getRuntime();
          if ((localObject == null) || (((i)localObject).atr() != true))
            break;
          bool2 = true;
        }
      }
      Object localObject = paramu.getRuntime();
      if (localObject != null)
      {
        localObject = ((i)localObject).asV();
        if (localObject == null);
      }
      for (int i = ((q)localObject).getPageCount(); ; i = 0)
      {
        bool2 = bool1;
        if (i <= 5)
          break;
        localObject = paramu.aJv();
        bool2 = bool1;
        if (localObject == null)
          break;
        bool2 = bool1;
        if (((n)localObject).isInBackground() != true)
          break;
        bool2 = bool1;
        if ((paramu.aJv() instanceof g))
          break;
        bool2 = bool1;
        if (paramu.getRuntime() == null)
          break;
        localObject = paramu.getRuntime();
        j.o(localObject, "page.runtime");
        localObject = B((i)localObject);
        bool2 = bool1;
        if (((t.a)localObject).size() >= 2)
          break;
        ((t.a)localObject).add(paramu);
        bool2 = true;
        break;
      }
    }
    catch (Exception paramu)
    {
      while (true)
      {
        d.w("Luggage.AppBrandPageTrimLogic[wxa_reload]", "canTrimThisPAge ".concat(String.valueOf(paramu)));
        boolean bool2 = bool1;
      }
    }
  }

  public static final void ev(boolean paramBoolean)
  {
    isA = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.t
 * JD-Core Version:    0.6.2
 */
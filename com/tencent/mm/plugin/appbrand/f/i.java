package com.tencent.mm.plugin.appbrand.f;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

 enum i
{
  private static final a hpZ;

  static
  {
    AppMethodBeat.i(129991);
    hqa = new i[0];
    hpZ = new a();
    AppMethodBeat.o(129991);
  }

  static AppBrandRecentTaskInfo An(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(129988);
    if (f.auT() == null)
    {
      AppMethodBeat.o(129988);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = f.auT().yw(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(129988);
        paramString = localObject;
      }
      else if ((paramString.xy()) && (com.tencent.mm.modelappbrand.a.abu()))
      {
        AppMethodBeat.o(129988);
        paramString = localObject;
      }
      else
      {
        AppMethodBeat.o(129988);
      }
    }
  }

  static List<AppBrandRecentTaskInfo> aAr()
  {
    AppMethodBeat.i(129987);
    LinkedList localLinkedList = new LinkedList();
    Object localObject;
    if (f.auT() != null)
    {
      localObject = f.auT().axJ();
      if (!bo.ek((List)localObject))
        localLinkedList.addAll((Collection)localObject);
    }
    if (com.tencent.mm.modelappbrand.a.abu())
    {
      localObject = localLinkedList.iterator();
      while (((Iterator)localObject).hasNext())
        if (((AppBrandRecentTaskInfo)((Iterator)localObject).next()).xy())
          ((Iterator)localObject).remove();
    }
    AppMethodBeat.o(129987);
    return localLinkedList;
  }

  static void e(k.a parama)
  {
    AppMethodBeat.i(129989);
    if (f.auT() != null)
      f.auT().c(parama);
    AppMethodBeat.o(129989);
  }

  static void f(k.a parama)
  {
    AppMethodBeat.i(129990);
    if (f.auT() != null)
      f.auT().d(parama);
    AppMethodBeat.o(129990);
  }

  static void onCreate()
  {
    AppMethodBeat.i(129985);
    p.ayH().a(hpZ, e.aNS().oAl.getLooper());
    AppMethodBeat.o(129985);
  }

  static void onDestroy()
  {
    AppMethodBeat.i(129986);
    p.ayH().d(hpZ);
    AppMethodBeat.o(129986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.i
 * JD-Core Version:    0.6.2
 */
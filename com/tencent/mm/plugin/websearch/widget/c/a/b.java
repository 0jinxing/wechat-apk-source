package com.tencent.mm.plugin.websearch.widget.c.a;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.o;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static List<a> udy;

  static
  {
    AppMethodBeat.i(91464);
    ArrayList localArrayList = new ArrayList();
    udy = localArrayList;
    localArrayList.add(new c());
    udy.add(new d());
    AppMethodBeat.o(91464);
  }

  public static boolean a(String paramString1, r paramr, String paramString2, WidgetData paramWidgetData)
  {
    AppMethodBeat.i(91463);
    ab.i("OpenAppHandler", "handle url %s", new Object[] { paramString1 });
    Iterator localIterator = udy.iterator();
    Object localObject;
    boolean bool;
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if ((localObject != null) && (((a)localObject).adV(paramString1)))
        if (((a)localObject).lO(paramWidgetData.ubs.ubC))
        {
          if (((a)localObject).adW(paramString1))
            if ((localObject instanceof d))
            {
              paramr = new o();
              paramr.cWq = 2L;
              paramString1 = paramr.eK(paramString1).eJ(paramWidgetData.query).Fp().eH(paramWidgetData.ubs.hlm);
              paramString1.cWt = paramWidgetData.ubs.fmr;
              paramString1.eI(paramWidgetData.ubv).ajK();
              AppMethodBeat.o(91463);
            }
        }
        else
          for (bool = true; ; bool = true)
          {
            return bool;
            if (!(localObject instanceof c))
              break;
            paramr = new o();
            paramr.cWq = 3L;
            paramString1 = paramr.eK(paramString1).eJ(paramWidgetData.query).Fp().eH(paramWidgetData.ubs.hlm);
            paramString1.cWt = paramWidgetData.ubs.fmr;
            paramString1.eI(paramWidgetData.ubv).ajK();
            break;
            com.tencent.mm.plugin.websearch.widget.c.c.c(paramWidgetData.ubs.fpS, "openApp", new String[] { paramString1 });
            paramr.g(paramString2, paramString1, "", -1);
            AppMethodBeat.o(91463);
          }
    }
    if ((!TextUtils.isEmpty(paramString1)) && (paramString1.startsWith("open_target_weapp://")))
      if (com.tencent.mm.plugin.websearch.widget.c.c.H(paramWidgetData.ubs.ubC, 2))
      {
        localObject = Uri.parse(paramString1);
        paramWidgetData = ((Uri)localObject).getQueryParameter("path");
        paramString1 = ((Uri)localObject).getQueryParameter("origin_id");
        localObject = ((Uri)localObject).getQueryParameter("debug_mode");
        if (TextUtils.isEmpty((CharSequence)localObject))
          break label448;
      }
    label448: for (int i = bo.ank((String)localObject); ; i = -1)
    {
      paramr.g(paramString2, paramWidgetData, paramString1 + "@app", i);
      while (true)
      {
        AppMethodBeat.o(91463);
        bool = false;
        break;
        com.tencent.mm.plugin.websearch.widget.c.c.c(paramWidgetData.ubs.fpS, "openApp", new String[] { paramString1 });
        paramr.g(paramString2, paramString1, "", -1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.c.a.b
 * JD-Core Version:    0.6.2
 */
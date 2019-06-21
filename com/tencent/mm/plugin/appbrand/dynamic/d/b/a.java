package com.tencent.mm.plugin.appbrand.dynamic.d.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.dynamic.d.b.a.b;
import com.tencent.mm.plugin.appbrand.dynamic.d.b.a.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public final class a
{
  private static Map<String, Map<Integer, com.tencent.mm.plugin.appbrand.dynamic.d.b.a.e>> hnt;
  private static final Pattern hnu;

  static
  {
    AppMethodBeat.i(10881);
    hnu = Pattern.compile("(\\{\"method\":\"drawImage\",\"data\":\\[\"undefined\".*?\\})|(\\{\"method\":\"fillText\",\"data\":[^\\}]*?undefined.[^\\}]*?\\]\\})|(\\{\"method\":\"strokeText\",\"data\":[^\\}]*?undefined.[^\\}]*?\\]\\})");
    AppMethodBeat.o(10881);
  }

  public static void Ah(String paramString)
  {
    AppMethodBeat.i(10879);
    if (hnt == null)
      AppMethodBeat.o(10879);
    while (true)
    {
      return;
      Map localMap = (Map)hnt.get(paramString);
      if (localMap != null)
      {
        paramString = localMap.values().iterator();
        while (paramString.hasNext())
          ((com.tencent.mm.plugin.appbrand.dynamic.d.b.a.e)paramString.next()).reset();
        localMap.clear();
      }
      AppMethodBeat.o(10879);
    }
  }

  public static void bN(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10880);
    if (TextUtils.isEmpty(paramString2))
      AppMethodBeat.o(10880);
    while (true)
    {
      return;
      com.tencent.mm.sdk.g.d.xDG.b(new a.1(paramString2, paramString1), "onDrawFrame");
      AppMethodBeat.o(10880);
    }
  }

  public static com.tencent.mm.plugin.appbrand.dynamic.d.b.a.e bb(String paramString, int paramInt)
  {
    AppMethodBeat.i(10878);
    if (hnt == null)
    {
      localObject = new HashMap();
      hnt = (Map)localObject;
      ((Map)localObject).put(paramString, new HashMap());
    }
    Object localObject = (Map)hnt.get(paramString);
    if (localObject == null)
    {
      localObject = new HashMap();
      hnt.put(paramString, localObject);
    }
    while (true)
    {
      com.tencent.mm.plugin.appbrand.dynamic.d.b.a.e locale = (com.tencent.mm.plugin.appbrand.dynamic.d.b.a.e)((Map)localObject).get(Integer.valueOf(paramInt));
      paramString = locale;
      if (locale == null)
        switch (paramInt)
        {
        default:
          paramString = new c();
        case 1:
        case 2:
        case 0:
        }
      while (true)
      {
        ((Map)localObject).put(Integer.valueOf(paramInt), paramString);
        AppMethodBeat.o(10878);
        return paramString;
        paramString = new b();
        continue;
        paramString = new c();
        continue;
        paramString = new com.tencent.mm.plugin.appbrand.dynamic.d.b.a.d();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.luggage.d;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.luggage.bridge.o;
import com.tencent.luggage.g.d;
import com.tencent.luggage.webview.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class m
{
  private static ConcurrentHashMap<Integer, k> bPM;

  static
  {
    AppMethodBeat.i(90840);
    bPM = new ConcurrentHashMap();
    AppMethodBeat.o(90840);
  }

  public static k a(Context paramContext, Integer paramInteger)
  {
    AppMethodBeat.i(90838);
    if ((paramInteger == null) || (!bPM.containsKey(paramInteger)))
    {
      paramContext = null;
      AppMethodBeat.o(90838);
    }
    while (true)
    {
      return paramContext;
      paramInteger = (k)bPM.remove(paramInteger);
      paramInteger.setContext(paramContext);
      paramInteger.xq();
      d.i(m.class.getSimpleName(), "retrieve, holding size: %d", new Object[] { Integer.valueOf(bPM.size()) });
      AppMethodBeat.o(90838);
      paramContext = paramInteger;
    }
  }

  public static Integer a(Context paramContext, k paramk)
  {
    AppMethodBeat.i(90837);
    paramk.setContext(paramContext);
    paramContext = paramk.bPF.keySet().iterator();
    while (paramContext.hasNext())
    {
      o localo = paramk.bOA;
      String str = (String)paramContext.next();
      localo.bOJ.remove(str);
    }
    paramk.bPF.clear();
    paramk.bPz = null;
    paramk.bPC = null;
    paramk.bPB = true;
    bPM.put(Integer.valueOf(paramk.hashCode()), paramk);
    d.i(m.class.getSimpleName(), "stash, holding size: %d", new Object[] { Integer.valueOf(bPM.size()) });
    int i = paramk.hashCode();
    AppMethodBeat.o(90837);
    return Integer.valueOf(i);
  }

  public static Integer a(Context paramContext, Class<? extends a> paramClass)
  {
    AppMethodBeat.i(90836);
    paramContext = new k(paramContext, paramClass);
    if (!TextUtils.isEmpty(null))
      paramContext.loadUrl(null);
    bPM.put(Integer.valueOf(paramContext.hashCode()), paramContext);
    d.i(m.class.getSimpleName(), "preload, url: %s, holding size: %d", new Object[] { null, Integer.valueOf(bPM.size()) });
    int i = paramContext.hashCode();
    AppMethodBeat.o(90836);
    return Integer.valueOf(i);
  }

  public static k b(Integer paramInteger)
  {
    AppMethodBeat.i(90839);
    if ((paramInteger == null) || (!bPM.containsKey(paramInteger)))
    {
      paramInteger = null;
      AppMethodBeat.o(90839);
    }
    while (true)
    {
      return paramInteger;
      paramInteger = (k)bPM.remove(paramInteger);
      paramInteger.xq();
      AppMethodBeat.o(90839);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.m
 * JD-Core Version:    0.6.2
 */
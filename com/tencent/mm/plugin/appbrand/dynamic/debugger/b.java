package com.tencent.mm.plugin.appbrand.dynamic.debugger;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.l.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static final Map<String, List<l.a>> eGg;
  private static final Map<String, DebuggerInfo> hmH;

  static
  {
    AppMethodBeat.i(10812);
    eGg = new ConcurrentHashMap();
    hmH = new ConcurrentHashMap();
    AppMethodBeat.o(10812);
  }

  public static DebuggerInfo Ad(String paramString)
  {
    AppMethodBeat.i(10807);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      AppMethodBeat.o(10807);
    }
    while (true)
    {
      return paramString;
      paramString = (DebuggerInfo)hmH.get(paramString);
      AppMethodBeat.o(10807);
    }
  }

  public static void I(String paramString, int paramInt)
  {
    AppMethodBeat.i(10811);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(10811);
    while (true)
    {
      return;
      paramString = (List)eGg.get(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(10811);
      }
      else
      {
        paramString = new LinkedList(paramString).iterator();
        while (paramString.hasNext())
          ((l.a)paramString.next()).kS(paramInt);
        AppMethodBeat.o(10811);
      }
    }
  }

  public static void a(String paramString, DebuggerInfo paramDebuggerInfo)
  {
    AppMethodBeat.i(10808);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(10808);
    while (true)
    {
      return;
      hmH.put(paramString, paramDebuggerInfo);
      AppMethodBeat.o(10808);
    }
  }

  public static boolean c(String paramString, l.a parama)
  {
    AppMethodBeat.i(10809);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (parama == null))
    {
      bool = false;
      AppMethodBeat.o(10809);
    }
    while (true)
    {
      return bool;
      Object localObject = (List)eGg.get(paramString);
      if (localObject == null)
      {
        localObject = new LinkedList();
        eGg.put(paramString, localObject);
        paramString = (String)localObject;
      }
      do
      {
        bool = paramString.add(parama);
        AppMethodBeat.o(10809);
        break;
        paramString = (String)localObject;
      }
      while (!((List)localObject).contains(parama));
      bool = true;
      AppMethodBeat.o(10809);
    }
  }

  public static boolean d(String paramString, l.a parama)
  {
    AppMethodBeat.i(10810);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (parama == null))
    {
      AppMethodBeat.o(10810);
      bool = false;
    }
    while (true)
    {
      return bool;
      List localList = (List)eGg.get(paramString);
      if (localList == null)
      {
        AppMethodBeat.o(10810);
        bool = false;
      }
      else
      {
        bool = localList.remove(parama);
        if (localList.isEmpty())
          eGg.remove(paramString);
        AppMethodBeat.o(10810);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.debugger.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.dynamic.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class a
{
  private static volatile a hoC;
  public Map<String, List<IPCDynamicPageView>> hoD;
  public Map<String, a.a> hoE;

  private a()
  {
    AppMethodBeat.i(10939);
    this.hoD = new ConcurrentHashMap();
    this.hoE = new ConcurrentHashMap();
    AppMethodBeat.o(10939);
  }

  public static a aAb()
  {
    AppMethodBeat.i(10940);
    if (hoC == null);
    try
    {
      if (hoC == null)
      {
        locala = new com/tencent/mm/plugin/appbrand/dynamic/h/a;
        locala.<init>();
        hoC = locala;
      }
      a locala = hoC;
      AppMethodBeat.o(10940);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(10940);
    }
  }

  private static IPCDynamicPageView aF(List<IPCDynamicPageView> paramList)
  {
    AppMethodBeat.i(10944);
    int i = 0;
    if (i < paramList.size())
      if (((IPCDynamicPageView)paramList.get(i)).isPaused())
      {
        paramList = (IPCDynamicPageView)paramList.remove(i);
        AppMethodBeat.o(10944);
      }
    while (true)
    {
      return paramList;
      i++;
      break;
      paramList = null;
      AppMethodBeat.o(10944);
    }
  }

  public final IPCDynamicPageView Ak(String paramString)
  {
    AppMethodBeat.i(10941);
    if (paramString == null)
    {
      AppMethodBeat.o(10941);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Object localObject;
      do
      {
        Iterator localIterator1 = this.hoD.entrySet().iterator();
        Iterator localIterator2;
        while (!localIterator2.hasNext())
        {
          do
          {
            if (!localIterator1.hasNext())
              break;
            localObject = (Map.Entry)localIterator1.next();
          }
          while (((Map.Entry)localObject).getValue() == null);
          localIterator2 = ((List)((Map.Entry)localObject).getValue()).iterator();
        }
        localObject = (IPCDynamicPageView)localIterator2.next();
      }
      while ((((IPCDynamicPageView)localObject).getExtId() == null) || (!((IPCDynamicPageView)localObject).getExtId().equals(paramString)));
      AppMethodBeat.o(10941);
      paramString = (String)localObject;
      continue;
      AppMethodBeat.o(10941);
      paramString = null;
    }
  }

  public final boolean b(String paramString, IPCDynamicPageView paramIPCDynamicPageView)
  {
    AppMethodBeat.i(10942);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0) || (paramIPCDynamicPageView == null))
    {
      AppMethodBeat.o(10942);
      bool = false;
    }
    while (true)
    {
      return bool;
      List localList = (List)this.hoD.get(paramString);
      if (localList == null)
      {
        AppMethodBeat.o(10942);
        bool = false;
      }
      else
      {
        try
        {
          bool = localList.remove(paramIPCDynamicPageView);
          if (localList.isEmpty())
            this.hoD.remove(paramString);
          AppMethodBeat.o(10942);
        }
        finally
        {
          AppMethodBeat.o(10942);
        }
      }
    }
    throw paramString;
  }

  public final boolean c(String paramString, IPCDynamicPageView paramIPCDynamicPageView)
  {
    AppMethodBeat.i(10943);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0) || (paramIPCDynamicPageView == null))
    {
      bool = false;
      AppMethodBeat.o(10943);
      return bool;
    }
    Object localObject = (List)this.hoD.get(paramString);
    if (localObject == null)
    {
      localObject = new LinkedList();
      this.hoD.put(paramString, localObject);
    }
    while (true)
      while (true)
      {
        while (true)
          if (((List)localObject).contains(paramIPCDynamicPageView))
            try
            {
              ((List)localObject).remove(paramIPCDynamicPageView);
              ((List)localObject).add(paramIPCDynamicPageView);
              bool = true;
              AppMethodBeat.o(10943);
              break;
            }
            finally
            {
              AppMethodBeat.o(10943);
            }
        bool = ((List)localObject).add(paramIPCDynamicPageView);
        if (((List)localObject).size() > 4);
        try
        {
          if (((List)localObject).size() > 4)
          {
            paramIPCDynamicPageView = aF((List)localObject);
            if (paramIPCDynamicPageView != null)
            {
              a.a locala = (a.a)this.hoE.get(paramString);
              if (locala != null)
                locala.a(paramString, paramIPCDynamicPageView);
            }
          }
          AppMethodBeat.o(10943);
          break;
        }
        finally
        {
          AppMethodBeat.o(10943);
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.a
 * JD-Core Version:    0.6.2
 */
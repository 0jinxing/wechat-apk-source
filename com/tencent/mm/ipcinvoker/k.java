package com.tencent.mm.ipcinvoker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c.a;
import com.tencent.mm.ipcinvoker.extension.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class k
{
  private static final Map<String, e> eGg;

  static
  {
    AppMethodBeat.i(114048);
    eGg = new ConcurrentHashMap();
    AppMethodBeat.o(114048);
  }

  public static <T> T b(String paramString, Class<?> paramClass)
  {
    AppMethodBeat.i(114045);
    try
    {
      Class localClass = Class.forName(paramString);
      if (!paramClass.isAssignableFrom(localClass))
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ObjectStore", "%s isAssignableFrom %s return false", new Object[] { paramClass, localClass });
        AppMethodBeat.o(114045);
        paramString = null;
      }
      while (true)
      {
        return paramString;
        if (localClass.isAnnotationPresent(a.class))
        {
          e locale = (e)eGg.get(paramString);
          paramClass = locale;
          if (locale == null)
          {
            paramClass = new com/tencent/mm/ipcinvoker/extension/e;
            paramClass.<init>(localClass);
            eGg.put(paramString, paramClass);
          }
          paramString = paramClass.get();
          AppMethodBeat.o(114045);
        }
        else
        {
          paramString = com.tencent.mm.ipcinvoker.g.b.c(paramString, paramClass);
          AppMethodBeat.o(114045);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        AppMethodBeat.o(114045);
        paramString = null;
      }
    }
  }

  public static <T> T c(String paramString, Class<?> paramClass)
  {
    AppMethodBeat.i(114047);
    paramString = com.tencent.mm.ipcinvoker.g.b.c(paramString, paramClass);
    AppMethodBeat.o(114047);
    return paramString;
  }

  public static <T> T i(Class<?> paramClass1, Class<?> paramClass2)
  {
    AppMethodBeat.i(114046);
    try
    {
      if (!paramClass2.isAssignableFrom(paramClass1))
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ObjectStore", "%s isAssignableFrom %s return false", new Object[] { paramClass2, paramClass1 });
        AppMethodBeat.o(114046);
        paramClass1 = null;
      }
      while (true)
      {
        return paramClass1;
        if (paramClass1.isAnnotationPresent(a.class))
        {
          String str = paramClass1.getName();
          e locale = (e)eGg.get(str);
          paramClass2 = locale;
          if (locale == null)
          {
            paramClass2 = new com/tencent/mm/ipcinvoker/extension/e;
            paramClass2.<init>(paramClass1);
            eGg.put(str, paramClass2);
          }
          paramClass1 = paramClass2.get();
          AppMethodBeat.o(114046);
        }
        else
        {
          paramClass1 = com.tencent.mm.ipcinvoker.g.b.j(paramClass1, paramClass2);
          AppMethodBeat.o(114046);
        }
      }
    }
    catch (Exception paramClass1)
    {
      while (true)
      {
        AppMethodBeat.o(114046);
        paramClass1 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.k
 * JD-Core Version:    0.6.2
 */
package com.tencent.luggage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

public final class e
{
  private static LinkedHashMap<String, c> bOc;
  private static Map<Class<? extends d>, Object> bOd;

  static
  {
    AppMethodBeat.i(90711);
    bOc = new LinkedHashMap();
    a locala = new a();
    com.tencent.luggage.g.d.i("Luggage.Luggage", "plugin:[%s] installed", new Object[] { locala.getName() });
    bOc.put(locala.getName(), locala);
    bOd = new HashMap();
    AppMethodBeat.o(90711);
  }

  public static <T extends b> T B(Class<T> paramClass)
  {
    AppMethodBeat.i(90707);
    if (paramClass == null)
    {
      AppMethodBeat.o(90707);
      paramClass = null;
    }
    while (true)
    {
      return paramClass;
      ListIterator localListIterator = new ArrayList(bOc.values()).listIterator(bOc.size());
      while (true)
        if (localListIterator.hasPrevious())
        {
          c localc = (c)localListIterator.previous();
          if ((localc != null) && (localc.wH() != null) && (localc.wH().get(paramClass) != null))
          {
            paramClass = (b)localc.wH().get(paramClass);
            AppMethodBeat.o(90707);
            break;
          }
        }
      com.tencent.luggage.g.d.w("Luggage.Luggage", "no customize found for [%s]", new Object[] { paramClass.getCanonicalName() });
      AppMethodBeat.o(90707);
      paramClass = null;
    }
  }

  public static <T extends d> T C(Class<T> paramClass)
  {
    AppMethodBeat.i(90710);
    Object localObject = new ArrayList(bOc.values()).listIterator(bOc.size());
    while (((ListIterator)localObject).hasPrevious())
    {
      c localc = (c)((ListIterator)localObject).previous();
      if ((localc != null) && (localc.wI() != null) && (localc.wI().get(paramClass) != null))
      {
        paramClass = (d)localc.wI().get(paramClass);
        AppMethodBeat.o(90710);
      }
    }
    while (true)
    {
      return paramClass;
      com.tencent.luggage.g.d.w("Luggage.Luggage", "no profiler found for [%s], genDummy[%b]", new Object[] { paramClass.getCanonicalName(), Boolean.TRUE });
      if (bOd.get(paramClass) != null)
      {
        paramClass = (d)bOd.get(paramClass);
        AppMethodBeat.o(90710);
      }
      else
      {
        localObject = new e.1();
        localObject = (d)Proxy.newProxyInstance(d.class.getClassLoader(), new Class[] { paramClass }, (InvocationHandler)localObject);
        bOd.put(paramClass, localObject);
        AppMethodBeat.o(90710);
        paramClass = (Class<T>)localObject;
      }
    }
  }

  public static <T extends b> void a(Class<T> paramClass, T paramT)
  {
    AppMethodBeat.i(90708);
    if ((paramClass == null) || (paramT == null))
      AppMethodBeat.o(90708);
    while (true)
    {
      return;
      ((c)bOc.get("luggage-core")).wH().put(paramClass, paramT);
      AppMethodBeat.o(90708);
    }
  }

  public static <T extends d> void a(Class<T> paramClass, T paramT)
  {
    AppMethodBeat.i(90709);
    if ((paramClass == null) || (paramT == null))
      AppMethodBeat.o(90709);
    while (true)
    {
      return;
      ((c)bOc.get("luggage-core")).wI().put(paramClass, paramT);
      AppMethodBeat.o(90709);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.a.e
 * JD-Core Version:    0.6.2
 */
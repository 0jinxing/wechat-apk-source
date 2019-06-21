package com.tencent.mm.plugin.expt.hellhound.core.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public final class a
{
  private static Object lMl = null;
  private static Class<?> lMm = null;
  private static Handler lMn = null;

  private static void a(Class<?> paramClass, HashSet<Class<?>> paramHashSet)
  {
    AppMethodBeat.i(73351);
    while (paramClass != null)
    {
      for (Class localClass : paramClass.getInterfaces())
        if (paramHashSet.add(localClass))
          a(localClass, paramHashSet);
      paramClass = paramClass.getSuperclass();
    }
    AppMethodBeat.o(73351);
  }

  public static List<Class<?>> ap(Class<?> paramClass)
  {
    AppMethodBeat.i(73350);
    if (paramClass == null)
    {
      paramClass = null;
      AppMethodBeat.o(73350);
    }
    while (true)
    {
      return paramClass;
      LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      a(paramClass, localLinkedHashSet);
      paramClass = new ArrayList(localLinkedHashSet);
      AppMethodBeat.o(73350);
    }
  }

  private static void bqp()
  {
    AppMethodBeat.i(73347);
    if (lMl == null);
    while (true)
    {
      try
      {
        Object localObject = Class.forName("android.app.ActivityThread");
        lMm = (Class)localObject;
        localObject = ((Class)localObject).getDeclaredMethod("currentActivityThread", new Class[0]);
        ((Method)localObject).setAccessible(true);
        lMl = ((Method)localObject).invoke(null, new Object[0]);
        AppMethodBeat.o(73347);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("HellReflector", localException, "habbyge-mali, ActivityThreadReflect", new Object[0]);
        h.pYm.a(932L, 2L, 1L, false);
      }
      AppMethodBeat.o(73347);
    }
  }

  public static Object bqq()
  {
    AppMethodBeat.i(73348);
    bqp();
    Object localObject = lMl;
    AppMethodBeat.o(73348);
    return localObject;
  }

  public static Class<?> bqr()
  {
    AppMethodBeat.i(73349);
    bqp();
    Class localClass = lMm;
    AppMethodBeat.o(73349);
    return localClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.a.a
 * JD-Core Version:    0.6.2
 */
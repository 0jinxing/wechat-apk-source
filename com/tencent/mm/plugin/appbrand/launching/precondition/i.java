package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class i
{
  static int ijV = 112;
  private static Object ijW;
  private static Handler ijX;

  private static Handler bx(Object paramObject)
  {
    AppMethodBeat.i(132079);
    if (ijX != null)
    {
      paramObject = ijX;
      AppMethodBeat.o(132079);
    }
    while (true)
    {
      return paramObject;
      Field localField = paramObject.getClass().getDeclaredField("mH");
      localField.setAccessible(true);
      paramObject = (Handler)localField.get(paramObject);
      ijX = paramObject;
      AppMethodBeat.o(132079);
    }
  }

  public static void cR(Context paramContext)
  {
    AppMethodBeat.i(132078);
    try
    {
      Handler localHandler = bx(cS(paramContext));
      paramContext = localHandler.getClass().getDeclaredField("NEW_INTENT");
      paramContext.setAccessible(true);
      ijV = ((Integer)paramContext.get(localHandler)).intValue();
      AppMethodBeat.o(132078);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.PreconditionActivityThreadHack", paramContext, "hack constants in ActivityThread$H", new Object[0]);
        AppMethodBeat.o(132078);
      }
    }
  }

  private static Object cS(Context paramContext)
  {
    AppMethodBeat.i(132080);
    if (ijW != null)
    {
      paramContext = ijW;
      AppMethodBeat.o(132080);
    }
    while (true)
    {
      return paramContext;
      Object localObject = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
      ((Method)localObject).setAccessible(true);
      localObject = ((Method)localObject).invoke(null, new Object[0]);
      if (localObject != null)
      {
        ijW = localObject;
        AppMethodBeat.o(132080);
        paramContext = (Context)localObject;
      }
      else
      {
        localObject = paramContext.getClass().getField("mLoadedApk");
        ((Field)localObject).setAccessible(true);
        localObject = ((Field)localObject).get(paramContext);
        paramContext = localObject.getClass().getDeclaredField("mActivityThread");
        paramContext.setAccessible(true);
        paramContext = paramContext.get(localObject);
        ijW = paramContext;
        AppMethodBeat.o(132080);
      }
    }
  }

  static boolean pb(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(132081);
    try
    {
      Handler localHandler = bx(cS(ah.getContext()));
      if (localHandler == null)
      {
        AppMethodBeat.o(132081);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.PreconditionActivityThreadHack", localException, "hasPendingMessageInQueue, hack mH", new Object[0]);
        Object localObject = null;
        continue;
        bool = localObject.hasMessages(paramInt);
        AppMethodBeat.o(132081);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.i
 * JD-Core Version:    0.6.2
 */
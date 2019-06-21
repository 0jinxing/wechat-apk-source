package com.tencent.c.a.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public class p
{
  private static volatile p cbH = null;
  private boolean cbI;
  private Context context;

  private p(Context paramContext)
  {
    AppMethodBeat.i(125722);
    this.context = null;
    this.cbI = false;
    this.context = paramContext.getApplicationContext();
    this.cbI = s.q(this.context, "android.permission.WRITE_SETTINGS");
    if (Build.VERSION.SDK_INT >= 23);
    while (true)
    {
      try
      {
        paramContext = Settings.System.class.getDeclaredMethod("canWrite", new Class[] { Context.class });
        paramContext.setAccessible(true);
        this.cbI = ((Boolean)paramContext.invoke(null, new Object[] { this.context })).booleanValue();
        AppMethodBeat.o(125722);
        return;
      }
      catch (Exception paramContext)
      {
      }
      AppMethodBeat.o(125722);
    }
  }

  public static p aH(Context paramContext)
  {
    AppMethodBeat.i(125723);
    if (cbH == null);
    try
    {
      if (cbH == null)
      {
        p localp = new com/tencent/c/a/a/p;
        localp.<init>(paramContext);
        cbH = localp;
      }
      paramContext = cbH;
      AppMethodBeat.o(125723);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(125723);
    }
    throw paramContext;
  }

  public final boolean u(String paramString1, String paramString2)
  {
    AppMethodBeat.i(125721);
    if (this.cbI);
    while (true)
    {
      try
      {
        bool = Settings.System.putString(this.context.getContentResolver(), paramString1, paramString2);
        AppMethodBeat.o(125721);
        return bool;
      }
      catch (Exception paramString1)
      {
      }
      boolean bool = false;
      AppMethodBeat.o(125721);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.p
 * JD-Core Version:    0.6.2
 */
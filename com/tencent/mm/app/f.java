package com.tencent.mm.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  public static int aV(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(115028);
    if (paramContext == null)
      AppMethodBeat.o(115028);
    while (true)
    {
      return i;
      try
      {
        int j = paramContext.getSharedPreferences("crash_status_file", 4).getInt("channel", -1);
        i = j;
        AppMethodBeat.o(115028);
      }
      catch (Throwable paramContext)
      {
        AppMethodBeat.o(115028);
      }
    }
  }

  public static int aW(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(115029);
    int j;
    if (paramContext == null)
    {
      AppMethodBeat.o(115029);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        j = paramContext.getSharedPreferences("crash_status_file", 4).getInt("googleplaysizelimit", 3072);
        AppMethodBeat.o(115029);
      }
      catch (Throwable paramContext)
      {
        AppMethodBeat.o(115029);
        j = i;
      }
    }
  }

  public static void e(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(115030);
    try
    {
      Object localObject = paramContext.getSharedPreferences("crash_status_file", 4);
      paramContext = ((SharedPreferences)localObject).getString("crashlist", "");
      localObject = ((SharedPreferences)localObject).edit();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      ((SharedPreferences.Editor)localObject).putString("crashlist", paramContext + ";" + paramString1 + "," + paramString2);
      ((SharedPreferences.Editor)localObject).commit();
      AppMethodBeat.o(115030);
      return;
    }
    catch (Throwable paramContext)
    {
      while (true)
        AppMethodBeat.o(115030);
    }
  }

  public static abstract interface a
  {
    public abstract void gj(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.f
 * JD-Core Version:    0.6.2
 */
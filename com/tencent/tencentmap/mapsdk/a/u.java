package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class u extends s
{
  private static Map<String, s> b;

  static
  {
    AppMethodBeat.i(98282);
    b = new HashMap();
    AppMethodBeat.o(98282);
  }

  private u(Context paramContext, String paramString)
  {
    AppMethodBeat.i(98279);
    this.a = paramContext.getSharedPreferences("Tencent_MapSDK_SUB_CONFIG_".concat(String.valueOf(paramString)), 0);
    AppMethodBeat.o(98279);
  }

  public static s a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(98278);
    if (StringUtil.isEmpty(paramString))
    {
      paramContext = w.a(paramContext);
      AppMethodBeat.o(98278);
    }
    while (true)
    {
      return paramContext;
      if (b.get(paramString) == null);
      try
      {
        if (b.get(paramString) == null)
        {
          u localu = new com/tencent/tencentmap/mapsdk/a/u;
          localu.<init>(paramContext, paramString);
          b.put(paramString, localu);
          AppMethodBeat.o(98278);
          paramContext = localu;
        }
        else
        {
          paramContext = (s)b.get(paramString);
          AppMethodBeat.o(98278);
        }
      }
      finally
      {
        AppMethodBeat.o(98278);
      }
    }
    throw paramContext;
  }

  public static void a(Context paramContext)
  {
    AppMethodBeat.i(98280);
    try
    {
      File localFile = new java/io/File;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localFile.<init>(paramContext.getFilesDir().getParent() + File.separator + "shared_prefs");
      for (localStringBuilder : localFile.listFiles())
        if (localStringBuilder.getName().startsWith("Tencent_MapSDK_SUB_CONFIG"))
          localStringBuilder.delete();
      AppMethodBeat.o(98280);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        AppMethodBeat.o(98280);
    }
  }

  public static void c()
  {
    AppMethodBeat.i(98281);
    if (b != null)
      b.clear();
    AppMethodBeat.o(98281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.u
 * JD-Core Version:    0.6.2
 */
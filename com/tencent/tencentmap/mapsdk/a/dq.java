package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.an;
import com.tencent.tencentmap.mapsdk.maps.a.hs;
import com.tencent.tencentmap.mapsdk.maps.a.ic;

public class dq
{
  public static void a()
  {
  }

  public static void a(Context paramContext)
  {
    AppMethodBeat.i(101103);
    Context localContext = paramContext;
    if (paramContext != null)
      localContext = paramContext.getApplicationContext();
    try
    {
      an.a(false, false);
      an.b(hs.c());
      an.a("4.2.2");
      an.a(localContext);
      if (!StringUtil.isEmpty(ic.a))
        an.c(Integer.toString(ic.a.hashCode()));
      AppMethodBeat.o(101103);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        AppMethodBeat.o(101103);
    }
    catch (Error paramContext)
    {
      while (true)
        AppMethodBeat.o(101103);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dq
 * JD-Core Version:    0.6.2
 */
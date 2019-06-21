package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  private static Map<String, Bundle> jUF;

  static
  {
    AppMethodBeat.i(14424);
    jUF = new HashMap();
    AppMethodBeat.o(14424);
  }

  public static Bundle FZ(String paramString)
  {
    AppMethodBeat.i(14421);
    paramString = Ga(paramString);
    if (jUF.containsKey(paramString))
    {
      paramString = (Bundle)jUF.get(paramString);
      AppMethodBeat.o(14421);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(14421);
    }
  }

  private static String Ga(String paramString)
  {
    AppMethodBeat.i(14423);
    int i = paramString.indexOf("?");
    if (i < 0)
      AppMethodBeat.o(14423);
    while (true)
    {
      return paramString;
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(14423);
    }
  }

  public static void m(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(14422);
    if (paramString == null)
      AppMethodBeat.o(14422);
    while (true)
    {
      return;
      jUF.put(Ga(paramString), paramBundle);
      AppMethodBeat.o(14422);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.dynamic.debugger;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.d.c;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.plugin.appbrand.wxawidget.console.b;
import com.tencent.mm.z.c.e.a;
import java.util.ArrayList;

public final class a
{
  private static e.a hmG;

  static
  {
    AppMethodBeat.i(10806);
    hmG = new a.1();
    AppMethodBeat.o(10806);
  }

  public static e.a azQ()
  {
    return hmG;
  }

  public static void c(String paramString, ArrayList<LogInfo> paramArrayList)
  {
    AppMethodBeat.i(10805);
    Bundle localBundle = new Bundle();
    localBundle.putString("id", paramString);
    localBundle.putParcelableArrayList("logList", paramArrayList);
    paramString = b.jpG;
    c.PT().k(paramString.getClass().getName(), localBundle);
    AppMethodBeat.o(10805);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.debugger.a
 * JD-Core Version:    0.6.2
 */
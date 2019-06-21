package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.a;
import com.tencent.mm.ipcinvoker.c;

class a$b
  implements a<Bundle, Bundle>
{
  private static final String[] hmL = { "scope.userLocation" };

  private static void a(c<Bundle> paramc, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(10821);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("ret", paramBoolean);
    localBundle.putString("reason", paramString);
    paramc.ao(localBundle);
    AppMethodBeat.o(10821);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.a.b
 * JD-Core Version:    0.6.2
 */
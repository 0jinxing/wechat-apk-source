package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;

final class b$3
  implements Runnable
{
  b$3(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10735);
    if (!com.tencent.mm.ipcinvoker.b.PL().le("com.tencent.mm:support"))
      AppMethodBeat.o(10735);
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("forceKillProcess", true);
      f.a("com.tencent.mm:support", localBundle, b.a.class, new b.3.1(this));
      AppMethodBeat.o(10735);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.b.3
 * JD-Core Version:    0.6.2
 */
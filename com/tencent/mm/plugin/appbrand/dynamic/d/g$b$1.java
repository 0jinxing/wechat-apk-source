package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.modelappbrand.t;

final class g$b$1
  implements t
{
  g$b$1(g.b paramb, Bundle paramBundle, c paramc)
  {
  }

  public final void b(boolean paramBoolean, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(10836);
    this.hmV.putBoolean("ret", paramBoolean);
    this.hmV.putString("reason", paramString);
    this.hmV.putBundle("data", paramBundle);
    this.eFW.ao(this.hmV);
    AppMethodBeat.o(10836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.g.b.1
 * JD-Core Version:    0.6.2
 */
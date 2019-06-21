package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.modelappbrand.t;

final class l$a$1
  implements t
{
  l$a$1(l.a parama, Bundle paramBundle, c paramc)
  {
  }

  public final void b(boolean paramBoolean, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(10854);
    this.hmV.putBoolean("ret", paramBoolean);
    this.hmV.putString("reason", paramString);
    this.hmV.putBundle("data", paramBundle);
    this.eFW.ao(this.hmV);
    AppMethodBeat.o(10854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.l.a.1
 * JD-Core Version:    0.6.2
 */
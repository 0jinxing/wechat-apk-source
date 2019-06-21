package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.os.Message;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.d.d;

final class l$2 extends c
{
  l$2(l paraml)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(93831);
    super.enter();
    ((a)e.B(a.class)).b("gcj02", this.hKZ.hKU, this.hKZ.fPq);
    if (this.hKZ.hKV != null)
      this.hKZ.hKV.Bb("StateListening");
    AppMethodBeat.o(93831);
  }

  public final void exit()
  {
    AppMethodBeat.i(93832);
    super.exit();
    ((a)e.B(a.class)).c("gcj02", this.hKZ.hKU, this.hKZ.fPq);
    AppMethodBeat.o(93832);
  }

  public final String getName()
  {
    AppMethodBeat.i(93830);
    String str = this.hKZ.mName + "$StateNotListening";
    AppMethodBeat.o(93830);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(93833);
    if (2 == paramMessage.what)
    {
      this.hKZ.b(this.hKZ.hKW);
      AppMethodBeat.o(93833);
    }
    while (true)
    {
      return bool;
      if (3 == paramMessage.what)
      {
        this.hKZ.b(this.hKZ.hKY);
        AppMethodBeat.o(93833);
      }
      else
      {
        bool = super.k(paramMessage);
        AppMethodBeat.o(93833);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.l.2
 * JD-Core Version:    0.6.2
 */
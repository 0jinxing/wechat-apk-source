package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.os.Message;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.d.d;

final class l$1 extends c
{
  l$1(l paraml)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(93829);
    super.enter();
    ((a)e.B(a.class)).c("gcj02", this.hKZ.hKU, this.hKZ.fPq);
    if (this.hKZ.hKV != null)
      this.hKZ.hKV.Bb("StateNotListening");
    AppMethodBeat.o(93829);
  }

  public final String getName()
  {
    AppMethodBeat.i(93827);
    String str = this.hKZ.mName + "$StateListening";
    AppMethodBeat.o(93827);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(93828);
    if (1 == paramMessage.what)
    {
      this.hKZ.b(this.hKZ.hKX);
      AppMethodBeat.o(93828);
    }
    while (true)
    {
      return bool;
      bool = super.k(paramMessage);
      AppMethodBeat.o(93828);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.l.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.d.d;

final class l$3 extends c
{
  l$3(l paraml)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(93836);
    super.enter();
    if (this.hKZ.hKV != null)
      this.hKZ.hKV.Bb("StateSuspend");
    AppMethodBeat.o(93836);
  }

  public final String getName()
  {
    AppMethodBeat.i(93834);
    String str = this.hKZ.mName + "$StateSuspend";
    AppMethodBeat.o(93834);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(93835);
    if (2 == paramMessage.what)
    {
      this.hKZ.b(this.hKZ.hKW);
      AppMethodBeat.o(93835);
    }
    while (true)
    {
      return bool;
      if (4 == paramMessage.what)
      {
        this.hKZ.b(this.hKZ.hKX);
        AppMethodBeat.o(93835);
      }
      else
      {
        bool = super.k(paramMessage);
        AppMethodBeat.o(93835);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.l.3
 * JD-Core Version:    0.6.2
 */
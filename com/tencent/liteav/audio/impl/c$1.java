package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66636);
    if (c.a(this.a) != null)
      AppMethodBeat.o(66636);
    while (true)
    {
      return;
      c.a(this.a, new c.1.1(this));
      ((TelephonyManager)c.b(this.a).getSystemService("phone")).listen(c.a(this.a), 32);
      AppMethodBeat.o(66636);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.c.1
 * JD-Core Version:    0.6.2
 */
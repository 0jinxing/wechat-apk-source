package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h extends Thread
{
  h(Context paramContext, String paramString, ValueCallback paramValueCallback)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63986);
    bv localbv = bv.a();
    localbv.a(this.a, null);
    boolean bool = false;
    if (localbv.b())
      bool = localbv.c().a(this.a, this.b);
    new Handler(Looper.getMainLooper()).post(new i(this, bool));
    AppMethodBeat.o(63986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.h
 * JD-Core Version:    0.6.2
 */
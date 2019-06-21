package com.tencent.magicbrush.d;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a
{
  private static final Handler sMainHandler;

  static
  {
    AppMethodBeat.i(116013);
    sMainHandler = new Handler(Looper.getMainLooper());
    AppMethodBeat.o(116013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.d.c.a
 * JD-Core Version:    0.6.2
 */